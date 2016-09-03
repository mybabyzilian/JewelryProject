package com.example.admin.jewelry.mine;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.mine.my_account.MyAccountActivity;
import com.example.admin.jewelry.mine.my_baby.MyBabyActivity;
import com.example.admin.jewelry.mine.my_collection.MyCollectionActivity;
import com.example.admin.jewelry.mine.my_home_page.MyHomePageActivity;
import com.example.admin.jewelry.mine.my_issue.MyIssueActivity;
import com.example.admin.jewelry.mine.my_order.MyOrderActivity;
import com.example.admin.jewelry.mine.my_participate.MyParticipateActivity;
import com.example.admin.jewelry.mine.my_setting.MySettingActivity;
import com.example.admin.jewelry.mine.my_store.MyStoreActivity;

/**
 * Created by admin on 2016/8/15.
 */
public class MineFragment extends BaseFragment implements View.OnClickListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private RelativeLayout relativeLayout;

    @Override
    protected int setLayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView(View view) {
        view.findViewById(R.id.my_home_page_rl).setOnClickListener(this);//我的主页
        view.findViewById(R.id.my_account_rl).setOnClickListener(this);//我的账户
        view.findViewById(R.id.my_issue_rl).setOnClickListener(this);//我的发布
        view.findViewById(R.id.my_collection_rl).setOnClickListener(this);//我的收藏
        view.findViewById(R.id.my_participate_rl).setOnClickListener(this);// 我的参与
        view.findViewById(R.id.my_store_rl).setOnClickListener(this);//我的店铺
        view.findViewById(R.id.my_baby_rl).setOnClickListener(this);//宝贝管理
        view.findViewById(R.id.my_order_rl).setOnClickListener(this);//订单管理
        view.findViewById(R.id.my_setting_rl).setOnClickListener(this);//设置
    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.my_home_page_rl:
                Intent intent_home = new Intent(context, MyHomePageActivity.class);
                startActivity(intent_home);
                break;
            case R.id.my_account_rl:
                Intent intent_account = new Intent(context, MyAccountActivity.class);
                startActivity(intent_account);
                break;
            case R.id.my_issue_rl:
                Intent intent_issue = new Intent(context, MyIssueActivity.class);
                startActivity(intent_issue);
                break;
            case R.id.my_collection_rl:
                Intent intent_collection = new Intent(context, MyCollectionActivity.class);
                startActivity(intent_collection);
                break;
            case R.id.my_participate_rl:
                Intent intent_participate = new Intent(context, MyParticipateActivity.class);
                startActivity(intent_participate);
                break;
            case R.id.my_store_rl:
                Intent intent_store = new Intent(context, MyStoreActivity.class);
                startActivity(intent_store);
                break;
            case R.id.my_baby_rl:
                Intent intent_baby = new Intent(context, MyBabyActivity.class);
                startActivity(intent_baby);
                break;
            case R.id.my_order_rl:
                Intent intent_order = new Intent(context, MyOrderActivity.class);
                startActivity(intent_order);
                break;
            case R.id.my_setting_rl:
                Intent intent_set = new Intent(context, MySettingActivity.class);
                startActivity(intent_set);
                break;

        }

    }
}
