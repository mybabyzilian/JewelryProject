package com.example.admin.jewelry.forhelp.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.admin.jewelry.forhelp.bean.PopuBean;

/**
 * Created by admin on 2016/8/18.
 */
public class SurroundPopuAdapter extends BaseAdapter {
    private PopuBean data;
    private Context context;

    public SurroundPopuAdapter(Context context) {
        this.context = context;
    }

    public void setData(PopuBean data) {
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return 0;
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
        return null;
    }
}
