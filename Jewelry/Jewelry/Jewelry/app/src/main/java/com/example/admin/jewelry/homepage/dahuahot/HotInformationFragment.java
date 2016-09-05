package com.example.admin.jewelry.homepage.dahuahot;

import android.view.View;
import android.widget.GridView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.CommonAdaper;
import com.example.admin.jewelry.Utils.ViewHolder;
import com.example.admin.jewelry.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/9/5.
 */
public class HotInformationFragment extends BaseFragment {
    private GridView gridView;
    private List<HotGridBean> list;

    @Override
    protected int setLayout() {
        return R.layout.fragment_hot_information;
    }

    @Override
    protected void initView(View view) {
        gridView = (GridView) view.findViewById(R.id.hot_information_grid);

    }

    @Override
    protected void initData() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            HotGridBean b = new HotGridBean();
            b.setMoney("500元");
            b.setUserName("这个值多少钱呀？大神们啊啊");
            list.add(b);
        }

        gridView.setAdapter(new CommonAdaper<HotGridBean>(context, list, R.layout.hot_information_grid_item) {
            @Override
            public void convert(ViewHolder holder, HotGridBean item) {
                holder.setText(R.id.dahua_user_title, item.getUserName());
                holder.setText(R.id.dahua_money_tv,item.getMoney());
            }
        });

    }
}
