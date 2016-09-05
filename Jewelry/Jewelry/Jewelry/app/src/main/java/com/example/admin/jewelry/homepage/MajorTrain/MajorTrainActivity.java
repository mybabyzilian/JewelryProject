package com.example.admin.jewelry.homepage.MajorTrain;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.CommonAdaper;
import com.example.admin.jewelry.Utils.PopuWindowBase;
import com.example.admin.jewelry.Utils.RefreshListView;
import com.example.admin.jewelry.Utils.ViewHolder;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/8/25.
 * 专业培训
 */
public class MajorTrainActivity extends BaseActivity implements View.OnClickListener {
    private LinearLayout sortLayout, mechanismLayout, timeLayout, cityLayout;
    private View popuView;
    private ImageView sortIv, mechanismIv, timeIv, cityIv;
    private ListView popuList;
    private List<MajorPopuBean.ObjectBean.DtrainCategoryBean> sortList;
    private List<MajorPopuBean.ObjectBean.DtrainMechanismBean> mecList;
    private List<MajorPopuBean.ObjectBean.DtrainTimeBean> timeList;
    private List<MajorPopuBean.ObjectBean.DtrainCityBean> cityList;
    private RefreshListView listView;
    private List<MajorBean.ObjectBean> data;
    private Banner banner;


    @Override
    public int setLayout() {
        return R.layout.activity_major;
    }

    @Override
    protected void initView() {
        sortIv = bindView(R.id.sort_major_iv);
        mechanismIv = bindView(R.id.mechanism_major_iv);
        timeIv = bindView(R.id.major_time_iv);
        cityIv = bindView(R.id.major_city_iv);
        data = new ArrayList<>();
        sortLayout = bindView(R.id.sort_major_layout);
        mechanismLayout = bindView(R.id.mechanism_major_layout);
        timeLayout = bindView(R.id.major_time_layout);
        cityLayout = bindView(R.id.major_city_layout);
        popuView = LayoutInflater.from(this).inflate(R.layout.view_popu, null);
        popuList = (ListView) popuView.findViewById(R.id.popu_list);
        listView = (RefreshListView) findViewById(R.id.major_list_view);
        banner = bindView(R.id.major_train_banner);

    }

    @Override
    protected void initData() {
        sortList = new ArrayList<>();
        timeList = new ArrayList<>();
        mecList = new ArrayList<>();
        cityList = new ArrayList<>();
        data = new ArrayList<>();
        sortLayout.setOnClickListener(this);
        mechanismLayout.setOnClickListener(this);
        timeLayout.setOnClickListener(this);
        cityLayout.setOnClickListener(this);

        OkHttpClientManager.postAsyn(Urls.MAJOR_BANNER_URL, new OkHttpClientManager.ResultCallback<BannerBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(BannerBean response) {
                List<String> urls = new ArrayList<String>();
                for (int i = 0; i <response.getObject().size() ; i++) {
                    urls.add(response.getObject().get(i).getBanner_image_url());
                }
                banner.setImages(urls);
                banner.setDelayTime(3000);
                banner.setBannerStyle(Banner.FIND_VIEWS_WITH_TEXT);

            }
        });


        OkHttpClientManager.postAsyn(Urls.MAJOR_POPU_URL, new OkHttpClientManager.ResultCallback<MajorPopuBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(MajorPopuBean response) {
                sortList.addAll(response.getObject().getDtrainCategory());
                timeList.addAll(response.getObject().getDtrainTime());
                mecList.addAll(response.getObject().getDtrainMechanism());
                cityList.addAll(response.getObject().getDtrainCity());
            }
        });


        OkHttpClientManager.postAsyn(Urls.MAJOR_URL, new OkHttpClientManager.ResultCallback<MajorBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(MajorBean response) {
                data.addAll(response.getObject());
                listView.setAdapter(new CommonAdaper<MajorBean.ObjectBean>(MajorTrainActivity.this, data, R.layout.major_item) {
                    @Override
                    public void convert(ViewHolder holder, final MajorBean.ObjectBean item) {
                        holder.setText(R.id.major_item_tv, item.getTrain_course_title());
                        holder.setText(R.id.mec_item_tv, item.getTrain_mechanism());
                        holder.setText(R.id.major_item_date, item.getTrain_course_start_date());
                        holder.setText(R.id.major_item_city, item.getTrain_city());

                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                                Intent intent = new Intent(MajorTrainActivity.this,MajorDetailActivity.class);
                                intent.putExtra("sort",item.getTrain_category());
                                intent.putExtra("name",item.getTrain_course_title());
                                intent.putExtra("place",item.getTrain_address());
                                intent.putExtra("date",item.getTrain_course_start_date());
                                intent.putExtra("cycle",item.getTrain_cycle());
                                intent.putExtra("kecheng",item.getTrain_mechanism());
                                intent.putExtra("zhenghsu",item.getTrain_certificates_available());
                                intent.putExtra("cost",item.getTrain_cost());
                                intent.putExtra("phone",item.getTrain_phone());
                                intent.putExtra("shuoming",item.getTrain_description());
                                startActivity(intent);
                            }
                        });

                    }
                });
            }
        });

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sort_major_layout:

                popuList.setAdapter(new CommonAdaper<MajorPopuBean.ObjectBean.DtrainCategoryBean>(MajorTrainActivity.this, sortList, R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, MajorPopuBean.ObjectBean.DtrainCategoryBean item) {
                        holder.setText(R.id.popu_item_tv, item.getNames());

                    }
                });
                sortIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout, popuView, this, sortIv);
                break;
            case R.id.mechanism_major_layout:

                popuList.setAdapter(new CommonAdaper<MajorPopuBean.ObjectBean.DtrainMechanismBean>(MajorTrainActivity.this, mecList, R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, MajorPopuBean.ObjectBean.DtrainMechanismBean item) {
                        holder.setText(R.id.popu_item_tv, item.getNames());
                    }
                });
                mechanismIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout, popuView, this, mechanismIv);
                break;
            case R.id.major_time_layout:

                popuList.setAdapter(new CommonAdaper<MajorPopuBean.ObjectBean.DtrainTimeBean>(MajorTrainActivity.this, timeList, R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, MajorPopuBean.ObjectBean.DtrainTimeBean item) {
                        holder.setText(R.id.popu_item_tv, item.getNames());
                    }
                });
                timeIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout, popuView, this, timeIv);
                break;
            case R.id.major_city_layout:
                popuList.setAdapter(new CommonAdaper<MajorPopuBean.ObjectBean.DtrainCityBean>(MajorTrainActivity.this, cityList, R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, MajorPopuBean.ObjectBean.DtrainCityBean item) {
                        holder.setText(R.id.popu_item_tv, item.getNames());
                    }
                });
                cityIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout, popuView, this, cityIv);
                break;

        }

    }
}
