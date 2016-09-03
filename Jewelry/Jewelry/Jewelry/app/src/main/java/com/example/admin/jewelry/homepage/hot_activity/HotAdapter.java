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
        return hotBean == null ? 0 :hotBean.getObject().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.hot_list_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        if (hotBean.getObject().get(position).getActicity_status()=="1") {
            String imageUrl = hotBean.getObject().get(position).getActivity_picture_url();
            Glide.with(context).load(imageUrl).into(holder.underwayImg);
        } else {
            String imageUrl = hotBean.getObject().get(position).getActivity_picture_url();
            Glide.with(context).load(imageUrl).into(holder.underwayImg);
        }
        holder.titleTv.setText(hotBean.getObject().get(position).getActivity_title());
        holder.howTv.setText(hotBean.getObject().get(position).getActicity_amount() + "人参加");

        return convertView;
    }

    class ViewHolder {
        TextView titleTv,howTv;
        ImageView underwayImg;

        public ViewHolder(View view) {
            underwayImg = (ImageView) view.findViewById(R.id.underway_image);
            titleTv = (TextView) view.findViewById(R.id.activity_title_tv);
            howTv = (TextView) view.findViewById(R.id.how_people_tv);
        }
    }
}