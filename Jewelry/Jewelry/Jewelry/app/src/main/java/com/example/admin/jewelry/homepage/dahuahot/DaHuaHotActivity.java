package com.example.admin.jewelry.homepage.dahuahot;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/9/5.
 */
public class DaHuaHotActivity extends BaseActivity implements View.OnClickListener {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> date;
    private DaHuaHotAdapter adapter;
    private RelativeLayout returnIv;

    @Override
    public int setLayout() {
        return R.layout.activity_dahua_hot;
    }

    @Override
    protected void initView() {
        tabLayout = (TabLayout) findViewById(R.id.DaHua_hot_tab);
        viewPager = bindView(R.id.DaHua_hot_view_pager);
        returnIv = bindView(R.id.dahua_hot_return);
        returnIv.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        date = new ArrayList<>();
        date.add(new HotInformationFragment());
        date.add(new HotChatFragent());
        date.add(new HotOnlineFragment());
        adapter = new DaHuaHotAdapter(getSupportFragmentManager());
        adapter.setData(date);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.dahua_hot_return:
                finish();
                break;

        }
    }
}
