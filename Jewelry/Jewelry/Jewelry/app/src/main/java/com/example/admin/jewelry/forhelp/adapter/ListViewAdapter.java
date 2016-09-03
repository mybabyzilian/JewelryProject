package com.example.admin.jewelry.forhelp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.admin.jewelry.R;
import com.example.admin.jewelry.forhelp.bean.OfflineBean;
import com.example.admin.jewelry.forhelp.bean.OfflineDetailsBean;
import com.example.admin.jewelry.forhelp.bean.OnlineBean;

/**
 * Created by JINDAPENG on 2016/8/31.
 */
public class ListViewAdapter extends BaseAdapter {
    private OfflineBean offlineBean;
    private Context context;

    public ListViewAdapter(Context context) {
        this.context = context;
    }

    public void setOfflineBean(OfflineBean offlineBean) {
        this.offlineBean = offlineBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return offlineBean.getObject().getList().size();
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
        ViewHolder holder = null;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.offline_list_view_item, viewGroup, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.help_title.setText("标题：" + offlineBean.getObject().getList().get(i).getHelp_title());
        holder.city_name.setText("区域：" + offlineBean.getObject().getList().get(i).getCity_name());
        holder.help_money.setText("悬赏金额：" + offlineBean.getObject().getList().get(i).getHelp_money());
        Glide.with(context).load(offlineBean.getObject().getList().get(i).getHelp_facePic()).into(holder.help_facePic);
        Glide.with(context).load(offlineBean.getObject().getList().get(i).getHelp_userHeadPic()).into(holder.help_userHeadPic);

        return view;
    }

    class ViewHolder {
        ImageView help_userHeadPic, help_facePic;
        TextView help_money, help_title,city_name;

        public ViewHolder(View view) {
            help_facePic = (ImageView) view.findViewById(R.id.off_list_image);
            help_userHeadPic = (ImageView) view.findViewById(R.id.off_list_image_item);
            help_title = (TextView) view.findViewById(R.id.off_list_user_name);
            city_name = (TextView) view.findViewById(R.id.off_list_city);
            help_money = (TextView) view.findViewById(R.id.off_list_money);

        }
    }
}
