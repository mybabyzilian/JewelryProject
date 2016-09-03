package com.example.admin.jewelry.homepage.exclusive.rim;

import android.view.View;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/9/2.
 * 首页——搜周边——周边组织
 */
public class RimOrganizationActivity extends BaseActivity implements View.OnClickListener {
    @Override
    public int setLayout() {
        return R.layout.activity_rim_merchants;
    }

    @Override
    protected void initView() {
        bindView(R.id.rim_merchants_back_image).setOnClickListener(this);
        TextView titleTV = bindView(R.id.rim_merchants_title_tv);
        titleTV.setText("周边组织");
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.rim_merchants_back_image:
                finish();
                break;
        }
    }
}
