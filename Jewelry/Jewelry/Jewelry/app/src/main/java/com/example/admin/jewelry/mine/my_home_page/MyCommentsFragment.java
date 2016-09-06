package com.example.admin.jewelry.mine.my_home_page;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;

/**
 * Created by JINDAPENG on 2016/8/29.
 * 我的主页——评论
 */
public class MyCommentsFragment extends BaseFragment {
    private ListView listView;
    private MyCommentsAdapter myCommentsAdapter;

    @Override
    protected int setLayout() {
        return R.layout.fragment_my_home_list;
    }

    @Override
    protected void initView(View view) {
        listView = bindView(R.id.my_home_list);

    }

    @Override
    protected void initData() {
        myCommentsAdapter = new MyCommentsAdapter(context);
        listView.setAdapter(myCommentsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
