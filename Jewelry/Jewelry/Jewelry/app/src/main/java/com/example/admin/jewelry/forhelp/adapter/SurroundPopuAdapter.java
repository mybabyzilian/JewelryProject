package com.example.admin.jewelry.forhelp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.forhelp.bean.SurroundPopuBean;

/**
 * Created by admin on 2016/8/18.
 */
public class SurroundPopuAdapter extends BaseAdapter {
    private SurroundPopuBean data;
    private Context context;

    public SurroundPopuAdapter(Context context) {
        this.context = context;
    }

    public void setData(SurroundPopuBean data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return data.getObject().getParentlist().size();
    }

    @Override
    public Object getItem(int i) {
        return data.getObject().getParentlist().get(i);
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
        holder.popuTv.setText(data.getObject().getParentlist().get(i).getCategory_name());

        return view;
    }
    class mViewHolder{
        TextView popuTv;

        public mViewHolder(View view){
            popuTv = (TextView) view.findViewById(R.id.popu_item_tv);

        }
    }
}
