package com.example.admin.jewelry.information;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.base.MyApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/8/15.
 * 资讯页面
 */
public class InformationFragment extends BaseFragment implements View.OnClickListener {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private InformationAdapter adapter;
    private List<Fragment> data;
    private ImageView imageView;

    @Override
    protected int setLayout() {
        return R.layout.fragmnet_information;
    }

    @Override
    protected void initView(View view) {
        tabLayout = (TabLayout) view.findViewById(R.id.information_tb);
        viewPager = (ViewPager) view.findViewById(R.id.information_vp);
        adapter = new InformationAdapter(getChildFragmentManager());
        data = new ArrayList<>();
        imageView = (ImageView) view.findViewById(R.id.homepage_sign);
        imageView.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        data.add(new EphriteFragment());
        data.add(new JewelryFragment());
        data.add(new WenWanFragment());
        data.add(new OtherFragment());
        adapter.setData(data);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.homepage_sign:
                Intent intent = new Intent(getContext(),HotWriterActivity.class);
                startActivity(intent);
                break;
        }
    }
}
