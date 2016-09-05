package com.example.admin.jewelry.homepage.hot_activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.jewelry.R;

/**
 * Created by JINDAPENG on 2016/8/22.
 */
public class HotAdapter extends BaseAdapter {
    private Context context;
    private HotBean hotBean;

    public HotAdapter(Context context) {
        this.context = context;
    }

    public void setHotBean(HotBean hotBean) {
        this.hotBean = hotBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return hotBean == null ? 0 : hotBean.getObject().size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.hot_list_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        if (hotBean.getObject().get(i).getActicity_status() == "1") {
            String imageUrl = hotBean.getObject().get(i).getActivity_picture_url();
            Glide.with(context).load(imageUrl).into(holder.underwayImg);
        } else {
            String imageUrl = hotBean.getObject().get(i).getActivity_picture_url();
            Glide.with(context).load(imageUrl).into(holder.underwayImg);
        }
        holder.titleTv.setText(hotBean.getObject().get(i).getActivity_title());
        holder.howTv.setText(hotBean.getObject().get(i).getActicity_amount() + "人参加");

        return view;
    }

    class ViewHolder {
        TextView titleTv, howTv;
        ImageView underwayImg;

        public ViewHolder(View view) {
            underwayImg = (ImageView) view.findViewById(R.id.underway_image);
            titleTv = (TextView) view.findViewById(R.id.activity_title_tv);
            howTv = (TextView) view.findViewById(R.id.how_people_tv);
        }
    }
}

