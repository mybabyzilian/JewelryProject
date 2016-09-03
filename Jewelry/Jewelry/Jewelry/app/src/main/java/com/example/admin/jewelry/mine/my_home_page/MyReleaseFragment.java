package com.example.admin.jewelry.mine.my_home_page;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;

/**
 * Created by JINDAPENG on 2016/8/29.
 * 我的主页——发布
 */
public class MyReleaseFragment extends BaseFragment implements AdapterView.OnItemClickListener {
    private ListView listView;
    private MyReleaseAdapter myReleaseAdapter;

    @Override
    protected int setLayout() {
        return R.layout.fragment_my_home_list;
    }

    @Override
    protected void initView(View view) {
        listView = bindView(R.id.my_home_list);
        listView.setOnItemClickListener(this);

    }

    @Override
    protected void initData() {
        myReleaseAdapter = new MyReleaseAdapter(context);
        listView.setAdapter(myReleaseAdapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
