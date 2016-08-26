package com.example.admin.jewelry.homepage.integral;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.integral.adapter.HeadViewAdapter;
import com.example.admin.jewelry.homepage.integral.adapter.IntegralStoreAdapter;
import com.example.admin.jewelry.homepage.integral.bean.HeadViewBean;
import com.example.admin.jewelry.homepage.integral.bean.HotExchangeBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 积分商城
 */
public class IntegralStoreActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private RelativeLayout luckRl, exchangeRl, jewelryRl, correlationRl, majorRl;
    private ImageView backImage;
    private IntegralStoreAdapter integralStoreAdapter;
    private HotExchangeBean hotExchangeBean;
    private ListView hotListView;
    public ViewPager viewPager;
    private HeadViewAdapter headViewAdapter;
    private ArrayList<HeadViewBean.ObjectBean.AdvertlistBean> imageList;// 轮播图图片
    private LinearLayout pointRoot; // 装载轮播时小点的容器

    private Handler handler;// 轮播handler
    private Runnable rotateRunnable;// 轮播线程
    private boolean isRotate = false; // 是否轮播,默认false
    private static final int TIME = 3000;// 轮播间隔时间

//    private String[] imageUrls = {
//            "http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert01.jpg",
//            "http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert02.jpg",
//            "http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert03.jpg",
//            "http://192.168.31.110:8911/resources/boastjewelry/upload/admin/scoreMall/advert04.jpg"};

    @Override
    public int setLayout() {
        return R.layout.activity_integral_store;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = bindView(R.id.integral_back_image);
        backImage.setOnClickListener(this);
        hotListView = bindView(R.id.hot_exchange_listview);
        hotListView.setOnItemClickListener(this);

    }

    @Override
    protected void initData() {

        // 绑定头布局
        View headerView = LayoutInflater.from(this).inflate(R.layout.head_view, null);
        hotListView.addHeaderView(headerView);
        viewPager = (ViewPager) headerView.findViewById(R.id.my_viewpager);
        pointRoot = (LinearLayout) headerView.findViewById(R.id.point_container);// 将标示点绑到头布局

        headViewAdapter = new HeadViewAdapter(getBaseContext());

        String imageUrl = "http://192.168.31.10:8081/boastJewelry/scoreMall/goods/one.do";

        OkHttpClientManager.getAsyn(imageUrl, new OkHttpClientManager.ResultCallback<HeadViewBean.ObjectBean.AdvertlistBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Log.d("imageUrl", "onError: " + e);
            }

            @Override
            public void onResponse(HeadViewBean.ObjectBean.AdvertlistBean response) {
                Log.d("imageUrl", "response: " + response);
//                Gson gson = new Gson();
//                Type type = new TypeToken<ArrayList<HeadViewBean.ObjectBean.AdvertlistBean>>() {
//                }.getType();
//                imageList = gson.fromJson(String.valueOf(response), type);
                headViewAdapter.setImages(imageList);
                viewPager.setAdapter(headViewAdapter);

            }
        });


        viewPager.setCurrentItem(60);// 设置当前页位置
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < imageList.size(); i++) {
                    ImageView iv = (ImageView) pointRoot.getChildAt(i);
                    iv.setImageResource(R.drawable.shape_write);// 白色图片放入
                }
                ImageView iv = (ImageView) pointRoot.getChildAt(position % imageList.size());
                iv.setImageResource(R.drawable.shape_black);// 黑色图片放入
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        startRotate();

        luckRl = bindView(R.id.good_luck_rl);//幸运轮盘
        luckRl.setOnClickListener(this);
        exchangeRl = bindView(R.id.exchange_centre_rl);//兑换中心
        exchangeRl.setOnClickListener(this);
        jewelryRl = bindView(R.id.jewelry_accessories_rl);//珠宝饰品
        jewelryRl.setOnClickListener(this);
        correlationRl = bindView(R.id.correlation_accesseries_rl);//相关配品
        correlationRl.setOnClickListener(this);
        majorRl = bindView(R.id.major_periodical_rl);//专业刊物
        majorRl.setOnClickListener(this);

//解析热门兑换数据
        integralStoreAdapter = new IntegralStoreAdapter(this);
        String url = "http://192.168.31.10:8081/boastJewelry/scoreMall/goods/two.do";

        Map<String, String> maps = new HashMap<>();
        maps.put("currentPage", "1");
        maps.put("pageNumber", "");

        OkHttpClientManager.postAsyn(url, new OkHttpClientManager.ResultCallback<HotExchangeBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Log.d("url", "onError: " + e);
            }

            @Override
            public void onResponse(HotExchangeBean response) {
                hotExchangeBean = response;
                integralStoreAdapter.setHotExchangeBean(response);
                Log.d("url", "onResponse: " + response);
            }
        }, maps);

        hotListView.setAdapter(integralStoreAdapter);
    }

    /**
     * 开始轮播
     */
    protected void startRotate() {
        handler = new Handler();
        // 初始化线程对象
        rotateRunnable = new Runnable() {
            @Override
            public void run() {
                // 获得ViewPager当前页
                int nowIndex = viewPager.getCurrentItem();
                // 设置ViewPager的页数是当前页自增1
                // 这里要判断,轮播的下一张page不能超过viewpager的count
                // 否则会崩
                viewPager.setCurrentItem(++nowIndex);
                if (isRotate) {
                    // handler延时发送线程,实现轮播
                    handler.postDelayed(rotateRunnable, TIME);
                }
            }
        };
        handler.postDelayed(rotateRunnable, TIME);
    }

    /**
     * 添加轮播图小点
     */
    private void getPoint() {
        for (int i = 0; i < imageList.size(); i++) {
            ImageView pointIv = new ImageView(getBaseContext());
            pointIv.setPadding(5, 5, 5, 5);
            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(30, 30);// 设置小图标的宽高
            pointIv.setLayoutParams(lp);

            // 设置小点样式
            if (i == 0) {
                pointIv.setImageResource(R.drawable.shape_black);// 表示当前正在显示的页面
            } else {
                pointIv.setImageResource(R.drawable.shape_write);
            }
            pointRoot.addView(pointIv);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        isRotate = true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.integral_back_image:
                finish();
                break;
            case R.id.exchange_centre_rl:
                break;
            case R.id.jewelry_accessories_rl:
                Intent intentJewelry = new Intent(this, JewelryActivity.class);
                startActivity(intentJewelry);
                break;
            case R.id.correlation_accesseries_rl:
                Intent intentCorrelation = new Intent(this, CorrelationActivity.class);
                startActivity(intentCorrelation);
                break;
            case R.id.major_periodical_rl:
                Intent intentMajor = new Intent(this, MajorPeriodicalActivity.class);
                startActivity(intentMajor);
                break;

        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intentItem = new Intent(this, DetailsCommodityActivity.class);
        String entity_id = hotExchangeBean.getObject().getHotlist().get(position - 1).getEntity_id();
        intentItem.putExtra("entity_id", entity_id);
        startActivity(intentItem);

    }
}
