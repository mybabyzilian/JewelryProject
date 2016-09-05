package com.example.admin.jewelry.homepage.exclusive.issue_windows;

import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/9/5.
 * 新品发布
 */
public class NewPublishActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int setLayout() {
        return R.layout.activity_new_publish;
    }

    @Override
    protected void initView() {
        bindView(R.id.new_publish_back_image).setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.new_publish_back_image:
                finish();
                break;

        }
    }
}
