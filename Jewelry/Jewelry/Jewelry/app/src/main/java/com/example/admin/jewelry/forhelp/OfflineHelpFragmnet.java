package com.example.admin.jewelry.forhelp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.forhelp.adapter.ListViewAdapter;
import com.example.admin.jewelry.forhelp.adapter.OfflinePopuAdapter;
import com.example.admin.jewelry.forhelp.bean.OfflineBean;
import com.example.admin.jewelry.forhelp.bean.OfflinePopuBean;
import com.example.admin.jewelry.forhelp.bean.OnlineBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/8/16.
 * 线下预约列表
 */
public class OfflineHelpFragmnet extends BaseFragment implements AdapterView.OnItemClickListener, View.OnClickListener {
    private LinearLayout sortlayout, areaLayout, stateLayout, parentLayout;
    private PopupWindow popupWindow;
    private ImageView sortIv, stateIv, areaIv;
    private TextView sortTv, areaTv, stateTv;
    private View popuView;
    private OfflinePopuBean bean;
    private OfflinePopuAdapter offlinePopuAdapter;
    private ListView popuListView, listView;
    private ListViewAdapter adapter;
    private OfflineBean offlineBean;

    @Override
    protected int setLayout() {
        return R.layout.fragment_offline_help;
    }

    @Override
    protected void initView(View view) {
        sortlayout = (LinearLayout) view.findViewById(R.id.sort_linear_layout);
        areaLayout = (LinearLayout) view.findViewById(R.id.area_linear_layout);
        stateLayout = (LinearLayout) view.findViewById(R.id.state_linear_layout);
        parentLayout = (LinearLayout) view.findViewById(R.id.parent_linear_layout);
        sortTv = (TextView) view.findViewById(R.id.sort_Tv);
        areaTv = (TextView) view.findViewById(R.id.area_tv);
        stateTv = (TextView) view.findViewById(R.id.state_tv);
        sortIv = (ImageView) view.findViewById(R.id.sort_iv);
        stateIv = (ImageView) view.findViewById(R.id.state_iv);
        areaIv = (ImageView) view.findViewById(R.id.area_iv);
        popuView = LayoutInflater.from(context).inflate(R.layout.view_popu, null);
        popuListView = (ListView) popuView.findViewById(R.id.popu_list);
        listView = (ListView) view.findViewById(R.id.offline_list_view);
        listView.setOnItemClickListener(this);
    }

    @Override
    protected void initData() {
        sortlayout.setOnClickListener(this);
        areaLayout.setOnClickListener(this);
        stateLayout.setOnClickListener(this);
        offlinePopuAdapter = new OfflinePopuAdapter(context);
        adapter = new ListViewAdapter(context);

        Map<String, String> map = new HashMap<>();
        map.put("entity_id", "1");
        OkHttpClientManager.postAsyn("http://192.168.31.10:8081/boastJewelry/helpDownQ/one.do", new OkHttpClientManager.ResultCallback<OfflinePopuBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(context, "请求失败了", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(OfflinePopuBean response) {
                bean = response;
                sortTv.setText(bean.getObject().getClist().get(0).getNames());
                areaTv.setText(bean.getObject().getCitylist().get(0).getNames());//区域
                stateTv.setText(bean.getObject().getAlist().get(0).getNames());//状态
            }

        }, map);


        popuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                popupWindow.dismiss();
            }
        });


        Map<String, String> maps = new HashMap<>();
        maps.put("help_category", "");
        maps.put("help_type", "");
        maps.put("isAsk", "");
        maps.put("currentPage", "1");
        maps.put("pageNumber", "20");

        OkHttpClientManager.postAsyn("http://192.168.31.10:8081/boastJewelry/helpDownQ/two.do", new OkHttpClientManager.ResultCallback<OfflineBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(context, "请求失败了", Toast.LENGTH_SHORT).show();
                Log.d("url", "onError: " + e);
            }

            @Override
            public void onResponse(OfflineBean response) {
                Log.d("url", "OfflineBean: " + response);
                offlineBean = response;
                adapter.setOfflineBean(response);
                listView.setAdapter(adapter);
            }

        }, maps);
    }

    public void showPopuWindows() {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);

        int width = (int) (wm.getDefaultDisplay().getWidth());


        popupWindow = new PopupWindow(popuView, width, WindowManager.LayoutParams.WRAP_CONTENT, false) {
            @Override
            public void dismiss() {
                super.dismiss();
                sortIv.setImageResource(R.mipmap.drop_top);
                areaIv.setImageResource(R.mipmap.drop_top);
                stateIv.setImageResource(R.mipmap.drop_top);


            }
        };
        //外部获得焦点
        popupWindow.setOutsideTouchable(true);
        //内部获得焦点
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setInputMethodMode(popupWindow.INPUT_METHOD_NEEDED);
        popupWindow.showAsDropDown(parentLayout);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sort_linear_layout:
                sortIv.setImageResource(R.mipmap.dropdown);
                showPopuWindows();
                if (bean != null) {
                    offlinePopuAdapter.setData(bean, 1);
                    popuListView.setAdapter(offlinePopuAdapter);
                }
                break;
            case R.id.area_linear_layout:
                areaIv.setImageResource(R.mipmap.dropdown);
                showPopuWindows();
                if (bean != null) {
                    offlinePopuAdapter.setData(bean, 2);
                    popuListView.setAdapter(offlinePopuAdapter);
                }
                break;
            case R.id.state_linear_layout:
                stateIv.setImageResource(R.mipmap.dropdown);
                showPopuWindows();
                if (bean != null) {
                    offlinePopuAdapter.setData(bean, 3);
                    popuListView.setAdapter(offlinePopuAdapter);
                }
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(context, OfflineDetailsActivity.class);
        String entity_id = offlineBean.getObject().getList().get(i).getEntity_id();
        Log.d("intent", "entity_id"+entity_id);
        intent.putExtra("entity_Id", entity_id);
        startActivity(intent);
    }
}
