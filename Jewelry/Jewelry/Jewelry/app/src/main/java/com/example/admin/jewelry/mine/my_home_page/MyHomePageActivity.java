package com.example.admin.jewelry.mine.my_home_page;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JINDAPENG on 2016/8/29.
 * 个人中心——我的主页
 */
public class MyHomePageActivity extends BaseActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private MyHomePageAdapter myHomePageAdapter;
    private List<Fragment> fragmentList;
    private ImageView backImg;

    @Override
    public int setLayout() {
        return R.layout.activity_my_home_page;
    }

    @Override
    protected void initView() {
        backImg = bindView(R.id.my_home_page_back_image);
        backImg.setOnClickListener(this);
        tabLayout = bindView(R.id.my_tablayout);
        viewPager = bindView(R.id.my_home_page_viewpager);

    }

    @Override
    protected void initData() {
        initFragments();
        //把数据放到adapter里
        myHomePageAdapter = new MyHomePageAdapter(getSupportFragmentManager());
        myHomePageAdapter.setFragmentList(fragmentList);// 集合放到适配器
        viewPager.setAdapter(myHomePageAdapter);// 绑定适配器


        //联系tabLayout和ViewPagerChild
        tabLayout.setTabTextColors(Color.BLACK, Color.RED);// 选中为蓝色,未选中为灰色
        tabLayout.setSelectedTabIndicatorColor(Color.RED);// 设置下标线为蓝色
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initFragments() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new MyReleaseFragment());
        fragmentList.add(new MyCommentsFragment());
        fragmentList.add(new MyIntroductionFragment());
        fragmentList.add(new MyAlbumFragment());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.my_home_page_back_image:
                finish();
                break;

        }

    }

}
