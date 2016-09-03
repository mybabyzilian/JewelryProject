package com.example.admin.jewelry.homepage.pricetrend.branddetail;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.CommonAdaper;
import com.example.admin.jewelry.Utils.ViewHolder;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.jewelrymap.JewelryMapActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/8/25.
 * 品牌详情
 */
public class BrandDetailActivity extends BaseActivity implements View.OnClickListener {
    private String id;
    private ListView listView;
    private List<BrandDetailBean.ObjectBean.BrandAllDetailBean> list;
    private LinearLayout linearLayout;
    private ImageView returnIv;
    private TextView nameTv;

    @Override
    public int setLayout() {

        return R.layout.activity_brand_detail;

    }

    @Override
    protected void initView() {
        listView = (ListView) findViewById(R.id.Brand_Detail_list);
        linearLayout = (LinearLayout) findViewById(R.id.brand_detail_location);
        returnIv = (ImageView) findViewById(R.id.brand_detail_return);
        nameTv = (TextView) findViewById(R.id.Brand_Detail_title);

    }

    @Override
    protected void initData() {
        linearLayout.setOnClickListener(this);
        returnIv.setOnClickListener(this);

        Intent intent = getIntent();
        id = intent.getStringExtra("id");
        nameTv.setText(intent.getStringExtra("name"));
        list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("company_id", id);

        OkHttpClientManager.postAsyn(Urls.BRAND_DETAIL_URL, new OkHttpClientManager.ResultCallback<BrandDetailBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(BrandDetailBean response) {
                for (int i = 0; i < response.getObject().getCompanyProducts().size(); i++) {
                    list.add(response.getObject().getCompanyProducts().get(i));
                }

                listView.setAdapter(new CommonAdaper<BrandDetailBean.ObjectBean.BrandAllDetailBean>(BrandDetailActivity.this,
                        list, R.layout.brand_detail_item) {
                    @Override
                    public void convert(ViewHolder holder, BrandDetailBean.ObjectBean.BrandAllDetailBean item) {
                        holder.setText(R.id.brand_detail_date, item.getProduct_update_time().substring(5, 10));
                        holder.setText(R.id.brand_detail_product, item.getProduct_category_name());
                        holder.setText(R.id.brand_detail_price, item.getProduct_price());
                        holder.setText(R.id.brand_detail_work, item.getProduct_manual_fee());

                    }
                });

            }
        }, map);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.brand_detail_location:
                Intent intent = new Intent(BrandDetailActivity.this, JewelryMapActivity.class);
                startActivity(intent);
                break;
            case R.id.brand_detail_return:
                finish();
                break;
        }
    }
}
