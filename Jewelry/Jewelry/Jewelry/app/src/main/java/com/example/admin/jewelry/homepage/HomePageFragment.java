package com.example.admin.jewelry.homepage;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.certificate.CertificateActivity;
import com.example.admin.jewelry.homepage.MajorTrain.MajorTrainActivity;
import com.example.admin.jewelry.homepage.exclusive.ExpandConnectionActivity;
import com.example.admin.jewelry.homepage.exclusive.IssueWindowsActivity;
import com.example.admin.jewelry.homepage.exclusive.SearchRimActivity;
import com.example.admin.jewelry.homepage.exclusive.SeekServiceActivity;
import com.example.admin.jewelry.homepage.hot_activity.HotActivity;
import com.example.admin.jewelry.homepage.integral.IntegralStoreActivity;
import com.example.admin.jewelry.homepage.pricetrend.PriceTrendActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.QualificationActivity;
import com.youth.banner.Banner;


/**
 * Created by admin on 2016/8/15.
 * 首页页面
 */
public class HomePageFragment extends BaseFragment implements View.OnClickListener {
    private Banner banner;
    private LinearLayout hotLinear, integralLinear, seek_service, search_rim, expand_connection, issue_windows;


    @Override
    protected int setLayout() {
        return R.layout.hompage_fragment;
    }

    @Override
    protected void initView(View view) {
        banner = (Banner) view.findViewById(R.id.homepage_banner);
        banner.setDelayTime(3000);
        banner.setBannerStyle(Banner.ACCESSIBILITY_LIVE_REGION_ASSERTIVE);
        view.findViewById(R.id.certificate_query).setOnClickListener(this);
        view.findViewById(R.id.price_trend).setOnClickListener(this);
        view.findViewById(R.id.major_train).setOnClickListener(this);
        view.findViewById(R.id.qualification_certification).setOnClickListener(this);

        view.findViewById(R.id.integral_store).setOnClickListener(this);
        view.findViewById(R.id.hot_activity).setOnClickListener(this);
        view.findViewById(R.id.seek_service).setOnClickListener(this);
        view.findViewById(R.id.search_rim).setOnClickListener(this);
        view.findViewById(R.id.expand_connection).setOnClickListener(this);
        view.findViewById(R.id.issue_windows).setOnClickListener(this);
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
                Intent intent2 = new Intent(context, MajorTrainActivity.class);
                context.startActivity(intent2);
                break;
            case R.id.qualification_certification:
                Intent intent3 = new Intent(context, QualificationActivity.class);
                context.startActivity(intent3);
                break;
            case R.id.integral_store:
                Intent intent4 = new Intent(getContext(), IntegralStoreActivity.class);
                startActivity(intent4);
                break;
            case R.id.hot_activity:
                Intent intent5 = new Intent(getContext(), HotActivity.class);
                startActivity(intent5);
                break;
            case R.id.seek_service:
                Intent intent6 = new Intent(getContext(), SeekServiceActivity.class);
                startActivity(intent6);
                break;
            case R.id.search_rim:
                Intent intent7 = new Intent(getContext(), SearchRimActivity.class);
                startActivity(intent7);
                break;
            case R.id.expand_connection:
                Intent intent8 = new Intent(getContext(), ExpandConnectionActivity.class);
                startActivity(intent8);
                break;
            case R.id.issue_windows:
                Intent intent9 = new Intent(getContext(), IssueWindowsActivity.class);
                startActivity(intent9);
                break;
        }
    }
}
