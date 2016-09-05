package com.example.admin.jewelry.homepage.exclusive.seek_service;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 首页——找客服
 */
public class SeekServiceActivity extends BaseActivity implements View.OnClickListener {
    private RelativeLayout consult_help, feedback_suggest, generalize_cooperation, report_complaint;

    @Override
    public int setLayout() {
        return R.layout.activity_seek_service;
    }

    @Override
    protected void initView() {
        bindView(R.id.service_back_image).setOnClickListener(this);
        consult_help = bindView(R.id.service_rl_consult_help);
        consult_help.setOnClickListener(this);
        feedback_suggest = bindView(R.id.service_rl_feedback_suggest);
        feedback_suggest.setOnClickListener(this);
        generalize_cooperation = bindView(R.id.service_rl_generalize_cooperation);
        generalize_cooperation.setOnClickListener(this);
        report_complaint = bindView(R.id.service_rl_report_complaint);
        report_complaint.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.service_back_image:
                finish();
                break;
            case R.id.service_rl_consult_help:
                Intent intentConsult = new Intent(this, FeedBackActivity.class);
                startActivity(intentConsult);
                break;
            case R.id.service_rl_feedback_suggest:
                Intent intentSuggest = new Intent(this, FeedBackActivity.class);
                startActivity(intentSuggest);
                break;
            case R.id.service_rl_generalize_cooperation:
                Intent intentReneralize = new Intent(this, FeedBackActivity.class);
                startActivity(intentReneralize);
                break;
            case R.id.service_rl_report_complaint:
                Intent intentReport = new Intent(this, FeedBackActivity.class);
                startActivity(intentReport);
                break;
        }
    }
}
