package com.example.admin.jewelry.homepage.integral;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.integral.adapter.JewelryAdapter;
import com.example.admin.jewelry.homepage.integral.bean.CategoryBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JINDAPENG on 2016/8/18.
 * 相关配品
 */
public class CorrelationActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private ImageView backImage;
    private ListView correlationListView;
    private JewelryAdapter jewelryAdapter;

    @Override
    public int setLayout() {
        return R.layout.activity_correlation_accesseries;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = bindView(R.id.correlation_accesseries_back_image);
        backImage.setOnClickListener(this);
        correlationListView = bindView(R.id.correlation_listview);
        correlationListView.setOnItemClickListener(this);

    }

    @Override
    protected void initData() {
        jewelryAdapter = new JewelryAdapter(this);

        Map<String, String> maps = new HashMap<>();
        maps.put("category_id","2");
        maps.put("currentPage", "1");
        maps.put("pageNumber", "20");
        String url = "http://192.168.31.10:8081/boastJewelry/scoreMall/goods/query.do";
        OkHttpClientManager.postAsyn(url, new OkHttpClientManager.ResultCallback<CategoryBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Log.d("---------", "onErrorResponse: " + e);
            }

            @Override
            public void onResponse(CategoryBean response) {
                jewelryAdapter.setCategoryBean(response);
                Log.d("---------", "response: " + response);

            }
        });

        correlationListView.setAdapter(jewelryAdapter);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.correlation_accesseries_back_image:
                finish();
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
