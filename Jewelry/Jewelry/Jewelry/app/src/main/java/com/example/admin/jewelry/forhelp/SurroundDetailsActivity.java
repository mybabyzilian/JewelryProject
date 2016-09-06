package com.example.admin.jewelry.forhelp;

import android.view.WindowManager;

import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/25.
 * 围观讨论列表——讨论详情
 */
public class SurroundDetailsActivity extends BaseActivity {
    @Override
    public int setLayout() {
        return 0;
    }

    @Override
    protected void initView() {

        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

    }

    @Override
    protected void initData() {

    }
}
