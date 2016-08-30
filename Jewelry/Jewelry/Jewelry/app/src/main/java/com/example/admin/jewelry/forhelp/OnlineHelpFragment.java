package com.example.admin.jewelry.forhelp;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.PopuWindowBase;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.forhelp.adapter.GridViewAdapter;
import com.example.admin.jewelry.forhelp.adapter.PopuAdapter;
import com.example.admin.jewelry.forhelp.bean.OnlineBean;
import com.example.admin.jewelry.forhelp.bean.PopuBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/8/16.
 * 线上求助列表
 */

public class OnlineHelpFragment extends BaseFragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    private LinearLayout sortlayout,typeLayout,rewardLayout,parentLayout;
    private ImageView sortIv,rewardIv,typeIv;
    private TextView sortTv,typeTv,rewardTv;
    private View popuView;
    private PopuBean bean;
    private PopuAdapter popuAdapter;
    private ListView popuListView;
    private GridView gridView;
    private GridViewAdapter adapter;
    private String id ="";
    private String type = "";
    private String reward = "";
    private int value = 0;
    private OnlineBean onlineBean;
    @Override
    protected int setLayout() {
        return R.layout.fragment_online_help;
    }

    @Override
    protected void initView(View view) {
        sortlayout = (LinearLayout) view.findViewById(R.id.sort_linear_layout);
        typeLayout = (LinearLayout) view.findViewById(R.id.type_linear_layout);
        rewardLayout = (LinearLayout) view.findViewById(R.id.reward_linear_layout);
        parentLayout = (LinearLayout) view.findViewById(R.id.parent_linear_layout);
        sortTv = (TextView) view.findViewById(R.id.sort_Tv);
        typeTv = (TextView) view.findViewById(R.id.type_tv);
        rewardTv = (TextView) view.findViewById(R.id.reward_tv);
        sortIv = (ImageView) view.findViewById(R.id.sort_iv);
        rewardIv = (ImageView) view.findViewById(R.id.reward_iv);
        typeIv = (ImageView) view.findViewById(R.id.type_iv);
        popuView = LayoutInflater.from(context).inflate(R.layout.view_popu, null);
        popuListView = (ListView) popuView.findViewById(R.id.popu_list);
        gridView = (GridView) view.findViewById(R.id.online_grid_view);
        gridView.setOnItemClickListener(this);


    }

    @Override
    protected void initData() {
        sortlayout.setOnClickListener(this);
        typeLayout.setOnClickListener(this);
        rewardLayout.setOnClickListener(this);
        popuAdapter = new PopuAdapter(context);
        adapter = new GridViewAdapter(context);
        Map<String, String> map = new HashMap<>();
        map.put("entity_id", "1");
        OkHttpClientManager.postAsyn(Urls.ONLINE_POPU_URL, new OkHttpClientManager.ResultCallback<PopuBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(context, "请求失败了", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(PopuBean response) {
                bean = response;
                sortTv.setText(bean.getObject().getClist().get(0).getCategory_name());
                typeTv.setText(bean.getObject().getTlist().get(0).getTitle());
                rewardTv.setText(bean.getObject().getAlist().get(0).getTitle());
            }

        }, map);

        updateData();
        popuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                PopuWindowBase.dismisPopu();
                if (value == 0) {
                    id = "";
                    type = "";
                    reward = "";

                } else if (value == 1) {
                    id = bean.getObject().getClist().get(i).getEntity_id();
                    sortTv.setText(bean.getObject().getClist().get(i).getCategory_name());
                } else if (value == 2) {
                    type = bean.getObject().getAlist().get(i).getVal();
                    rewardTv.setText(bean.getObject().getAlist().get(i).getTitle());

                } else if (value == 3) {
                    reward = bean.getObject().getTlist().get(i).getVal();
                    typeTv.setText(bean.getObject().getTlist().get(i).getTitle());

                }

                updateData();
            }
        });


    }

    private void updateData() {
        Map<String, String> maps = new HashMap<>();
        maps.put("help_category", id);
        maps.put("help_type",reward);
        OkHttpClientManager.postAsyn(Urls.ONLINE_GRID_URL, new OkHttpClientManager.ResultCallback<OnlineBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(context, "请求失败了", Toast.LENGTH_SHORT).show();
                updateData();
            }


            @Override
            public void onResponse(OnlineBean response) {
                onlineBean = response;
                adapter.setData(response);
                gridView.setAdapter(adapter);
            }

        }, maps);

    }




    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sort_linear_layout:
                sortIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(parentLayout,popuView,context,sortIv);
                if (bean != null) {
                    popuAdapter.setData(bean, 1);
                    popuListView.setAdapter(popuAdapter);
                }
                value = 1;

                break;
            case R.id.reward_linear_layout:
                rewardIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(parentLayout,popuView,context,rewardIv);
                if (bean != null) {
                    popuAdapter.setData(bean, 2);
                    popuListView.setAdapter(popuAdapter);
                }
                value = 2;
                break;
            case R.id.type_linear_layout:
                typeIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(parentLayout,popuView,context,typeIv);
                if (bean != null) {
                    popuAdapter.setData(bean, 3);
                    popuListView.setAdapter(popuAdapter);
                }
                value = 3;
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getContext(), OnlineDetailsActivity.class);
        String entity_id = onlineBean.getObject().getList().get(i).getEntity_id();
        intent.putExtra("entity_id", entity_id);
        startActivity(intent);
    }
}
