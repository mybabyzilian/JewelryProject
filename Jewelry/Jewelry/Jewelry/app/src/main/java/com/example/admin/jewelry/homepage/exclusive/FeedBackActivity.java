package com.example.admin.jewelry.homepage.exclusive;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 找客服——写反馈
 */
public class FeedBackActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImage;
    private EditText editText;
    private Button submitBtn;

    @Override
    public int setLayout() {
        return R.layout.activity_write_feedback;
    }


    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bindView(R.id.feedback_back_image).setOnClickListener(this);
        editText = bindView(R.id.write_feedback_et);
        editText.setOnClickListener(this);
        submitBtn = bindView(R.id.feedback_submit_button);
        submitBtn.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.feedback_back_image:
                finish();
                break;
            case R.id.write_feedback_et:
                finish();
                break;
            case R.id.feedback_submit_button:
                finish();
                break;
        }

    }
}
