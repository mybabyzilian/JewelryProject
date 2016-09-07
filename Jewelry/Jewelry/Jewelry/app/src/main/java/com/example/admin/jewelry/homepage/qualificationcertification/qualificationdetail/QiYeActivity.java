package com.example.admin.jewelry.homepage.qualificationcertification.qualificationdetail;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.EditActivity;

/**
 * Created by admin on 2016/9/7.
 */
public class QiYeActivity extends BaseActivity implements View.OnClickListener {
    private TextView qiYeTv1,qiYeTv2,qiYeTv3,qiYeTv4,qiYeTv5,qiYeTv6,qiYeTv7,qiYeTv8,qiYeTv9,qiYeTv10,qiYeTv11;
    @Override
    public int setLayout() {
        return R.layout.activity_qiye;
    }

    @Override
    protected void initView() {
        bindView(R.id.qiye_renzheng_name).setOnClickListener(this);
        bindView(R.id.qiye_faren_name).setOnClickListener(this);
        bindView(R.id.qiye_jingying_pinlei).setOnClickListener(this);
        bindView(R.id.qiye_fuwu_xiangmu).setOnClickListener(this);
        bindView(R.id.qiye_jingying_zhizhao).setOnClickListener(this);
        bindView(R.id.qiye_shenfen_zhaopian).setOnClickListener(this);
        bindView(R.id.qiye_jingying_dizhi).setOnClickListener(this);
        bindView(R.id.qiye_shangjia_jieshao).setOnClickListener(this);
        bindView(R.id.qiye_jingying_guimo).setOnClickListener(this);
        bindView(R.id.qiye_jingying_shijian).setOnClickListener(this);
        bindView(R.id.qiye_more_photo).setOnClickListener(this);
        qiYeTv1 = bindView(R.id.qiye_edit_tv1);
        qiYeTv2 = bindView(R.id.qiye_edit_tv2);
        qiYeTv3 = bindView(R.id.qiye_edit_tv3);
        qiYeTv4 = bindView(R.id.qiye_edit_tv4);
        qiYeTv5 = bindView(R.id.qiye_edit_tv5);
        qiYeTv6 = bindView(R.id.qiye_edit_tv6);
        qiYeTv7 = bindView(R.id.qiye_edit_tv7);
        qiYeTv8 = bindView(R.id.qiye_edit_tv8);
        qiYeTv9 = bindView(R.id.qiye_edit_tv9);
        qiYeTv10 = bindView(R.id.qiye_edit_tv10);
        qiYeTv11 = bindView(R.id.qiye_edit_tv11);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(QiYeActivity.this, EditActivity.class);
        switch (view.getId()){
            case R.id.qiye_renzheng_name:
                intent.putExtra("zhuanye", "认证名称");
                intent.putExtra("zhuanye_hint", "填写认证名称");
                intent.putExtra("request_code","201");
                startActivityForResult(intent, 201);
                break;
            case R.id.qiye_faren_name:
                intent.putExtra("zhuanye", "经营者姓名");
                intent.putExtra("zhuanye_hint", "填写经营者姓名");
                intent.putExtra("request_code","202");
                startActivityForResult(intent, 202);
                break;
            case R.id.qiye_jingying_pinlei:
                intent.putExtra("zhuanye", "经营品类");
                intent.putExtra("zhuanye_hint", "填写经营者姓名");
                intent.putExtra("request_code","203");
                startActivityForResult(intent, 203);
                break;
            case R.id.qiye_fuwu_xiangmu:
                intent.putExtra("zhuanye", "服务项目");
                intent.putExtra("zhuanye_hint", "填写经营者姓名");
                intent.putExtra("request_code","204");
                startActivityForResult(intent, 204);
                break;
            case R.id.qiye_jingying_zhizhao:

                break;
            case R.id.qiye_shenfen_zhaopian:

                break;
            case R.id.qiye_jingying_dizhi:
                intent.putExtra("zhuanye", "经营地址");
                intent.putExtra("zhuanye_hint", "填写经营地址");
                intent.putExtra("request_code","207");
                startActivityForResult(intent, 207);
                break;
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
       if (requestCode == 201){
           if (resultCode == 201){
               String result = data.getStringExtra("tv");
               qiYeTv1.setText(result);
           }
       }
        if (requestCode == 202){
            if (resultCode == 202){
                String result = data.getStringExtra("tv");
                qiYeTv2.setText(result);
            }
        }
        if (requestCode == 203){
            if (resultCode == 203){
                String result = data.getStringExtra("tv");
                qiYeTv3.setText(result);
            }
        }
        if (requestCode == 204){
            if (resultCode == 204){
                String result = data.getStringExtra("tv");
                qiYeTv4.setText(result);
            }
        }
        if (requestCode == 205){
            if (resultCode == 205){
                String result = data.getStringExtra("tv");
                qiYeTv5.setText(result);
            }
        }
        if (requestCode == 206){
            if (resultCode == 206){
                String result = data.getStringExtra("tv");
                qiYeTv6.setText(result);
            }
        }
        if (requestCode == 207){
            if (resultCode == 207){
                String result = data.getStringExtra("tv");
                qiYeTv7.setText(result);
            }
        }

    }
}
