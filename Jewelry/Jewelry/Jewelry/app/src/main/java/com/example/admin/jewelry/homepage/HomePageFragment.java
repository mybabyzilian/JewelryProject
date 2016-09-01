package com.example.admin.jewelry.homepage;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.TipView;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.homepage.MajorTrain.MajorTrainActivity;
import com.example.admin.jewelry.homepage.certificate.CertificateActivity;
import com.example.admin.jewelry.homepage.exclusive.ExpandConnectionActivity;
import com.example.admin.jewelry.homepage.exclusive.IssueWindowsActivity;
import com.example.admin.jewelry.homepage.exclusive.SearchRimActivity;
import com.example.admin.jewelry.homepage.exclusive.SeekServiceActivity;
import com.example.admin.jewelry.homepage.hot_activity.HotActivity;
import com.example.admin.jewelry.homepage.integral.IntegralStoreActivity;
import com.example.admin.jewelry.homepage.jewerydisplay.JewelryDisplayActivity;
import com.example.admin.jewelry.homepage.pricetrend.PriceTrendActivity;
import com.example.admin.jewelry.homepage.qualificationcertification.QualificationActivity;
import com.example.admin.jewelry.jewelrymap.JewelryMapActivity;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by admin on 2016/8/15.
 * 首页页面
 */
public class HomePageFragment extends BaseFragment implements View.OnClickListener {
    private Banner banner;
    private EditText editText;
    private LinearLayout hotLinear, integralLinear;
    private String[] url = {"http://img4.duitang.com/uploads/item/201512/18/20151218141838_UdZGf.jpeg",
            "http://img0.imgtn.bdimg.com/it/u=2604831194,922890958&fm=11&gp=0.jpg"};
    private TipView tipView;
    private static final String TIP_PREFIX = "this is tip No.";


    @Override
    protected int setLayout() {
        return R.layout.hompage_fragment;
    }

    @Override
    protected void initView(View view) {
        banner = (Banner) view.findViewById(R.id.homepage_banner);

        banner.setImages(url);

        banner.setDelayTime(2000);
        banner.setBannerStyle(Banner.ACCESSIBILITY_LIVE_REGION_ASSERTIVE);
        //    editText = (EditText) view.findViewById(R.id.homepage_search);
        view.findViewById(R.id.certificate_query).setOnClickListener(this);
        view.findViewById(R.id.price_trend).setOnClickListener(this);
        view.findViewById(R.id.major_train).setOnClickListener(this);
        view.findViewById(R.id.qualification_certification).setOnClickListener(this);

        hotLinear = (LinearLayout) view.findViewById(R.id.hot_activity);
        hotLinear.setOnClickListener(this);

        view.findViewById(R.id.homepage_jewelry_map).setOnClickListener(this);
        view.findViewById(R.id.jewelry_display_layout).setOnClickListener(this);


        integralLinear = (LinearLayout) view.findViewById(R.id.integral_store);
        integralLinear.setOnClickListener(this);

        view.findViewById(R.id.integral_store).setOnClickListener(this);
        view.findViewById(R.id.hot_activity).setOnClickListener(this);
        view.findViewById(R.id.seek_service).setOnClickListener(this);
        view.findViewById(R.id.search_rim).setOnClickListener(this);
        view.findViewById(R.id.expand_connection).setOnClickListener(this);
        view.findViewById(R.id.issue_windows).setOnClickListener(this);
        tipView = (TipView) view.findViewById(R.id.homepage_tip_view);
    }

    @Override
    protected void initData() {
        tipView.setTipList(generateTips());
    }

    private List<String> generateTips() {
        List<String> tips = new ArrayList<>();
        for (int i = 100; i < 120; i++) {
            tips.add(TIP_PREFIX + i);
        }
        return tips;
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
                Intent intent3 = new Intent(context, MajorTrainActivity.class);
                context.startActivity(intent3);
                break;
            case R.id.qualification_certification:
                Intent intent2 = new Intent(context, QualificationActivity.class);
                context.startActivity(intent2);
                break;
            case R.id.homepage_jewelry_map:
                Intent intent4 = new Intent(context, JewelryMapActivity.class);
                context.startActivity(intent4);
                break;

            case R.id.integral_store:
                Intent intent9 = new Intent(getContext(), IntegralStoreActivity.class);
                startActivity(intent9);
                break;
            case R.id.hot_activity:
                Intent intent10 = new Intent(getContext(), HotActivity.class);
                startActivity(intent10);
                break;
            case R.id.seek_service:
                Intent intent6 = new Intent(context, SeekServiceActivity.class);
                context.startActivity(intent6);
                break;
            case R.id.search_rim:
                Intent intent7 = new Intent(context, SearchRimActivity.class);
                context.startActivity(intent7);
                break;
            case R.id.expand_connection:
                Intent intent8 = new Intent(context, ExpandConnectionActivity.class);
                context.startActivity(intent8);
                break;
            case R.id.issue_windows:
                Intent intent12 = new Intent(getContext(), IssueWindowsActivity.class);
                startActivity(intent12);
                break;
            case R.id.jewelry_display_layout:
                Intent intent11 = new Intent(context, JewelryDisplayActivity.class);
                context.startActivity(intent11);
                break;
        }
    }
}
