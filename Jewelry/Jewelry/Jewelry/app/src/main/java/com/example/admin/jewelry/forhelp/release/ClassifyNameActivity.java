package com.example.admin.jewelry.forhelp.release;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.forhelp.bean.PopuBean;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by JINDAPENG on 2016/8/17.
 * 分类名称
 */
public class ClassifyNameActivity extends BaseActivity implements View.OnClickListener, AdapterView.OnItemClickListener {
    private ListView listView;
    private ImageView backImage;
    private PopuBean bean;
    private RelativeLayout jade_rl,gem_rl,amusement_rl,other_rl;

    @Override
    public int setLayout() {
        return R.layout.activity_forhelp_classify;
    }

    @Override
    protected void initView() {
        backImage = bindView(R.id.classify_back_image);
        backImage.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        Map<String, String> map = new HashMap<>();
        map.put("entity_id", "1");
        OkHttpClientManager.postAsyn(Urls.ONLINE_POPU_URL, new OkHttpClientManager.ResultCallback<PopuBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(PopuBean response) {
                bean = response;
            }

        }, map);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.classify_back_image:
                finish();
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }
}
