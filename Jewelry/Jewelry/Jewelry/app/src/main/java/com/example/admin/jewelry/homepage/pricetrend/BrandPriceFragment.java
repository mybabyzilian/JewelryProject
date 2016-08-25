package com.example.admin.jewelry.homepage.pricetrend;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.PopuWindowBase;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2016/8/22.
 */
public class BrandPriceFragment extends BaseFragment implements View.OnClickListener {
    private LinearLayout goldLayput, lastlayout, brandLayout;
    private ListView listView;
    private View popuView;
    private ListView popuList;
    private PricePopuAdapter adapter;
    private String id = "2";
    private List<GoldPopuBean> data;
    private GoldPopuAdapter gAdapter;
    private PricePopuBean bean;
    private ImageView brandIv, lastIv;

    @Override
    protected int setLayout() {

        return R.layout.fragment_price_brand;

    }

    @Override
    protected void initView(View view) {
        popuView = LayoutInflater.from(context).inflate(R.layout.view_popu, null);
        popuList = (ListView) popuView.findViewById(R.id.popu_list);
        goldLayput = (LinearLayout) view.findViewById(R.id.brandgold_linear_layout);
        lastlayout = (LinearLayout) view.findViewById(R.id.brand_last_linear_layout);
        brandLayout = (LinearLayout) view.findViewById(R.id.brand_linear_layout);
        listView = (ListView) view.findViewById(R.id.brand_list);
        brandIv = (ImageView) view.findViewById(R.id.brand_gold_iv);
        lastIv = (ImageView) view.findViewById(R.id.last_time_iv);


    }

    @Override
    protected void initData() {
        goldLayput.setOnClickListener(this);
        lastlayout.setOnClickListener(this);
        adapter = new PricePopuAdapter(context);
        gAdapter = new GoldPopuAdapter(context);
        data = new ArrayList<>();
        GoldPopuBean b = new GoldPopuBean();
        b.setName("最新时间");
        GoldPopuBean c = new GoldPopuBean();
        c.setName("最早时间");
        data.add(b);
        data.add(c);
        OkHttpClientManager.postAsyn(Urls.DAPAN_POPU, new OkHttpClientManager.ResultCallback<PricePopuBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(final PricePopuBean response) {
                bean = response;
                popuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    //    id = response.getObject().get(i).getCodes();

                        PopuWindowBase.dismisPopu();
                    }
                });
            }
        });
        Map<String, String> map = new HashMap<>();
        map.put("product_category", id);

        OkHttpClientManager.postAsyn(Urls.BRAND_PRICE_URL, new OkHttpClientManager.ResultCallback<BrandPriceBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(context, "请求不成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(BrandPriceBean response) {
                for (int i = 0; i <response.getObject().size() ; i++) {
                    Log.d("BrandPriceFragment***", response.getObject().get(i).getCategory_name());
                }
            }
        }, map);




    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.brandgold_linear_layout:
                adapter.setDate(bean);
                popuList.setAdapter(adapter);
                brandIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(brandLayout, popuView, context, brandIv);
                break;
            case R.id.brand_last_linear_layout:
                gAdapter.setData(data);
                popuList.setAdapter(gAdapter);
                lastIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(brandLayout, popuView, context, lastIv);
                break;
        }

    }
}
