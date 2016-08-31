package com.example.admin.jewelry.homepage.jewerydisplay;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.base.NoScrollGridView;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;
import com.youth.banner.Banner;

import java.util.HashMap;
import java.util.Map;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by admin on 2016/8/29.
 */
public class NewDetailActivity extends BaseActivity {
    private Banner banner;
    private NoScrollGridView gridView;
    private TextView goodsTv, oldPriceTv, scalPriceTv, sortTv, styleTv, describeTv, nickTv, nameTv;
    private LinearLayout newShareLayout, otherLayout;
    private ImageView userIv;
    private String[] i = {};
    private String id = "";

    @Override
    public int setLayout() {
        return R.layout.activity_new_detail;
    }

    @Override
    protected void initView() {
        banner = bindView(R.id.new_detail_banner);
        gridView = bindView(R.id.new_no_scroll);
        goodsTv = bindView(R.id.new_detailGood_name);
        oldPriceTv = bindView(R.id.new_detail_oldprice);
        scalPriceTv = bindView(R.id.new_detail_saleprice);
        newShareLayout = bindView(R.id.new_share_layout);
        sortTv = bindView(R.id.new_detail_sort);
        styleTv = bindView(R.id.new_detail_style);
        describeTv = bindView(R.id.new_detail_describe);
        nickTv = bindView(R.id.new_user_nick);
        nameTv = bindView(R.id.new_user_name);
        otherLayout = bindView(R.id.new_other_layout);
        userIv = bindView(R.id.new_user_iv);


    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        id = intent.getStringExtra("id");
        Map<String, String> map = new HashMap<>();
        map.put("eid", id);
        map.put("user_id", "");
        OkHttpClientManager.postAsyn(Urls.JEWELRY_DISPLAY_NEW_DETAIL_URL, new OkHttpClientManager.ResultCallback<NewDetailBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(NewDetailBean response) {
                goodsTv.setText(response.getObject().getInfo().getGoods_name());
                oldPriceTv.setText("零售:"+response.getObject().getInfo().getGoods_oldPrice());
                scalPriceTv.setText("平台:"+response.getObject().getInfo().getGoods_salePrice());
                sortTv.setText("品类:"+response.getObject().getInfo().getCategory_name());
                styleTv.setText("款式:"+response.getObject().getInfo().getStyle_name());
                nickTv.setText(response.getObject().getInfo().getUserNickName());
                nameTv.setText(response.getObject().getInfo().getUserIdTitle());
                describeTv.setText("款式:"+response.getObject().getInfo().getGoods_info());
                Picasso.with(NewDetailActivity.this).load(response.getObject().getInfo().getUserHeadPic()).into(userIv);
               // i[0] = response.getObject().getInfo().getGoods_facePic();
               // banner.setImages(i);
               // banner.setDelayTime(2000);

            }
        }, map);


    }
}
