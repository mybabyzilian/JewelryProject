package com.example.admin.jewelry.forhelp.release;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/16.
 * 线上发布
 */
public class OnlineReleaseActivity extends BaseActivity implements View.OnClickListener {
    private ImageView picturesImage, backImage;
    private Button okButton;

    @Override
    public int setLayout() {
        return R.layout.activity_online_release;
    }

    @Override
    protected void initView() {
        backImage = bindView(R.id.online_back_image);
        backImage.setOnClickListener(this);
        picturesImage = bindView(R.id.online_pictures_image);
        picturesImage.setOnClickListener(this);
        okButton = bindView(R.id.online_ok_button);
        okButton.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.online_back_image:
                finish();
                break;
            case R.id.online_pictures_image:
                finish();
                break;
            case R.id.online_ok_button:
                finish();
                break;
        }
    }

}
