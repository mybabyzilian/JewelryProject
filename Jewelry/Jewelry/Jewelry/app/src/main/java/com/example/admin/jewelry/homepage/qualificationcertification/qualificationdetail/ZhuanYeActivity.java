package com.example.admin.jewelry.homepage.qualificationcertification.qualificationdetail;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.EditActivity;

/**
 * Created by admin on 2016/9/6.
 */
public class ZhuanYeActivity extends BaseActivity implements View.OnClickListener {
    private TextView zhuanyeTv1, zhuanyeTv2, zhuanyeTv3, zhuanyeTv4, zhuanyeTv5, zhuanyeTv6, zhuanyeTv7, zhuanyeTv8, zhuanyeTv9;

    @Override
    public int setLayout() {
        return R.layout.activity_zhuanye;
    }

    @Override
    protected void initView() {
        bindView(R.id.zhuanye_return).setOnClickListener(this);
        bindView(R.id.zhuanye_renzheng_layout).setOnClickListener(this);
        zhuanyeTv1 = bindView(R.id.zhuanye_edit_tv1);
        bindView(R.id.zhuanye_name_layout).setOnClickListener(this);
        zhuanyeTv2 = bindView(R.id.zhuanye_edit_tv2);
        bindView(R.id.zhuanye_lingyu_layout).setOnClickListener(this);
        zhuanyeTv3 = bindView(R.id.zhuanye_edit_tv3);
        bindView(R.id.zhuanye_area_layout).setOnClickListener(this);
        zhuanyeTv4 = bindView(R.id.zhuanye_edit_tv4);
        bindView(R.id.zhuanye_xiehui_layout).setOnClickListener(this);
        zhuanyeTv5 = bindView(R.id.zhuanye_edit_tv5);
        bindView(R.id.zhuanye_shenfen__photo_layout).setOnClickListener(this);
        zhuanyeTv6 = bindView(R.id.zhuanye_edit_tv6);
        bindView(R.id.zhuanye_zhengshu_photo_layout).setOnClickListener(this);
        zhuanyeTv7 = bindView(R.id.zhuanye_edit_tv7);
        bindView(R.id.zhuanye_shuoming_layout).setOnClickListener(this);
        zhuanyeTv8 = bindView(R.id.zhuanye_edit_tv8);
        bindView(R.id.zhuanye_more_pic_layout).setOnClickListener(this);
        zhuanyeTv9 = bindView(R.id.zhuanye_edit_tv9);

    }

    @Override
    protected void initData() {


    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ZhuanYeActivity.this, EditActivity.class);
        switch (view.getId()) {
            case R.id.zhuanye_return:
                finish();
                break;
            case R.id.zhuanye_renzheng_layout:
                intent.putExtra("zhuanye", "认证名称");
                intent.putExtra("zhuanye_hint", "填写认证名称");
                intent.putExtra("request_code","101");
                startActivityForResult(intent, 101);

                break;
            case R.id.zhuanye_name_layout:
                intent.putExtra("zhuanye", "真实姓名");
                intent.putExtra("zhuanye_hint", "填写真实姓名");
                intent.putExtra("request_code","102");
                startActivityForResult(intent, 102);
                break;
            case R.id.zhuanye_lingyu_layout:
                intent.putExtra("zhuanye","针对领域");
                intent.putExtra("zhuanye_hint","填写针对领域");
                intent.putExtra("request_code","103");
                startActivityForResult(intent,103);
                break;
            case R.id.zhuanye_area_layout:
                intent.putExtra("zhuanye","所在区域");
                intent.putExtra("zhuanye_hint","填写所在区域");
                intent.putExtra("request_code","104");
                startActivityForResult(intent,104);
                break;
            case R.id.zhuanye_xiehui_layout:
                intent.putExtra("zhuanye","所属协会");
                intent.putExtra("zhuanye_hint","填写所属协会");
                intent.putExtra("request_code","105");
                startActivityForResult(intent,105);
                break;
            case R.id.zhuanye_shenfen__photo_layout:
                intent.putExtra("zhuanye","身份照片");
                intent.putExtra("zhuanye_hint","填写身份照片");
                intent.putExtra("request_code","106");
                startActivityForResult(intent,106);
                break;
            case R.id.zhuanye_zhengshu_photo_layout:
                intent.putExtra("zhuanye","");
                intent.putExtra("zhuanye_hint","填写补充说明");
                intent.putExtra("request_code","107");
                startActivityForResult(intent,107);
                break;
            case R.id.zhuanye_shuoming_layout:
                intent.putExtra("zhuanye","补充说明");
                intent.putExtra("zhuanye_hint","填写补充说明");
                intent.putExtra("request_code","108");
                startActivityForResult(intent,108);
                break;
            case R.id.zhuanye_more_pic_layout:
                intent.putExtra("zhuanye","更多照片");
                intent.putExtra("zhuanye_hint","填写更多照片");
                intent.putExtra("request_code","109");
                startActivityForResult(intent,109);
                break;
        }

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 101) {
            if (resultCode == 101) {
                String result = data.getStringExtra("tv");
                zhuanyeTv1.setText(result);
            }

        }
        if (requestCode == 102){
            if (resultCode == 102){
                String result = data.getStringExtra("tv");
                zhuanyeTv2.setText(result);
            }
        }
        if (requestCode == 103){
            if (resultCode == 103){
                String result = data.getStringExtra("tv");
                zhuanyeTv3.setText(result);
            }
        }
        if (requestCode == 104){
            if (resultCode == 104){
                String result = data.getStringExtra("tv");
                zhuanyeTv4.setText(result);
            }
        }
        if (requestCode == 105){
            if (resultCode == 105){
                String result = data.getStringExtra("tv");
                zhuanyeTv5.setText(result);
            }
        }
        if (requestCode == 105){
            if (resultCode == 105){
                String result = data.getStringExtra("tv");
                zhuanyeTv5.setText(result);
            }
        }
        if (requestCode == 106){
            if (resultCode == 106){
                String result = data.getStringExtra("tv");
                zhuanyeTv6.setText(result);
            }
        }
        if (requestCode == 107){
            if (resultCode == 107){
                String result = data.getStringExtra("tv");
                zhuanyeTv7.setText(result);
            }
        }
        if (requestCode == 108){
            if (resultCode == 108){
                String result = data.getStringExtra("tv");
                zhuanyeTv8.setText(result);
            }
        }
        if (requestCode == 109){
            if (resultCode == 109){
                String result = data.getStringExtra("tv");
                zhuanyeTv9.setText(result);
            }
        }
    }
}
