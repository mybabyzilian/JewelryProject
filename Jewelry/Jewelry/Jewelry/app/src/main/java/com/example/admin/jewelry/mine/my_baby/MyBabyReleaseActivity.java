package com.example.admin.jewelry.mine.my_baby;

import android.content.Intent;
import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.exclusive.issue_windows.CollectionPublishActivity;
import com.example.admin.jewelry.homepage.exclusive.issue_windows.NewPublishActivity;

/**
 * Created by JINDAPENG on 2016/9/5.
 * 商品发布
 */
public class MyBabyReleaseActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int setLayout() {
        return R.layout.activity_my_baby_release;
    }

    @Override
    protected void initView() {
        bindView(R.id.baby_release_back_image).setOnClickListener(this);
        bindView(R.id.new_product_release).setOnClickListener(this);
        bindView(R.id.collection_release).setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.baby_release_back_image:
                finish();
                break;
            case R.id.new_product_release:
                Intent intent1 = new Intent(this, NewPublishActivity.class);
                startActivity(intent1);
                break;
            case R.id.collection_release:
                Intent intent2 = new Intent(this, CollectionPublishActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
