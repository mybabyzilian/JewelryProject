package com.example.admin.jewelry.mine.my_home_page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;

/**
 * Created by JINDAPENG on 2016/8/29.
 */
public class MyReleaseAdapter extends BaseAdapter {
    private Context context;

    public MyReleaseAdapter(Context context) {
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
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(context)
                    .inflate(R.layout.my_release_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        return view;
    }
    class ViewHolder {
        TextView title, time;
        ImageView imageView;

        public ViewHolder(View itemView) {
            title = (TextView) itemView.findViewById(R.id.how_macth_tv);
            time = (TextView) itemView.findViewById(R.id.collection_time_tv);
            imageView = (ImageView) itemView.findViewById(R.id.my_home_head_img);

        }

    }

}
