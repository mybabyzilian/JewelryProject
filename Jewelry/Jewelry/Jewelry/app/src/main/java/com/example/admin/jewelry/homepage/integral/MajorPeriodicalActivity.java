package com.example.admin.jewelry.homepage.integral;

import android.content.Intent;
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
 * 专业刊物
 */
public class MajorPeriodicalActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private ImageView backImage;
    private ListView majorListView;
    private JewelryAdapter jewelryAdapter;
    private CategoryBean categoryBean;

    @Override
    public int setLayout() {
        return R.layout.activity_major_periodical;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = bindView(R.id.major_periodical_back_image);
        backImage.setOnClickListener(this);
        majorListView = bindView(R.id.major_periodical_listview);
        majorListView.setOnItemClickListener(this);
    }

    @Override
    protected void initData() {
        jewelryAdapter = new JewelryAdapter(this);

        Map<String, String> maps = new HashMap<>();
        maps.put("category_id", "3");
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
                categoryBean = response;
                Log.d("---------", "response: " + response);

            }
        },maps);

        majorListView.setAdapter(jewelryAdapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.major_periodical_back_image:
                finish();
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(this, DetailsCommodityActivity.class);
        String entity_id = categoryBean.getObject().getGoodslist().get(position).getEntity_id();
        intent.putExtra("entity_id", entity_id);
        startActivity(intent);
    }
}
