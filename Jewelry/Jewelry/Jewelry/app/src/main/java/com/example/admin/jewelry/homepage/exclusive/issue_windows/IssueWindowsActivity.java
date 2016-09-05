package com.example.admin.jewelry.homepage.exclusive.issue_windows;

import android.content.Intent;
import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.forhelp.release.CircuseeReleaseActivity;
import com.example.admin.jewelry.forhelp.release.OfflineReleaseActivity;
import com.example.admin.jewelry.forhelp.release.OnlineReleaseActivity;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 首页——发布窗
 */
public class IssueWindowsActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public int setLayout() {
        return R.layout.activity_issue_windows;
    }

    @Override
    protected void initView() {
        bindView(R.id.issue_windows_back_image).setOnClickListener(this);
        bindView(R.id.issue_rl_talk).setOnClickListener(this);
        bindView(R.id.issue_rl_consult).setOnClickListener(this);
        bindView(R.id.issue_rl_subscribe).setOnClickListener(this);
        bindView(R.id.issue_rl_transfer).setOnClickListener(this);//藏品转让
        bindView(R.id.issue_rl_information).setOnClickListener(this);//发布资讯
        bindView(R.id.issue_rl_train).setOnClickListener(this);//发布培训
        bindView(R.id.issue_rl_commodity).setOnClickListener(this);//发布新品

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.issue_windows_back_image:
                finish();
                break;
            case R.id.issue_rl_talk:
                Intent intent_talk = new Intent(this, CircuseeReleaseActivity.class);
                startActivity(intent_talk);
                break;
            case R.id.issue_rl_consult:
                Intent intent_consult = new Intent(this, OnlineReleaseActivity.class);
                startActivity(intent_consult);
                break;
            case R.id.issue_rl_subscribe:
                Intent intent_subscribe = new Intent(this, OfflineReleaseActivity.class);
                startActivity(intent_subscribe);
                break;
            case R.id.issue_rl_transfer:
                Intent intent_transfer = new Intent(this, CollectionPublishActivity.class);
                startActivity(intent_transfer);
                break;
            case R.id.issue_rl_information:
                break;
            case R.id.issue_rl_train:
                break;
            case R.id.issue_rl_commodity:
                Intent intent_commodity = new Intent(this, NewPublishActivity.class);
                startActivity(intent_commodity);
                break;
        }
    }
}
