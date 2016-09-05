package com.example.admin.jewelry.homepage.gemstonepostbar;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.RefreshListView;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.forhelp.adapter.SurroundAdapter;
import com.example.admin.jewelry.forhelp.bean.SurrondBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

/**
 * Created by admin on 2016/9/1.
 */
public class PostBarActivity extends BaseActivity {
    private String id;
    private RefreshListView listView;
    private SurroundAdapter adapter;
    private TextView titleTv;
    private RelativeLayout returnIv;

    @Override
    public int setLayout() {
        return R.layout.activity_post_bar;
    }

    @Override
    protected void initView() {
        adapter = new SurroundAdapter(this);
        listView = bindView(R.id.post_bar_list);
        titleTv = bindView(R.id.post_bar_name);
        returnIv = bindView(R.id.post_bar_return);
        returnIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        titleTv.setText(intent.getStringExtra("name"));

        OkHttpClientManager.postAsyn(Urls.SURROUND_URL, new OkHttpClientManager.ResultCallback<SurrondBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(SurrondBean response) {
                adapter.setData(response);
                listView.setAdapter(adapter);
            }
        });

    }
}
