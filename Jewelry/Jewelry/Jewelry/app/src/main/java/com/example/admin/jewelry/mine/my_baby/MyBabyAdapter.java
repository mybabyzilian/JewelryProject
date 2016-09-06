package com.example.admin.jewelry.mine.my_baby;

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
 * Created by JINDAPENG on 2016/9/5.
 */
public class MyBabyAdapter extends BaseAdapter {
    private Context context;

    public MyBabyAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 10;
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
            view = LayoutInflater.from(context).inflate(R.layout.baby_management_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        return view;
    }

    class ViewHolder {
        ImageView babyImg;
        TextView baby_shelves;

        public ViewHolder(View view) {
            babyImg = (ImageView) view.findViewById(R.id.my_baby_image_view);
            baby_shelves = (TextView) view.findViewById(R.id.my_baby_shelves);
        }

    }
}
