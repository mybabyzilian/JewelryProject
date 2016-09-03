package com.example.admin.jewelry.homepage.hot_activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JINDAPENG on 2016/8/26.
 * 热门活动——详情页面
 */
public class HotDetailsActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private TextView activity_title, activity_theme_content, activity_rule_content, acticity_prize_content,
            acticity_create_time, acticity_status, acticity_amount;
    private GridView gridView;
    private HotBean hotBean;
    private HotDetailsBean hotDetailsBean;


    @Override
    public int setLayout() {
        return R.layout.activity_hot_details;
    }

    @Override
    protected void initView() {
        bindView(R.id.details_back_image).setOnClickListener(this);

        activity_title = bindView(R.id.activity_title);
        activity_theme_content = bindView(R.id.activity_theme_content);
        activity_rule_content = bindView(R.id.activity_rule_content);
        acticity_prize_content = bindView(R.id.acticity_prize_content);
        acticity_create_time = bindView(R.id.acticity_create_time);
        acticity_status = bindView(R.id.acticity_status);
        acticity_amount = bindView(R.id.acticity_amount);

        gridView = bindView(R.id.hot_details_grid_view);
        gridView.setOnItemClickListener(this);

        bindView(R.id.participate_hot_activity).setOnClickListener(this);

    }

    @Override
    protected void initData() {
        String url = "http://192.168.31.10:8081/boastJewelry/s_activity/query.do";

        Intent intent = getIntent();//getIntent将该项目中包含的原始intent检索出来，将检索出来的intent赋值给一个Intent类型的变量intent
        final Bundle bundle = intent.getExtras();//.getExtras()得到intent所附带的额外数据
        final String activity_id = bundle.getString("activity_id");//getString()返回指定key的值
        Map<String, String> maps = new HashMap<>();
        maps.put("user_id", "");
        maps.put("orderType", "");
        maps.put("activity_id", activity_id);
        OkHttpClientManager.postAsyn(url, new OkHttpClientManager.ResultCallback<HotBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(HotBean response) {
                Log.d("url", "onResponse: " + response);
                int i = Integer.valueOf(activity_id).intValue();

                activity_title.setText("活动标题:" + response.getObject().get(i).getActivity_title());
                activity_theme_content.setText("活动主题内容:" + response.getObject().get(i).getActivity_theme_content());
                activity_rule_content.setText("活动规则:" + response.getObject().get(i).getActivity_rule_content());
                acticity_prize_content.setText("活动奖励内容:" + response.getObject().get(i).getActicity_prize_content());
                acticity_create_time.setText("活动日期:" + response.getObject().get(i).getActicity_create_time());
                if (response.getObject().get(i).getActicity_status() == "1") {
                    acticity_status.setText("活动状态:进行中");
                    acticity_amount.setText("活动参与人数:" + response.getObject().get(i).getActicity_amount());
                } else {
                    acticity_status.setText("活动状态:已结束");
                    acticity_amount.setText("活动参与人数:" + response.getObject().get(i).getActicity_amount());
                }


            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.details_back_image:
                finish();
                break;
            case R.id.participate_hot_activity:
                Intent intent = new Intent(this, ParticipateHotActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
