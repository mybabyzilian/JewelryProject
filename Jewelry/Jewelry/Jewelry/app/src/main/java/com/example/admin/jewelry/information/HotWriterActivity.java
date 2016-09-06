package com.example.admin.jewelry.information;

import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.information.adapter.HotWriterAdapter;


/**
 * Created by JINDAPENG on 2016/8/16.
 * 热门撰稿人
 */
public class HotWriterActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImage, landmarkImage;
    private ListView hotWriterListView;
    private HotWriterAdapter hotWriterAdapter;

    @Override
    public int setLayout() {
        return R.layout.activity_hotwriter;
    }

    @Override
    protected void initView() {

        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        backImage = bindView(R.id.hot_writer_back_image);
        backImage.setOnClickListener(this);
        landmarkImage = bindView(R.id.landmark_image);
        landmarkImage.setOnClickListener(this);
        hotWriterListView = bindView(R.id.hot_writer_listView);

    }

    @Override
    protected void initData() {
        hotWriterAdapter = new HotWriterAdapter(this);
        hotWriterListView.setAdapter(hotWriterAdapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.hot_writer_back_image:
                finish();
                break;
            case R.id.landmark_image:
                finish();
                break;
        }
    }
}