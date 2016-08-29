package com.example.admin.jewelry.homepage.jewerydisplay;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by admin on 2016/8/29.
 */
public class JewelryDisplayActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private RadioButton newProductRb,oldProductRb;
    @Override
    public int setLayout() {
        return R.layout.activity_display;
    }

    @Override
    protected void initView() {
        newProductRb = (RadioButton) findViewById(R.id.rb_display_new);
        oldProductRb = (RadioButton) findViewById(R.id.rb_display_old);
        oldProductRb.setOnCheckedChangeListener(this);
        newProductRb.setOnCheckedChangeListener(this);
        oldProductRb.setOnClickListener(this);
        newProductRb.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.jewelry_display_frame, new JewelryOldFragment());
        fragmentTransaction.commit();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            compoundButton.setTextColor(Color.parseColor("#8f0303"));
        } else {
            compoundButton.setTextColor(Color.GRAY);
        }
    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()){
            case R.id.rb_display_old:
                fragmentTransaction.replace(R.id.jewelry_display_frame, new JewelryOldFragment());
                break;
            case R.id.rb_display_new:
                fragmentTransaction.replace(R.id.jewelry_display_frame, new JewelryNewFragment());
                break;
        }
        fragmentTransaction.commit();

    }
}
