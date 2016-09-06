package com.example.admin.jewelry.mine.my_baby;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/9/5.
 * 宝贝管理
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
        bindView(R.id.my_baby_release).setOnClickListener(this);
        listView = bindView(R.id.baby_list_view);

    }

    @Override
    protected void initData() {
        myBabyAdapter = new MyBabyAdapter(this);
        listView.setAdapter(myBabyAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_baby_back_image:
                finish();
                break;
            case R.id.my_baby_release:
                Intent intent = new Intent(this, MyBabyReleaseActivity.class);
                startActivity(intent);
                break;
        }
    }
}
