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
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.FinishProjectPopupWindows;
import com.example.admin.jewelry.Utils.RoundImageView;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.mine.my_home_page.MyHomePageActivity;

/**
 * Created by admin on 2016/8/15.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener {
    private static final int CAPTURE_CODE = 100;
    private RoundImageView cameraIv;
    private static final int IMAGE_CODE = 101;
    private Bitmap bm;
    private FinishProjectPopupWindows popupWindows;
    private View bottomView;


    @Override
    protected int setLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.my_home_page_rl).setOnClickListener(this);//我的主页
        cameraIv = (RoundImageView) view.findViewById(R.id.personal_camera);
        cameraIv.setOnClickListener(this);
        bottomView = view.findViewById(R.id.bottom_view);

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
                popupWindows = new FinishProjectPopupWindows((Activity) context, itemsOnClick);
                popupWindows.showAtLocation(bottomView,
                        Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 0);
                break;

        }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        try {
            ContentResolver resolver = context.getContentResolver();
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
            Toast.makeText(context, "选择图片错误，图片只能为jpg格式", Toast.LENGTH_SHORT).show();
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


}
