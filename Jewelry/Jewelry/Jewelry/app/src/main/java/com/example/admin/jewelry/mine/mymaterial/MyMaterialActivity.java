package com.example.admin.jewelry.mine.mymaterial;

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
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.FinishProjectPopupWindows;
import com.example.admin.jewelry.Utils.RoundImageView;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.base.MyApp;

/**
 * Created by admin on 2016/9/5.
 */
public class MyMaterialActivity extends BaseActivity implements View.OnClickListener {
    private static final int CAPTURE_CODE = 100;
    private static final int IMAGE_CODE = 101;
    private RoundImageView cameraIv;
    private Bitmap bm;
    private FinishProjectPopupWindows popupWindows;
    private RelativeLayout headLayout;
    private TextView userName;
    @Override
    public int setLayout() {
        return R.layout.activity_material;
    }

    @Override
    protected void initView() {
        headLayout = (RelativeLayout) findViewById(R.id.user_head_layout);
        headLayout.setOnClickListener(this);
        cameraIv = bindView(R.id.mine_user_iv);
        bindView(R.id.user_name_layout).setOnClickListener(this);
        userName = bindView(R.id.mine_user_name);

    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        intent.getStringExtra("userName");
        userName.setText(intent.getStringExtra("userName"));

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.user_head_layout:
                popupWindows = new FinishProjectPopupWindows(MyMaterialActivity.this, itemsOnClick);
                popupWindows.showAtLocation(headLayout,
                        Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
                break;
            case R.id.user_name_layout:
                Intent intent = new Intent(MyApp.getContext(),SetUserNameActivitry.class);
                startActivity(intent);
                break;

        }
    }

    private View.OnClickListener itemsOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.popupwindow_Button_saveProject:
                    Intent takephoto = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(takephoto, CAPTURE_CODE);
                    break;
                case R.id.popupwindow_Button_abandonProject:
                    Intent album = new Intent(Intent.ACTION_GET_CONTENT);
                    album.setType("image/*");
                    startActivityForResult(album, IMAGE_CODE);
                    break;
                case R.id.popupwindow_cancelButton:
                    popupWindows.dismiss();
                    break;

            }

        }
    };
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        try {
            ContentResolver resolver = MyApp.getContext().getContentResolver();
            if (resultCode != Activity.RESULT_OK) {
                return;
            } else if (requestCode == IMAGE_CODE) {
                Uri originalUri = data.getData();
                if (originalUri != null) {
                    bm = MediaStore.Images.Media.getBitmap(resolver, originalUri);
                    cameraIv.setImageBitmap(bm);
                }
            } else if (requestCode == CAPTURE_CODE && resultCode == Activity.RESULT_OK) {
                Bundle bundle = data.getExtras();
                if (bundle != null) {
                    bm = (Bitmap) bundle.get("data");
                    cameraIv.setImageBitmap(bm);
                }
            }
        } catch (Exception e) {
            Toast.makeText(MyApp.getContext(), "选择图片错误，图片只能为jpg格式", Toast.LENGTH_SHORT).show();
        }
    }

}
