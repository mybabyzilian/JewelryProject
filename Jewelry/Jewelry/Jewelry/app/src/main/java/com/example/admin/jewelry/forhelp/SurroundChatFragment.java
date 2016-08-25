package com.example.admin.jewelry.forhelp;

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
import com.example.admin.jewelry.forhelp.adapter.SurroundAdapter;
import com.example.admin.jewelry.forhelp.adapter.SurroundPopuAdapter;
import com.example.admin.jewelry.forhelp.bean.SurrondBean;
import com.example.admin.jewelry.forhelp.bean.SurroundPopuBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/8/16.
 */
public class SurroundChatFragment extends BaseFragment {
    private ListView listView, popuList;
    private SurroundAdapter adapter;
    private View popuView;
    private LinearLayout relativeLayout;
    private ImageView popuIv;
    private SurroundPopuAdapter popuAdapter;
    private String id = "";
    private SurroundPopuBean bean;

    @Override
    protected int setLayout() {
        return R.layout.fragment_chat_surround;
    }

    @Override
    protected void initView(View view) {
        listView = (ListView) view.findViewById(R.id.surround_list);
        adapter = new SurroundAdapter(context);
        relativeLayout = (LinearLayout) view.findViewById(R.id.surround_jewelry_layout);
        popuView = LayoutInflater.from(context).inflate(R.layout.surround_popu, null);
        popuList = (ListView) popuView.findViewById(R.id.surround_popu_list);
        popuIv = (ImageView) view.findViewById(R.id.surround_popu_iv);
        popuAdapter = new SurroundPopuAdapter(context);

    }

    @Override
    protected void initData() {
        OkHttpClientManager.postAsyn(Urls.SURROUND_POPU_URL, new OkHttpClientManager.ResultCallback<SurroundPopuBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(final SurroundPopuBean response) {
                bean = response;
                popuAdapter.setData(response);
                popuList.setAdapter(popuAdapter);
                popuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        PopuWindowBase.dismisPopu();
                        id = response.getObject().getParentlist().get(i).getEntity_id();
                    }
                });
            }
        });


        Map<String, String> maps = new HashMap<>();
        maps.put("entity_id", id);
        OkHttpClientManager.postAsyn(Urls.SURROUND_URL, new OkHttpClientManager.ResultCallback<SurrondBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Toast.makeText(context, "请求失败了", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(SurrondBean response) {
                adapter.setData(response);
                listView.setAdapter(adapter);
            }

        }, maps);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bean != null) {
                    PopuWindowBase.showPopuWindows(relativeLayout, popuView, context,popuIv);
                    popuIv.setImageResource(R.mipmap.drop_top);
                }
            }
        });

    }


}
