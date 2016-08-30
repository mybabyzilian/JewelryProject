package com.example.admin.jewelry.homepage.integral.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.homepage.integral.bean.HeadViewBean;

import java.util.ArrayList;

import it.sephiroth.android.library.picasso.Picasso;

/**
 * Created by JINDAPENG on 2016/8/18.
 */
public class HeadViewAdapter extends PagerAdapter {
    private ArrayList<HeadViewBean.ObjectBean.AdvertlistBean> images;
    private Context context;

    public HeadViewAdapter(Context context) {
        this.context = context;
    }

    public void setImages(ArrayList<HeadViewBean.ObjectBean.AdvertlistBean> images) {
        this.images = images;
    }

    @Override
    public int getCount() {
        return 1000;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View v = LayoutInflater.from(context).inflate(R.layout.head_view_item, null);// 绑定布局
        // 加载图片
        ImageView iv = (ImageView) v.findViewById(R.id.head_image_view);
        Picasso.with(context).load(images.get(position % images.size()).getAdvert_pic()).into(iv);
        container.addView(v);
        return v;
    }
}
