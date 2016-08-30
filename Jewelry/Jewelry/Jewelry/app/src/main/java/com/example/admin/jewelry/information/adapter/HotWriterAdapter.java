package com.example.admin.jewelry.information.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;


/**
 * Created by JINDAPENG on 2016/8/16.
 */
public class HotWriterAdapter extends BaseAdapter {
    private Context context;

    public HotWriterAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 10;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.hot_writer_listview_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_number.setText(String.valueOf(position + 1));
        return convertView;
    }

    class ViewHolder {
        ImageView imageView;
        TextView tv_number, tv_worker, tv_gemmologist, tv_grade, tv_article_quantity, tv_read_quantity;

        public ViewHolder(View view) {
            imageView = (ImageView) view.findViewById(R.id.image_view);
            tv_number = (TextView) view.findViewById(R.id.tv_number);
            tv_worker = (TextView) view.findViewById(R.id.tv_worker);
            tv_gemmologist = (TextView) view.findViewById(R.id.tv_gemmologist);
            tv_grade = (TextView) view.findViewById(R.id.tv_article_quantity);
            tv_article_quantity = (TextView) view.findViewById(R.id.tv_article_quantity);
            tv_read_quantity = (TextView) view.findViewById(R.id.tv_read_quantity);

        }
    }
}
