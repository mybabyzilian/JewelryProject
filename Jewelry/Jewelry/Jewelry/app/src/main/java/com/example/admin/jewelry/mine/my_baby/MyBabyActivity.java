package com.example.admin.jewelry.mine.my_baby;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

/**
 * Created by JINDAPENG on 2016/8/30.
 */
public class MyBabyActivity extends BaseActivity implements View.OnClickListener {
    private ListView listView;
    private MyBabyAdapter myBabyAdapter;

    @Override
    public int setLayout() {
        return R.layout.activity_my_baby;
    }

    @Override
    protected void initView() {
        bindView(R.id.my_baby_back_image).setOnClickListener(this);

    }

    @Override
    protected void initData() {
        String url = "http://192.168.31.10:8081/boastJewelry/objectGoods/my/one.do";

        myBabyAdapter = new MyBabyAdapter(getBaseContext());
        bindView(R.id.baby_list_view);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        listView.setAdapter(myBabyAdapter);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_baby_back_image:
                finish();
                break;
        }
    }
}
