package com.example.admin.jewelry.homepage;

import android.content.Intent;
import android.view.View;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.homepage.certificate.CertificateActivity;
import com.example.admin.jewelry.homepage.pricetrend.PriceTrendActivity;
import com.youth.banner.Banner;

/**
 * Created by admin on 2016/8/15.
 */
public class HomePageFragment extends BaseFragment implements View.OnClickListener {
    private Banner banner;


    @Override
    protected int setLayout() {
        return R.layout.hompage_fragment;
    }

    @Override
    protected void initView(View view) {
        banner = (Banner) view.findViewById(R.id.homepage_banner);
        // banner.setImages();
        banner.setDelayTime(3000);
        banner.setBannerStyle(Banner.ACCESSIBILITY_LIVE_REGION_ASSERTIVE);
        view.findViewById(R.id.certificate_query).setOnClickListener(this);
        view.findViewById(R.id.price_trend).setOnClickListener(this);
        view.findViewById(R.id.major_train).setOnClickListener(this);
        view.findViewById(R.id.qualification_certification).setOnClickListener(this);


    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.certificate_query:
                Intent intent = new Intent(context, CertificateActivity.class);
                context.startActivity(intent);
                break;
            case R.id.price_trend:
                Intent intent1 = new Intent(context, PriceTrendActivity.class);
                context.startActivity(intent1);
                break;
            case R.id.major_train:

                break;
            case R.id.qualification_certification:

                break;
        }
    }
}
