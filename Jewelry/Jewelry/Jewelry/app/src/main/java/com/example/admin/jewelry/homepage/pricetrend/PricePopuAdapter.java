package com.example.admin.jewelry.homepage.pricetrend;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.jewelry.R;

/**
 * Created by admin on 2016/8/24.
 */
public class PricePopuAdapter extends BaseAdapter {
    private PricePopuBean date;
    private Context context;


    public PricePopuAdapter(Context context) {
        this.context = context;
    }

    public void setDate(PricePopuBean date) {
        this.date = date;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return date.getObject().size();
    }

    @Override
    public Object getItem(int i) {
        return date.getObject().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        mViewHolder holder = null;
        if (view == null){
            view = LayoutInflater.from(context).inflate(R.layout.popu_item,viewGroup,false);
            holder = new mViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (mViewHolder) view.getTag();
        }
        holder.popuTv.setText(date.getObject().get(i).getNames());
        return view;
    }

    class mViewHolder{

        TextView popuTv;

        public mViewHolder(View view){

          popuTv = (TextView) view.findViewById(R.id.popu_item_tv);

        }

    }
}
