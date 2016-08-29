package com.example.admin.jewelry.forhelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
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
    private OnlineDetailsBean onlineDetailsBean;
    private String url = "http://192.168.31.10:8081/boastJewelry/helpDownQ/info.do";
    private ImageView head_image;
    private TextView helpCount, payCount, help_title, goods_name, goods_size, goods_weight;
    private TextView attach_data, get_datetime, get_area, get_price, book_pic, ask_channel, help_info, remark_info, help_money;

    @Override
    public int setLayout() {
        return R.id.online_details_back_image;
    }

    @Override
    protected void initView() {
        //去掉手机状态栏
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        backImage = (ImageView) findViewById(R.id.online_details_back_image);
        backImage.setOnClickListener(this);

        head_image = bindView(R.id.head_image);
        helpCount = bindView(R.id.helpCount);
        payCount = bindView(R.id.payCount);

        help_title = bindView(R.id.help_title);
        goods_name = bindView(R.id.goods_name);
        goods_size = bindView(R.id.goods_size);
        goods_weight = bindView(R.id.goods_weight);
        attach_data = bindView(R.id.attach_data);
        get_datetime = bindView(R.id.get_datetime);
        get_area = bindView(R.id.get_area);
        get_price = bindView(R.id.get_price);
        book_pic = bindView(R.id.book_pic);
        ask_channel = bindView(R.id.ask_channel);
        help_info = bindView(R.id.help_info);
        remark_info = bindView(R.id.remark_info);
        help_money = bindView(R.id.help_money);

        askTv = (TextView) findViewById(R.id.i_answer);
        askTv.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();//getIntent将该项目中包含的原始intent检索出来，将检索出来的intent赋值给一个Intent类型的变量intent
        Bundle bundle = intent.getExtras();//.getExtras()得到intent所附带的额外数据
        String eid = bundle.getString("entity_id");//getString()返回指定key的值
        Map<String, String> maps = new HashMap<>();
        maps.put("eid", eid);

        OkHttpClientManager.postAsyn(url, new OkHttpClientManager.ResultCallback<OnlineDetailsBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(OnlineDetailsBean response) {
                String imageUrl = response.getObject().getInfo().getHelp_userHeadPic();
                Glide.with(getBaseContext()).load(imageUrl).into(head_image);

                helpCount.setText("求助次数：" + response.getObject().getHelpCount());
                payCount.setText("悬赏次数：" + response.getObject().getPayCount());
                help_title.setText("发布标题：" + response.getObject().getInfo().getHelp_title());
                goods_name.setText("鉴品名称：" + response.getObject().getInfo().getGoods_name());
                goods_size.setText("鉴品尺寸：" + response.getObject().getInfo().getGoods_size());
                goods_weight.setText("鉴品重量：" + response.getObject().getInfo().getGoods_weight());
                attach_data.setText("辅助材料：" + response.getObject().getInfo().getAttach_data());
                get_datetime.setText("入手时间：" + response.getObject().getInfo().getGet_datetime());
                get_area.setText("入手区域：" + response.getObject().getInfo().getGet_area());
                get_price.setText("入手价位：" + response.getObject().getInfo().getGet_price());
                book_pic.setText("有无证书：" + response.getObject().getInfo().getBook_pic());
                ask_channel.setText("鉴品方向：" + response.getObject().getInfo().getAsk_channel());
                help_info.setText("鉴品描述：" + response.getObject().getInfo().getHelp_info());
                remark_info.setText("补充说明：" + response.getObject().getInfo().getRemark_info());
                if (response.getObject().getInfo().getHelp_type() == "MONEY") {
                    help_money.setText("红包悬赏：" + response.getObject().getInfo().getHelp_money());
                } else {
                    help_money.setText("积分悬赏：" + response.getObject().getInfo().getHelp_money());
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
