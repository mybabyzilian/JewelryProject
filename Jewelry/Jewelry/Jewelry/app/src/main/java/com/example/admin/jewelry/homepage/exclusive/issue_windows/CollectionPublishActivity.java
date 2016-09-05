package com.example.admin.jewelry.homepage.exclusive.issue_windows;

import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/9/1.
 * 首页——发布窗——藏品转让
 */
public class CollectionPublishActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int setLayout() {
        return R.layout.activity_collection_publish;
    }

    @Override
    protected void initView() {
        bindView(R.id.collection_publish_back_image).setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.collection_publish_back_image:
                finish();
                break;
        }
    }
}
