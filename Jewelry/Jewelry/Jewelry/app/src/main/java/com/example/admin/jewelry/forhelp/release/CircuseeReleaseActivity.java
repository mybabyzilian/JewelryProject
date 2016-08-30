package com.example.admin.jewelry.forhelp.release;

import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;


/**
 * Created by JINDAPENG on 2016/8/16.
 * 围观讨论发布
 */
public class CircuseeReleaseActivity extends BaseActivity implements View.OnClickListener {
    private EditText contentEt, titleEt;
    private TextView chooseTv;
    private ImageView backImage;
    private Button okBtn;

    @Override
    public int setLayout() {
        return R.layout.activity_circusee_release;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = bindView(R.id.circusee_back_image);
        backImage.setOnClickListener(this);
        titleEt = bindView(R.id.circusee_title_et);
        titleEt.setOnClickListener(this);
        chooseTv = bindView(R.id.circusee_choose_tv);
        chooseTv.setOnClickListener(this);
        contentEt = bindView(R.id.circusee_content_et);
        contentEt.setOnClickListener(this);
        okBtn = bindView(R.id.circusee_ok_button);
        okBtn.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.circusee_back_image:
                finish();
                break;
            case R.id.circusee_title_et:
                finish();
                break;
            case R.id.circusee_choose_tv:
                Intent intentname = new Intent(this, ClassifyNameActivity.class);
                startActivity(intentname);
                break;
            case R.id.circusee_content_et:
                finish();
                break;
            case R.id.circusee_ok_button:
                finish();
                break;
        }

    }

}
