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
 * Created by JINDAPENG on 2016/8/31.
 */
public class MyBabyAdapter extends BaseAdapter {
    private Context context;
    private BabyBean babyBean;

    public MyBabyAdapter(Context context) {
        this.context = context;
    }

    public void setBabyBean(BabyBean babyBean) {
        this.babyBean = babyBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return babyBean == null ? 0 : babyBean.getObject().getList().size();
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
                    .inflate(R.layout.baby_management_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

            String imageUrl = babyBean.getObject().getList().get(i).getGoods_facePic();
            Glide.with(context).load(imageUrl).into(holder.goods_facePic);

            holder.goods_name.setText(babyBean.getObject().getList().get(i).getGoods_name());
            holder.goods_salePrice.setText(babyBean.getObject().getList().get(i).getGoods_salePrice());
            holder.create_time.setText(babyBean.getObject().getList().get(i).getCreate_time());
        }
        return view;
    }

    class ViewHolder {
        ImageView goods_facePic;
        TextView goods_name, goods_salePrice, create_time;

        public ViewHolder(View itemView) {
            goods_facePic = (ImageView) itemView.findViewById(R.id.my_baby_image_view);
            goods_name = (TextView) itemView.findViewById(R.id.my_baby_name);
            goods_salePrice = (TextView) itemView.findViewById(R.id.my_baby_price);
            create_time = (TextView) itemView.findViewById(R.id.my_baby_time);

        }

    }
}