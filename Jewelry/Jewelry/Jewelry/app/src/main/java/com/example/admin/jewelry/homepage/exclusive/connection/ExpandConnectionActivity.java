package com.example.admin.jewelry.homepage.exclusive.connection;

import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 首页——扩人脉
 */
public class ExpandConnectionActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int setLayout() {
        return R.layout.activity_expand_connection;
    }

    @Override
    protected void initView() {
        bindView(R.id.connection_back_image).setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.connection_back_image:
                finish();
                break;
        }
    }
}
