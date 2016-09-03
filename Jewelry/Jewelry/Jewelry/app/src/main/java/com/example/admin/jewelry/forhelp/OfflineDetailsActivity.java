package com.example.admin.jewelry.forhelp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.forhelp.bean.OfflineDetailsBean;
import com.example.admin.jewelry.forhelp.bean.OnlineDetailsBean;
import com.example.admin.jewelry.forhelp.release.AnswerActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JINDAPENG on 2016/8/25.
 * 线下预约的二级界面——线下鉴品详情页面
 */
public class OfflineDetailsActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backImage;
    private TextView askTv;
    private OfflineDetailsBean offlineDetailsBean;
    private String url = "http://192.168.31.10:8081/boastJewelry/helpDownQ/info.do";
    private ImageView head_image;
    private TextView helpCount, payCount, help_title, goods_name;
    private TextView get_area, ask_channel, help_info, remark_info, help_money;

    @Override
    public int setLayout() {
        return R.id.online_details_back_image;
    }

    @Override
    protected void initView() {
        backImage = bindView(R.id.online_details_back_image);
        backImage.setOnClickListener(this);

        head_image = bindView(R.id.head_image);
        helpCount = bindView(R.id.helpCount);
        payCount = bindView(R.id.payCount);

        help_title = bindView(R.id.help_title);
        goods_name = bindView(R.id.goods_name);
        get_area = bindView(R.id.get_area);

        ask_channel = bindView(R.id.ask_channel);
        help_info = bindView(R.id.help_info);
        remark_info = bindView(R.id.remark_info);
        help_money = bindView(R.id.help_money);

        askTv = bindView(R.id.i_answer);
        askTv.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();//getIntent将该项目中包含的原始intent检索出来，将检索出来的intent赋值给一个Intent类型的变量intent
        Bundle bundle = intent.getExtras();//.getExtras()得到intent所附带的额外数据
        String eid = bundle.getString("entity_Id");//getString()返回指定key的值
        Map<String, String> maps = new HashMap<>();
        maps.put("eid", eid);

        OkHttpClientManager.postAsyn(url, new OkHttpClientManager.ResultCallback<OfflineDetailsBean>() {
            @Override
            public void onError(Request request, Exception e) {
                Log.d("details", "onError: " + e);
            }

            @Override
            public void onResponse(OfflineDetailsBean response) {
                Log.d("url", "onResponse: " + response);
                String imageUrl = response.getObject().getInfo().getHelp_userHeadPic();
                Glide.with(getBaseContext()).load(imageUrl).into(head_image);

                helpCount.setText("求助次数：" + response.getObject().getHelpCount());
                payCount.setText("悬赏次数：" + response.getObject().getPayCount());
                help_title.setText("发布标题：" + response.getObject().getInfo().getHelp_title());

                get_area.setText("区域信息：" + response.getObject().getInfo().getCity_name());
                goods_name.setText("求助群体：" + response.getObject().getInfo().getHelp_userTypeName());

                ask_channel.setText("鉴品方向：" + response.getObject().getInfo().getAsk_channel());
                help_info.setText("鉴品描述：" + response.getObject().getInfo().getHelp_info());
                remark_info.setText("补充说明：" + response.getObject().getInfo().getRemark_info());

                if (response.getObject().getInfo().getHelp_money() == "MONEY") {
                    help_money.setText("积分悬赏：" + response.getObject().getInfo().getHelp_money());
                } else {
                    help_money.setText("红包悬赏：" + response.getObject().getInfo().getHelp_money());
                }
            }
        }, maps);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.online_details_back_image:
                finish();
                break;
            case R.id.i_answer:
                Intent intent = new Intent(this, AnswerActivity.class);
                startActivity(intent);
                break;
        }
    }
}
