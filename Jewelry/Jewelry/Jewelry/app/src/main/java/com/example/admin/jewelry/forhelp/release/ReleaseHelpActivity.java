package com.example.admin.jewelry.forhelp.release;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;


/**
 * Created by JINDAPENG on 2016/8/16.
 * 求助发布
 */
public class ReleaseHelpActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImage;
    private RelativeLayout online_rl, offline_rl, circusee_rl;

    @Override
    public int setLayout() {
        return R.layout.acticity_release_help;
    }

    @Override
    protected void initView() {
        backImage = bindView(R.id.release_help_back_image);
        backImage.setOnClickListener(this);
        online_rl = bindView(R.id.online_rl);
        online_rl.setOnClickListener(this);
        offline_rl = bindView(R.id.offline_rl);
        offline_rl.setOnClickListener(this);
        circusee_rl = bindView(R.id.circusee_rl);
        circusee_rl.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.release_help_back_image:
                finish();
                break;
            case R.id.online_rl:
                Intent intent_on = new Intent(this, OnlineReleaseActivity.class);
                startActivity(intent_on);
                break;
            case R.id.offline_rl:
                Intent intent_off = new Intent(this, OfflineReleaseActivity.class);
                startActivity(intent_off);
                break;
            case R.id.circusee_rl:
                Intent intent_circusee = new Intent(this, CircuseeReleaseActivity.class);
                startActivity(intent_circusee);
                break;
        }
    }
}
