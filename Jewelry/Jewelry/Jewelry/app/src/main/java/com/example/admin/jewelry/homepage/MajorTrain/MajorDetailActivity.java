package com.example.admin.jewelry.homepage.MajorTrain;

import android.content.Intent;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by admin on 2016/9/5.
 */
public class MajorDetailActivity extends BaseActivity {
    private TextView sortTv,nameTv,mechanismTv,placeTv,dateTv,cycleTv,kechengTv,zhenghsuTv,feeTv,phoneTv,shuomingTv,titleTv;



    @Override
    public int setLayout() {
        return R.layout.activity_detail_major;
    }

    @Override
    protected void initView() {
        sortTv = bindView(R.id.detail_major_train_sort);
        nameTv = bindView(R.id.detail_major_train_name);
        mechanismTv = bindView(R.id.detail_major_train_mechanism);
        placeTv = bindView(R.id.detail_major_train_place);
        dateTv = bindView(R.id.detail_major_train_date);
        cycleTv = bindView(R.id.detail_major_train_cycle);
        kechengTv = bindView(R.id.detail_major_train_kecheng);
        zhenghsuTv = bindView(R.id.detail_major_train_zhenghsu);
        feeTv = bindView(R.id.detail_major_train_fee);
        phoneTv = bindView(R.id.detail_major_train_phone);
        shuomingTv = bindView(R.id.shuoming);
        titleTv = bindView(R.id.detail_major_train_title);

    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        sortTv.setText("培训品类 : " +intent.getStringExtra("sort"));
        nameTv.setText("课程名称 : " +intent.getStringExtra("name"));
        mechanismTv.setText("机构名称 : " +intent.getStringExtra("sort"));
        placeTv.setText("培训地点 : " + intent.getStringExtra("place"));
        dateTv.setText("开课日期 : " + intent.getStringExtra("date"));
        cycleTv.setText("培训周期 : " + intent.getStringExtra("cycle"));
        kechengTv.setText("课程机制 : " + intent.getStringExtra("kecheng"));
        feeTv.setText("培训费用 : " + intent.getStringExtra("cost"));
        phoneTv.setText("联系方式 : " + intent.getStringExtra("phone"));
        shuomingTv.setText("补充说明 : " + intent.getStringExtra("shuoming"));
        zhenghsuTv.setText("可获证书 : " + intent.getStringExtra("zhenghsu"));
        titleTv.setText(intent.getStringExtra("name"));

    }
}
