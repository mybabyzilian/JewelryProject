package com.example.admin.jewelry.homepage.exclusive;


import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 首页——扩人脉
 */
public class ExpandConnectionActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImage;

    @Override
    public int setLayout() {
        return R.layout.activity_expand_connection;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
