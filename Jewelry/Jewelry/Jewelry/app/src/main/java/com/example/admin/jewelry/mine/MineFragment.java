package com.example.admin.jewelry.mine;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.base.MyApp;
import com.example.admin.jewelry.mine.my_home_page.MyHomePageActivity;

/**
 * Created by admin on 2016/8/15.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected int setLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.my_home_page_rl).setOnClickListener(this);//我的主页

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_home_page_rl:
                Intent intent = new Intent(context,MyHomePageActivity.class);
                startActivity(intent);
                break;

        }

    }
}
