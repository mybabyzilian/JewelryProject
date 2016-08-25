package com.example.admin.jewelry.homepage.pricetrend;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.PopuWindowBase;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/8/22.
 */
public class DapanTrendFragment extends BaseFragment implements View.OnClickListener {
    private LinearLayout glodLayout,todayLayout,rmbLayout,dapanLayout;
    private View popuView;
    private ListView popuList;
    private PricePopuAdapter adapter;
    private PricePopuBean bean;
    private List<GoldPopuBean> data,getData;
    private GoldPopuAdapter goldPopuAdapter;
    private ImageView goldIv,todayIv,rmbIv;




    @Override
    protected int setLayout() {
        return R.layout.fragment_dapan_tend;
    }

    @Override
    protected void initView(View view) {
        glodLayout = (LinearLayout) view.findViewById(R.id.gold_linear_layout);
        todayLayout = (LinearLayout) view.findViewById(R.id.today_linear_layout);
        rmbLayout = (LinearLayout) view.findViewById(R.id.rmb_linear_layout);
        dapanLayout = (LinearLayout) view.findViewById(R.id.dapand_linear_layout);
        popuView = LayoutInflater.from(context).inflate(R.layout.view_popu,null);
        popuList = (ListView) popuView.findViewById(R.id.popu_list);
        goldIv = (ImageView) view.findViewById(R.id.gold_iv);
        todayIv = (ImageView) view.findViewById(R.id.today_iv);
        rmbIv = (ImageView) view.findViewById(R.id.rmb_iv);


    }

    @Override
    protected void initData() {
        glodLayout.setOnClickListener(this);
        todayLayout.setOnClickListener(this);
        rmbLayout.setOnClickListener(this);
        dapanLayout.setOnClickListener(this);
        adapter = new PricePopuAdapter(context);
        goldPopuAdapter = new GoldPopuAdapter(context);
        data = new ArrayList<>();
        getData = new ArrayList<>();
        GoldPopuBean a = new GoldPopuBean();
        a.setName("今日");
        data.add(a);
        GoldPopuBean b = new GoldPopuBean();
        b.setName("本月");
        data.add(b);
        GoldPopuBean c = new GoldPopuBean();
        c.setName("本年");
        data.add(c);
        GoldPopuBean d = new GoldPopuBean();
        d.setName("人民币/克");
        getData.add(d);
        GoldPopuBean e = new GoldPopuBean();
        e.setName("美元/盎司");
        getData.add(e);

        OkHttpClientManager.postAsyn(Urls.DAPAN_POPU, new OkHttpClientManager.ResultCallback<PricePopuBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }
            @Override
            public void onResponse(PricePopuBean response) {
                bean = response;

            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.gold_linear_layout:
                adapter.setDate(bean);
                popuList.setAdapter(adapter);
                goldIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(dapanLayout,popuView,context,goldIv);
                break;
            case R.id.today_linear_layout:
                goldPopuAdapter.setData(data);
                popuList.setAdapter(goldPopuAdapter);
                todayIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(dapanLayout,popuView,context,todayIv);
                break;
            case R.id.rmb_linear_layout:
                goldPopuAdapter.setData(getData);
                popuList.setAdapter(goldPopuAdapter);
                rmbIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(dapanLayout,popuView,context,rmbIv);
                break;

        }

    }



}
