package com.example.admin.jewelry.homepage.hot_activity;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/29.
 * 热门活动——活动列表
 */
public class ParticipateHotActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImg, photoImg;
    private TextView sendTv;
    private EditText editText;

    @Override
    public int setLayout() {
        return R.layout.activity_participate_hot;
    }

    @Override
    protected void initView() {
        bindView(R.id.participate_back_image).setOnClickListener(this);
        bindView(R.id.add_photo).setOnClickListener(this);
        bindView(R.id.hot_activity_send).setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.participate_back_image:
                finish();
                break;
            case R.id.add_photo:
                break;
            case R.id.hot_activity_send:
                break;

        }
    }
}
