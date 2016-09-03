package com.example.admin.jewelry.mine.my_participate;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.mine.my_issue.MyIssueDiscussFragment;
import com.example.admin.jewelry.mine.my_issue.MyIssueFragment;
import com.example.admin.jewelry.mine.my_issue.MyIssueMessageFragment;
import com.example.admin.jewelry.mine.my_issue.MyIssueSeekHelpFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JINDAPENG on 2016/9/1.
 * 个人中心——我的参与
 */
public class MyParticipateActivity extends BaseActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private MyParticipateAdapter myParticipateAdapter;
    private List<Fragment> fragmentList;
    private ImageView backImg;

    @Override
    public int setLayout() {
        return R.layout.activity_my_participate;
    }

    @Override
    protected void initView() {
        backImg = bindView(R.id.my_participate_back_image);
        backImg.setOnClickListener(this);
        tabLayout = bindView(R.id.my_participate_tablayout);
        viewPager = bindView(R.id.my_participate_viewpager);
    }

    @Override
    protected void initData() {
        initFragments();
        //把数据放到adapter里
        myParticipateAdapter = new MyParticipateAdapter(getSupportFragmentManager());
        myParticipateAdapter.setFragmentList(fragmentList);// 集合放到适配器
        viewPager.setAdapter(myParticipateAdapter);// 绑定适配器

        //联系tabLayout和ViewPagerChild
        tabLayout.setTabTextColors(Color.BLACK, Color.RED);// 选中为红色,未选中为灰色
        tabLayout.setSelectedTabIndicatorColor(Color.RED);// 设置下标线为红色
        tabLayout.setupWithViewPager(viewPager);
    }

    private void initFragments() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new MyIssueFragment());
        fragmentList.add(new MyIssueSeekHelpFragment());
        fragmentList.add(new MyIssueDiscussFragment());
        fragmentList.add(new MyIssueMessageFragment());
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_participate_back_image:
                finish();
                break;
        }
    }
}
