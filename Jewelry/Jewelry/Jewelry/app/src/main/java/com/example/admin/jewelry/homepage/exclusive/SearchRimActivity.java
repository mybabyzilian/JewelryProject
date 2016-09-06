package com.example.admin.jewelry.homepage.exclusive;

import android.content.Intent;
import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.exclusive.rim.RimAuthenticateActivity;
import com.example.admin.jewelry.homepage.exclusive.rim.RimMerchantsActivity;
import com.example.admin.jewelry.homepage.exclusive.rim.RimOrganizationActivity;
import com.example.admin.jewelry.homepage.exclusive.rim.RimProcessActivity;
import com.example.admin.jewelry.homepage.exclusive.rim.RimTrainActivity;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 首页——搜周边
 */
public class SearchRimActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int setLayout() {
        return R.layout.activity_search_rim;
    }

    @Override
    protected void initView() {
        bindView(R.id.rim_back_image).setOnClickListener(this);
        bindView(R.id.rim_rl_merchant).setOnClickListener(this);
        bindView(R.id.rim_rl_process).setOnClickListener(this);
        bindView(R.id.rim_rl_authenticate).setOnClickListener(this);
        bindView(R.id.rim_rl_train).setOnClickListener(this);
        bindView(R.id.rim_rl_organization).setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rim_back_image:
                finish();
                break;
            case R.id.rim_rl_merchant:
                Intent intent_merchant = new Intent(this, RimMerchantsActivity.class);
                startActivity(intent_merchant);
                break;
            case R.id.rim_rl_process:
                Intent intent_process = new Intent(this, RimProcessActivity.class);
                startActivity(intent_process);
                break;
            case R.id.rim_rl_authenticate:
                Intent intent_authenticate = new Intent(this, RimAuthenticateActivity.class);
                startActivity(intent_authenticate);
                break;
            case R.id.rim_rl_train:
                Intent intent_train = new Intent(this, RimTrainActivity.class);
                startActivity(intent_train);
                break;
            case R.id.rim_rl_organization:
                Intent intent_organization = new Intent(this, RimOrganizationActivity.class);
                startActivity(intent_organization);
                break;
        }
    }
}
