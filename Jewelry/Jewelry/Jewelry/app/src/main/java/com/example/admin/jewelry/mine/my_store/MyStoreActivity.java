package com.example.admin.jewelry.mine.my_store;

import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/30.
 * 个人中心——我的店铺
 */
public class MyStoreActivity extends BaseActivity implements View.OnClickListener {
    @Override
    public int setLayout() {
        return R.layout.activity_my_store;
    }

    @Override
    protected void initView() {
        bindView(R.id.my_store_back_image).setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_store_back_image:
                finish();
                break;
        }
    }
}
