package com.example.admin.jewelry.homepage.integral.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.homepage.integral.bean.CategoryBean;
import com.example.admin.jewelry.homepage.integral.bean.HotExchangeBean;
import com.squareup.picasso.Picasso;


/**
 * Created by JINDAPENG on 2016/8/18.
 */
public class JewelryAdapter extends BaseAdapter {
    private Context context;
    private CategoryBean categoryBean;

    public JewelryAdapter(Context context) {
        this.context = context;
    }

    public void setHotExchangeBean(CategoryBean categoryBean) {
        this.categoryBean = categoryBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return 4;
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
            convertView = LayoutInflater.from(context).inflate(R.layout.integral_store_listview_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        String imageUrl = categoryBean.getObject().getGoodslist().get(position).getGoods_facePic();
        Picasso.with(context).load(imageUrl).into(holder.jewelryImages);

        String jewelryName = categoryBean.getObject().getGoodslist().get(position).getGoods_name();
        holder.jewelryTv.setText(jewelryName);

        String stock = categoryBean.getObject().getGoodslist().get(position).getGoods_stock();
        holder.quantityTv.setText(stock);

        String saleNum = categoryBean.getObject().getGoodslist().get(position).getGoods_saleNum();
        holder.tradeTv.setText(saleNum);

        String salePrice = categoryBean.getObject().getGoodslist().get(position).getGoods_salePrice();
        holder.integralTv.setText(salePrice);

        String oldPrice = categoryBean.getObject().getGoodslist().get(position).getGoods_oldPrice();
        holder.originalTv.setText(oldPrice);

        return convertView;
    }

    class ViewHolder {
        ImageView jewelryImages;
        TextView jewelryTv, quantityTv, tradeTv, integralTv, originalTv;

        public ViewHolder(View view) {
            jewelryImages = (ImageView) view.findViewById(R.id.facePic_imageview);
            jewelryTv = (TextView) view.findViewById(R.id.name_tv);
            quantityTv = (TextView) view.findViewById(R.id.stock_tv);
            tradeTv = (TextView) view.findViewById(R.id.saleNum_tv);
            integralTv = (TextView) view.findViewById(R.id.salePrice_tv);
            originalTv = (TextView) view.findViewById(R.id.oldPrice_tv);
        }

    }
}
