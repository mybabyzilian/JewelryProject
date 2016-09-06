package com.example.admin.jewelry.mine.my_home_page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.jewelry.R;

/**
 * Created by JINDAPENG on 2016/8/30.
 */
public class MyCommentsAdapter extends BaseAdapter {
    private Context context;


    public MyCommentsAdapter(Context context) {
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
                    .inflate(R.layout.my_comments_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        return view;
    }
    class ViewHolder {
        TextView title, ask, substance, time;

        public ViewHolder(View itemView) {
            title = (TextView) itemView.findViewById(R.id.comments_title);
            ask = (TextView) itemView.findViewById(R.id.comments_ask);
            substance = (TextView) itemView.findViewById(R.id.comments_substance);
            time = (TextView) itemView.findViewById(R.id.comments_time);

        }

    }

}
