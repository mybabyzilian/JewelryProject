package com.example.admin.jewelry.homepage.hot_activity;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by JINDAPENG on 2016/8/22.
 * 热门活动
 */
public class HotActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private ListView listView;
    private ImageView backImage;
    private HotAdapter hotAdapter;
    private HotBean hotBean;

    @Override
    public int setLayout() {
        return R.layout.activity_hot;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = bindView(R.id.hot_back_image);
        backImage.setOnClickListener(this);
        listView = bindView(R.id.hot_list_view);
        listView.setOnItemClickListener(this);

    }

    @Override
    protected void initData() {
        hotAdapter = new HotAdapter(this);
        String url = "http://192.168.31.10:8081/boastJewelry/s_activity/query.do";
        Map<String, String> maps = new HashMap<>();
        maps.put("currentPage", "1");

        OkHttpClientManager.postAsyn(url, new OkHttpClientManager.ResultCallback<HotBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Log.d("url_++", "onError: " + e);
            }

            @Override
            public void onResponse(HotBean response) {
                hotBean = response;
                hotAdapter.setHotBean(hotBean);

            }
        },maps);

        listView.setAdapter(hotAdapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hot_back_image:
                finish();
                break;
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent intentItem = new Intent(this, DetailsCommodityActivity.class);
//        startActivity(intentItem);
    }
}