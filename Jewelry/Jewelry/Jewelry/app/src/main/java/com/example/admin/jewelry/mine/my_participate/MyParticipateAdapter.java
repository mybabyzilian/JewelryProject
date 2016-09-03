package com.example.admin.jewelry.mine.my_participate;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by JINDAPENG on 2016/9/1.
 */
public class MyParticipateAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    private String[] tabs = {"资讯", "咨询", "求助", "讨论"};

    public MyParticipateAdapter(FragmentManager fm) {
        super(fm);
    }

    public void setFragmentList(List<Fragment> fragmentList) {
        this.fragmentList = fragmentList;
        notifyDataSetChanged();// 通知适配器改变了
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList == null ? 0 : fragmentList.size();
    }// 数组宽度

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];// 添加标题
    }
}

