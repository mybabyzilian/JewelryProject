package com.example.admin.jewelry.homepage.exclusive.rim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.admin.jewelry.R;

/**
 * Created by JINDAPENG on 2016/9/5.
 */
public class RimAdapter extends BaseAdapter{
    private Context context;

    public RimAdapter(Context context) {
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
            view = LayoutInflater.from(context).inflate(R.layout.rim_merchants_list_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        return view;
    }
    class ViewHolder {
        TextView name,address,distance;
        ImageView mapImg;
        LinearLayout details,gotoTv;

        public ViewHolder(View view) {
            mapImg = (ImageView) view.findViewById(R.id.rim_merchants_map_img);
            name = (TextView) view.findViewById(R.id.rim_merchants_name_tv);
            address = (TextView) view.findViewById(R.id.rim_merchants_address);
            distance = (TextView) view.findViewById(R.id.rim_merchants_distance);
            details = (LinearLayout) view.findViewById(R.id.rim_merchants_details);
            gotoTv = (LinearLayout) view.findViewById(R.id.rim_merchants_goto);
        }
    }
}
