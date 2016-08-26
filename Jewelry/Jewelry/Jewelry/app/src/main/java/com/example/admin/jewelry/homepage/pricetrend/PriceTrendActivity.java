package com.example.admin.jewelry.homepage.pricetrend;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.CertifacateFragment;
import com.example.admin.jewelry.jewelrymap.JewelryMapActivity;

/**
 * Created by admin on 2016/8/16.
 */
public class PriceTrendActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private RadioButton priceRb, brandRb;
    private ImageView returnIv,mapIv;


    @Override
    public int setLayout() {
        return R.layout.activity_tend;
    }

    @Override
    protected void initView() {
        priceRb = (RadioButton) findViewById(R.id.rb_trend);
        brandRb = (RadioButton) findViewById(R.id.rb_brand);
        mapIv = (ImageView) findViewById(R.id.trend_map);
        returnIv = (ImageView) findViewById(R.id.trend_return);
        priceRb.setOnClickListener(this);
        brandRb.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        priceRb.setOnCheckedChangeListener(this);
        brandRb.setOnCheckedChangeListener(this);
        mapIv.setOnClickListener(this);
        returnIv.setOnClickListener(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.price_trend_frame, new CertifacateFragment());
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
        switch (view.getId()) {
            case R.id.rb_trend:
                fragmentTransaction.replace(R.id.price_trend_frame, new DapanTrendFragment());
                break;
            case R.id.rb_brand:
                fragmentTransaction.replace(R.id.price_trend_frame, new BrandPriceFragment());
                break;
            case R.id.trend_return:
                finish();
                break;
            case R.id.trend_map:
                Intent intent = new Intent(this, JewelryMapActivity.class);
                startActivity(intent);
                break;
        }
        fragmentTransaction.commit();
    }
}
