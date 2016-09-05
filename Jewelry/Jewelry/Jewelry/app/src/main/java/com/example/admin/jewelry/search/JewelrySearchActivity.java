package com.example.admin.jewelry.search;

import android.view.View;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by admin on 2016/9/5.
 */
public class JewelrySearchActivity extends BaseActivity {
    private TextView cancelTv;
    @Override
    public int setLayout() {
        return R.layout.activity_search_jewelry;
    }

    @Override
    protected void initView() {
        cancelTv = bindView(R.id.jewelry_search_cancel);
    }

    @Override
    protected void initData() {
        cancelTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
