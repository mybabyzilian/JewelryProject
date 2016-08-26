package com.example.admin.jewelry.homepage.integral;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.integral.bean.DetailsBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JINDAPENG on 2016/8/19.
 * 热门兑换——商品详情
 */
public class DetailsCommodityActivity extends BaseActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private ImageView backImage;
    private TextView conversionBtn, titleTv, nameTv, inventoryTv, tradeTv, costTv, priceTv, describeTv;


    @Override
    public int setLayout() {
        return R.layout.activity_details_commodity;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = bindView(R.id.details_back_image);
        backImage.setOnClickListener(this);

        titleTv = bindView(R.id.details_title_tv);
        nameTv = bindView(R.id.details_name);
        inventoryTv = bindView(R.id.details_inventory);
        tradeTv = bindView(R.id.details_trade);
        costTv = bindView(R.id.details_original_cost);
        priceTv = bindView(R.id.details_current_price);
        describeTv = bindView(R.id.details_describe);

        conversionBtn = bindView(R.id.details_conversion_btn);
        conversionBtn.setOnClickListener(this);

        viewPager = bindView(R.id.my_viewpager);
    }

    @Override
    protected void initData() {
        Intent intent=getIntent();//getIntent将该项目中包含的原始intent检索出来，将检索出来的intent赋值给一个Intent类型的变量intent
        Bundle bundle=intent.getExtras();//.getExtras()得到intent所附带的额外数据
        String str=bundle.getString("entity_id");//getString()返回指定key的值
        Map<String, String> maps = new HashMap<>();
        maps.put("eid",str);
        String detailsUrl = "http://192.168.31.10:8081/boastJewelry/scoreMall/goods/info.do";
        OkHttpClientManager.postAsyn(detailsUrl, new OkHttpClientManager.ResultCallback<DetailsBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(DetailsBean response) {
                Log.d("DetailsBean", response + "");
                titleTv.setText(response.getObject().getInfo().getGoods_name());
                nameTv.setText(response.getObject().getInfo().getGoods_name());
                inventoryTv.setText(response.getObject().getInfo().getGoods_stock());
                tradeTv.setText(response.getObject().getInfo().getGoods_saleNum());
                costTv.setText(response.getObject().getInfo().getGoods_oldPrice());
                priceTv.setText(response.getObject().getInfo().getGoods_salePrice());
                describeTv.setText(response.getObject().getInfo().getGoods_info());

            }
        }, maps);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.details_conversion_btn:
                finish();
                break;
            case R.id.details_back_image:
                finish();
                break;
        }
    }
}
