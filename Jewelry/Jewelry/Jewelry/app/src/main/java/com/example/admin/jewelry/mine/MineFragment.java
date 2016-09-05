package com.example.admin.jewelry.mine;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.FinishProjectPopupWindows;
import com.example.admin.jewelry.Utils.RoundImageView;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.mine.my_home_page.MyHomePageActivity;
import com.example.admin.jewelry.mine.mymaterial.MyMaterialActivity;

/**
 * Created by admin on 2016/8/15.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener {


    private View bottomView;
    private RelativeLayout materialLayout;


    @Override
    protected int setLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.my_home_page_rl).setOnClickListener(this);//我的主页
        bottomView = view.findViewById(R.id.bottom_view);
        materialLayout = (RelativeLayout) view.findViewById(R.id.mine_my_material);
        materialLayout.setOnClickListener(this);

    }

    @Override
    protected void initData() {


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_home_page_rl:
                Intent intent = new Intent(context, MyHomePageActivity.class);
                startActivity(intent);
                break;
            case R.id.personal_camera:

                break;
            case R.id.mine_my_material:
                Intent intent1 = new Intent(context, MyMaterialActivity.class);
                context.startActivity(intent1);
                break;

        }

    }





}
