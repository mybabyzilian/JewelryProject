package com.example.admin.jewelry.forhelp.release;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.forhelp.OnlineDetailsActivity;

/**
 * Created by JINDAPENG on 2016/8/23.
 * 我来解答页面
 */
public class AnswerActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImage;
    private TextView okTv;
    private EditText editText;

    @Override
    public int setLayout() {
        return R.layout.activity_answer;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = bindView(R.id.i_answer_back_image);
        backImage.setOnClickListener(this);

        okTv = bindView(R.id.submit);
        okTv.setOnClickListener(this);

        editText = bindView(R.id.edit_content);
        editText.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.i_answer_back_image:
               finish();
                break;
            case R.id.submit:
                break;
            case R.id.edit_content:
                break;


        }
    }
}