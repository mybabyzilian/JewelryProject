package com.example.admin.jewelry.mine.my_home_page;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;

/**
 * Created by JINDAPENG on 2016/8/29.
 * 我的主页——相册
 */
public class MyIntroductionFragment extends BaseFragment {
    private GridView gridView;
    private MyIntroductionAdapter myIntroductionAdapter;


    @Override
    protected int setLayout() {
        return R.layout.fragment_my_home_introduction;
    }

    @Override
    protected void initView(View view) {
        gridView = bindView(R.id.my_GridView);

    }

    @Override
    protected void initData() {
        myIntroductionAdapter = new MyIntroductionAdapter(context);
        gridView.setAdapter(myIntroductionAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
