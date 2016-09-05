package com.example.admin.jewelry.homepage.dahuahot;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by admin on 2016/9/5.
 */
public class DaHuaHotAdapter extends FragmentPagerAdapter {
    private List<Fragment> data;
    private String[] title = {"热点资讯","热门讨论","在线求助"};


    public void setData(List<Fragment> data) {
        this.data = data;
        notifyDataSetChanged();
    }

    public DaHuaHotAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
