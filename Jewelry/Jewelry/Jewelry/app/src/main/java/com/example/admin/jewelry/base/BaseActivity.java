package com.example.admin.jewelry.base;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by admin on 2016/8/15.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        if (Build.VERSION.SDK_INT >= 21){
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }
        initView();
        initData();

    }

    public abstract int setLayout();

    protected abstract void initView();

    protected abstract void initData();

    /**
     * 使组件实例化不需要转型
     * 使用方式:
     * TextView textView = bindView(R.id.tv);
     * 这样使用这个方法的时候是不需要强转的
     */
    protected <T extends View> T bindView(int id){
        return (T) findViewById(id);
    }
}
