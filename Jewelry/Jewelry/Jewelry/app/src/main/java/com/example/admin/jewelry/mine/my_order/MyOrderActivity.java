package com.example.admin.jewelry.mine.my_order;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.base.MyApp;
import com.example.admin.jewelry.forhelp.OnlineHelpFragment;

/**
 * Created by JINDAPENG on 2016/9/1.
 * 个人中心——我的订单
 */
public class MyOrderActivity extends BaseActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private RadioButton buyOrderRb, sellOrderRb;

    public int setLayout() {
        return R.layout.activity_my_order;
    }

    @Override
    protected void initView() {
        buyOrderRb = bindView(R.id.rb_my_buyorder);
        buyOrderRb.setOnClickListener(this);
        buyOrderRb.setOnCheckedChangeListener(this);
        sellOrderRb = bindView(R.id.rb_my_sellorder);
        sellOrderRb.setOnClickListener(this);
        sellOrderRb.setOnCheckedChangeListener(this);
    }

    @Override
    protected void initData() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.my_order_frame_layout, new BuyOrderFragment());
        fragmentTransaction.commit();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            compoundButton.setTextColor(Color.parseColor("#8f0303"));
        } else {
            compoundButton.setTextColor(Color.BLACK);
        }
    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.my_order_back_image:
                finish();
                break;
            case R.id.rb_my_buyorder:
                fragmentTransaction.replace(R.id.my_order_frame_layout, new BuyOrderFragment());
                break;
            case R.id.rb_my_sellorder:
                fragmentTransaction.replace(R.id.my_order_frame_layout, new SellOrderFragment());
                break;
        }
        fragmentTransaction.commit();
    }

}
