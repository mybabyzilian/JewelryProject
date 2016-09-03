package com.example.admin.jewelry.information;

import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.OnRefreshListener;
import com.example.admin.jewelry.Utils.RefreshListView;
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
public class OtherFragment extends BaseFragment implements OnRefreshListener {
    private RefreshListView listView;
    private EphriteFragmentAdapter adapter;
    private String id = "4";

    @Override
    protected int setLayout() {
        return R.layout.fragment_other;
    }

    @Override
    protected void initView(View view) {
        listView = (RefreshListView) view.findViewById(R.id.other_list_view);
        adapter = new EphriteFragmentAdapter(context);
        listView.setOnRefreshListener(this);

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

    @Override
    public void onDownPullRefresh() {
        listView.hideHeaderView();
    }

    @Override
    public void onLoadingMore() {
        listView.hideFooterView();
    }
}
