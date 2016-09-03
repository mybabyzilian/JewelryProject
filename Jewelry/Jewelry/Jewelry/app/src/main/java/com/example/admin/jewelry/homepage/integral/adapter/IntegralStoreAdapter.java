package com.example.admin.jewelry.homepage.integral.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.jewelry.R;
import com.example.admin.jewelry.homepage.integral.bean.HotExchangeBean;


/**
 * Created by JINDAPENG on 2016/8/18.
 */
public class IntegralStoreAdapter extends BaseAdapter {
    private Context context;
    private HotExchangeBean hotExchangeBean;

    public IntegralStoreAdapter(Context context) {
        this.context = context;
    }

    public void setHotExchangeBean(HotExchangeBean hotExchangeBean) {
        this.hotExchangeBean = hotExchangeBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return hotExchangeBean == null ? 0 : hotExchangeBean.getObject().getHotlist().size();
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
            convertView = LayoutInflater.from(context).inflate(R.layout.hot_exchange_listview_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        String jewelryName = hotExchangeBean.getObject().getHotlist().get(position).getGoods_name();
        holder.jewelryTv.setText(jewelryName);

        String integralPrice = hotExchangeBean.getObject().getHotlist().get(position).getGoods_salePrice();
        holder.integralTv.setText(integralPrice);

        String imageUrl = hotExchangeBean.getObject().getHotlist().get(position).getGoods_facePic();
        Glide.with(context).load(imageUrl).into(holder.jewelryImage);

        return convertView;
    }

    class ViewHolder {
        ImageView jewelryImage;
        TextView jewelryTv, integralTv;

        public ViewHolder(View view) {
            jewelryImage = (ImageView) view.findViewById(R.id.facePic_iv);
            jewelryTv = (TextView) view.findViewById(R.id.name_tv);
            integralTv = (TextView) view.findViewById(R.id.salePrice_tv);
        }

    }
}
