package com.example.admin.jewelry.information;

import android.view.View;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.information.adapter.EphriteFragmentAdapter;
import com.example.admin.jewelry.information.bean.InformationBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/8/15.
 */
public class EphriteFragment extends BaseFragment {
    private EphriteFragmentAdapter adapter;
    private ListView listView;
    private String id = "1";


    @Override
    protected int setLayout() {
        return R.layout.fragment_ephrite;
    }

    @Override
    protected void initView(View view) {
        listView = (ListView) view.findViewById(R.id.Ephrite_list_view);
        adapter = new EphriteFragmentAdapter(context);
    }

    @Override
    protected void initData() {

        Map<String, String> maps = new HashMap<>();
        maps.put("category_id", id);

        OkHttpClientManager.postAsyn(Urls.EPHRITEURL, new OkHttpClientManager.ResultCallback<InformationBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(InformationBean response) {
                adapter.setData(response);
               listView.setAdapter(adapter);
            }

        }, maps);

    }
}
