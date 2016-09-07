package com.example.admin.jewelry.homepage.qualificationcertification;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.homepage.qualificationcertification.qualificationdetail.PersonalActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.qualificationdetail.QiYeActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.qualificationdetail.ZhuanYeActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.qualificationdetail.ZuZhiActivity;

/**
 * Created by admin on 2016/8/24.
 */
public class UnCertificateFragment extends BaseFragment implements View.OnClickListener {
    private RelativeLayout ziZhiLayout, qiYeLayout, zuZhiLayout, personLayout;

    @Override
    protected int setLayout() {
        return R.layout.uncertificate;
    }

    @Override
    protected void initView(View view) {
        ziZhiLayout = (RelativeLayout) view.findViewById(R.id.zhuanye_zizhi);
        qiYeLayout = (RelativeLayout) view.findViewById(R.id.qiye_shangjia);
        zuZhiLayout = (RelativeLayout) view.findViewById(R.id.zuzhi_jigou);
        personLayout = (RelativeLayout) view.findViewById(R.id.geren_shiming);
        ziZhiLayout.setOnClickListener(this);
        qiYeLayout.setOnClickListener(this);
        zuZhiLayout.setOnClickListener(this);
        personLayout.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.zhuanye_zizhi:
                Intent intent = new Intent(context, ZhuanYeActivity.class);
                context.startActivity(intent);
                break;
            case R.id.qiye_shangjia:
                Intent intent1 = new Intent(context, QiYeActivity.class);
                context.startActivity(intent1);

                break;
            case R.id.zuzhi_jigou:
                Intent intent2 = new Intent(context, ZuZhiActivity.class);
                context.startActivity(intent2);

                break;
            case R.id.geren_shiming:
                Intent intent3 = new Intent(context, PersonalActivity.class);
                context.startActivity(intent3);
                break;

        }
    }
}
