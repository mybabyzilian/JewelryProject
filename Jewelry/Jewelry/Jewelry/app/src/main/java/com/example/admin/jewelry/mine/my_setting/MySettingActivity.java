package com.example.admin.jewelry.mine.my_setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import static com.example.admin.jewelry.Utils.DataCleanManager.clearAllCache;
import static com.example.admin.jewelry.Utils.DataCleanManager.getTotalCacheSize;

/**
 * Created by JINDAPENG on 2016/8/30.
 * 个人中心——设置
 */
public class MySettingActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImage;
    private TextView cacheTv,cache;

    @Override
    public int setLayout() {
        return R.layout.activity_my_setting;
    }

    @Override
    protected void initView() {
        bindView(R.id.my_setting_back_image).setOnClickListener(this);
        bindView(R.id.clear_the_cache).setOnClickListener(this);
        cache = bindView(R.id.the_cache_size);
    }

    @Override
    protected void initData() {

        String totalCacheSize = null;//读取缓存大小
        try {
            totalCacheSize = getTotalCacheSize(getBaseContext());
        } catch (Exception e) {
            e.printStackTrace();
        }
        cache.setText(totalCacheSize);// 显示缓存大小
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_setting_back_image:
                finish();
                break;
            case R.id.clear_the_cache:
                clearAllCache(getBaseContext());
                // 清除缓存
                break;


        }
    }
}
