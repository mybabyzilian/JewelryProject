package com.example.admin.jewelry.homepage.jewerydisplay;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.CommonAdaper;
import com.example.admin.jewelry.Utils.PopuWindowBase;
import com.example.admin.jewelry.Utils.RefreshListView;
import com.example.admin.jewelry.Utils.ViewHolder;
import com.example.admin.jewelry.base.BaseFragment;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/8/29.
 */
public class JewelryOldFragment extends BaseFragment implements View.OnClickListener {
    private RefreshListView listView;
    private View popuView;
    private ListView popuList;
    private ImageView sortIv,reorderIv,areaIv,styleIv;
    private LinearLayout sortLayout,reorderLayout,areaLayout,styleLayout;
    private List<DisplayPopuBean.ObjectBean.CategorylistBean> sortList;
    private List<DisplayPopuBean.ObjectBean.CitylistBean> citylistBeen;
    private List<DisplayPopuBean.ObjectBean.OrderlistBean> orderlistBeen;
    private List<DisplayPopuBean.ObjectBean.StylelistBean> stylelistBeen;
    private List<DisplayOldBean.ObjectBean.ListBean> listBeen;
    @Override
    protected int setLayout() {
        return R.layout.fragment_jewe_old;
    }

    @Override
    protected void initView(View view) {
        listView = (RefreshListView) view.findViewById(R.id.jewelry_old_list);
        popuView = LayoutInflater.from(context).inflate(R.layout.view_popu,null);
        sortLayout = (LinearLayout) view.findViewById(R.id.sort_old_layout);
        sortLayout.setOnClickListener(this);
        reorderLayout = (LinearLayout) view.findViewById(R.id.reorder_old_layout);
        reorderLayout.setOnClickListener(this);
        areaLayout = (LinearLayout) view.findViewById(R.id.reorder_old_layout);
        areaLayout.setOnClickListener(this);
        styleLayout = (LinearLayout) view.findViewById(R.id.old_style_layout);
        styleLayout.setOnClickListener(this);
        sortIv = (ImageView) view.findViewById(R.id.sort_old_iv);
        reorderIv = (ImageView) view.findViewById(R.id.reorder_old_iv);
        areaIv = (ImageView) view.findViewById(R.id.old_area_iv);
        styleIv = (ImageView) view.findViewById(R.id.old_style_iv);
        popuList = (ListView) popuView.findViewById(R.id.popu_list);


    }

    @Override
    protected void initData() {
        citylistBeen = new ArrayList<>();
        sortList = new ArrayList<>();
        orderlistBeen = new ArrayList<>();
        stylelistBeen = new ArrayList<>();
        listBeen = new ArrayList<>();
        OkHttpClientManager.postAsyn(Urls.JEWELRY_DISPLAY_POPU_URL, new OkHttpClientManager.ResultCallback<DisplayPopuBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(DisplayPopuBean response) {
                sortList = response.getObject().getCategorylist();
                citylistBeen = response.getObject().getCitylist();
                orderlistBeen = response.getObject().getOrderlist();
                stylelistBeen = response.getObject().getStylelist();
            }
        });

        LinearLayout layout = new LinearLayout(context);
        layout.setOrientation(LinearLayout.HORIZONTAL);


        OkHttpClientManager.postAsyn(Urls.JEWELRY_DISPLAY_URL, new OkHttpClientManager.ResultCallback<DisplayOldBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(DisplayOldBean response) {
                for (int i = 0; i <response.getObject().getList().size() ; i++) {
                    listBeen.add(response.getObject().getList().get(i));
                }

                listView.setAdapter(new CommonAdaper<DisplayOldBean.ObjectBean.ListBean>(context,listBeen,R.layout.jewelry_old_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayOldBean.ObjectBean.ListBean item) {
                        holder.setText(R.id.display_name_tv,item.getGoods_name());
                        holder.setText(R.id.display_user_name,item.getUserIdTitle());
                        holder.setImageByUrl(R.id.display_user_iv,item.getUserHeadPic());
                        holder.setText(R.id.display_update_time,item.getCreate_time());
                        holder.setText(R.id.display_rmb_tv,"¥"+item.getGoods_salePrice());
                        holder.getView(R.id.display_scroll);
                        holder.setImageByUrl(R.id.ic,item.getGoods_bodyPic());


                    }
                });
            }
        });


    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.sort_old_layout:
                popuList.setAdapter(new CommonAdaper<DisplayPopuBean.ObjectBean.CategorylistBean>(context,sortList,R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayPopuBean.ObjectBean.CategorylistBean item) {
                        holder.setText(R.id.popu_item_tv,item.getNames());
                    }
                });
                sortIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout,popuView,context,sortIv);

                break;
            case R.id.reorder_old_layout:
                popuList.setAdapter(new CommonAdaper<DisplayPopuBean.ObjectBean.OrderlistBean>(context,orderlistBeen,R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayPopuBean.ObjectBean.OrderlistBean item) {
                        holder.setText(R.id.popu_item_tv,item.getNames());
                    }
                });
                reorderIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout,popuView,context,reorderIv);
                break;
            case R.id.old_area_layout:
                popuList.setAdapter(new CommonAdaper<DisplayPopuBean.ObjectBean.CitylistBean>(context,citylistBeen,R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayPopuBean.ObjectBean.CitylistBean item) {
                        holder.setText(R.id.popu_item_tv,item.getNames());
                    }
                });
                areaIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout,popuView,context,areaIv);
                break;
            case R.id.old_style_layout:
                popuList.setAdapter(new CommonAdaper<DisplayPopuBean.ObjectBean.StylelistBean>(context,stylelistBeen,R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayPopuBean.ObjectBean.StylelistBean item) {
                        holder.setText(R.id.popu_item_tv,item.getNames());
                    }
                });
                styleIv.setImageResource(R.mipmap.drop_top);
                PopuWindowBase.showPopuWindows(sortLayout,popuView,context,styleIv);
                break;

        }

    }
}
