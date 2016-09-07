package com.example.admin.jewelry.homepage.integral;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.HomePageBannerBean;
import com.example.admin.jewelry.homepage.integral.adapter.IntegralStoreAdapter;
import com.example.admin.jewelry.homepage.integral.bean.ClassBean;
import com.example.admin.jewelry.homepage.integral.bean.HotExchangeBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    private ClassBean classBean;
    private ListView hotListView;
    private Banner banner;
    private List<String> bannerUrl;

    @Override
    public int setLayout() {
        return R.layout.activity_integral_store;
    }

    @Override
    protected void initView() {
        backImage = bindView(R.id.integral_back_image);
        backImage.setOnClickListener(this);
        banner = bindView(R.id.integral_store_banner);
        hotListView = bindView(R.id.hot_exchange_listview);
        hotListView.setOnItemClickListener(this);
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
    }

    @Override
    protected void initData() {
        bannerUrl = new ArrayList<>();
        OkHttpClientManager.postAsyn(Urls.HOME_PAGE_LUNBO_URL, new OkHttpClientManager.ResultCallback<HomePageBannerBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(HomePageBannerBean response) {
                for (int i = 0; i <response.getObject().getTops().size() ; i++) {
                    bannerUrl.add(response.getObject().getTops().get(i).getWeb_src());
                }
                banner.setImages(bannerUrl);
                banner.setDelayTime(3000);
                banner.setBannerStyle(Banner.ACCESSIBILITY_LIVE_REGION_ASSERTIVE);
            }
        });


//解析热门兑换数据
        integralStoreAdapter = new IntegralStoreAdapter(this);
        String url = "http://192.168.31.10:8081/boastJewelry/scoreMall/goods/two.do";
        Map<String, String> maps = new HashMap<>();
        maps.put("currentPage", "1");
        maps.put("pageNumber", "20");

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

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.integral_back_image:
                finish();
                break;
            case R.id.exchange_centre_rl:
                break;
            case R.id.jewelry_accessories_rl:
                classBean = new ClassBean();
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
        String entity_id = hotExchangeBean.getObject().getHotlist().get(position).getEntity_id();
        intentItem.putExtra("entity_id", entity_id);
        startActivity(intentItem);

    }
}
