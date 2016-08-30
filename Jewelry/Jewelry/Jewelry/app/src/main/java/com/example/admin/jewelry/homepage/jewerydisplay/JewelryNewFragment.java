package com.example.admin.jewelry.homepage.jewerydisplay;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.CommonAdaper;
import com.example.admin.jewelry.Utils.PopuWindowBase;
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
public class JewelryNewFragment extends BaseFragment implements View.OnClickListener {
    private LinearLayout sortLayout, reorderLayout, styleLayout;
    private ImageView sortIv, reorderIv, styleIv;
    private View popuView;
    private ListView popuList;
    private List<DisplayNewPopuBean.ObjectBean.CategorylistBean> categorylistBeen;
    private List<DisplayNewPopuBean.ObjectBean.OrderlistBean> orderlistBeen;
    private List<DisplayNewPopuBean.ObjectBean.StylelistBean> stylelistBeen;
    private GridView gridView;
    ;
    private List<DisplayNewBean.ObjectBean.ListBean> listBeen;

    @Override
    protected int setLayout() {

        return R.layout.fragment_jewelry_new;

    }

    @Override
    protected void initView(View view) {
        sortLayout = (LinearLayout) view.findViewById(R.id.sort_new_layout);
        sortLayout.setOnClickListener(this);
        reorderLayout = (LinearLayout) view.findViewById(R.id.reorder_new_layout);
        reorderLayout.setOnClickListener(this);
        styleLayout = (LinearLayout) view.findViewById(R.id.new_style_layout);
        styleLayout.setOnClickListener(this);
        sortIv = (ImageView) view.findViewById(R.id.sort_new_iv);
        reorderIv = (ImageView) view.findViewById(R.id.reorder_new_iv);
        styleIv = (ImageView) view.findViewById(R.id.new_style_iv);
        popuView = LayoutInflater.from(context).inflate(R.layout.view_popu, null);
        popuList = (ListView) popuView.findViewById(R.id.popu_list);
        gridView = (GridView) view.findViewById(R.id.display_new_grid);

    }

    @Override
    protected void initData() {
        categorylistBeen = new ArrayList<>();
        orderlistBeen = new ArrayList<>();
        stylelistBeen = new ArrayList<>();
        listBeen = new ArrayList<>();
        OkHttpClientManager.postAsyn(Urls.JEWELRY_DISPLAY_POPU_NEW_URL, new OkHttpClientManager.ResultCallback<DisplayNewPopuBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(DisplayNewPopuBean response) {
                categorylistBeen = response.getObject().getCategorylist();
                orderlistBeen = response.getObject().getOrderlist();
                stylelistBeen = response.getObject().getStylelist();
            }
        });



        OkHttpClientManager.postAsyn(Urls.JEWELRY_DISPLAY_NEW_URL, new OkHttpClientManager.ResultCallback<DisplayNewBean>() {
            @Override
            public void onError(Request request, Exception e) {

            }

            @Override
            public void onResponse(final DisplayNewBean response) {
                for (int i = 0; i < response.getObject().getList().size(); i++) {
                    listBeen.add(response.getObject().getList().get(i));
                }
                gridView.setAdapter(new CommonAdaper<DisplayNewBean.ObjectBean.ListBean>(context, listBeen,
                        R.layout.display_grid_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayNewBean.ObjectBean.ListBean item) {
                        holder.setText(R.id.new_goods_name, item.getGoods_name());
                        holder.setText(R.id.new_old_price,"零售:" + item.getGoods_oldPrice());
                        holder.setText(R.id.new_goods_price,"平台:"+item.getGoods_salePrice());
                        holder.setImageByUrl(R.id.new_facepic_iv,item.getGoods_facePic());
                        holder.setImageByUrl(R.id.user_new_iv,item.getUserHeadPic());

                    }
                });
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(context,NewDetailActivity.class);
                        intent.putExtra("id",listBeen.get(i).getEntity_id());
                        context.startActivity(intent);

                    }
                });

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sort_new_layout:
                popuList.setAdapter(new CommonAdaper<DisplayNewPopuBean.ObjectBean.CategorylistBean>(context, categorylistBeen,
                        R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayNewPopuBean.ObjectBean.CategorylistBean item) {
                        holder.setText(R.id.popu_item_tv, item.getNames());
                    }
                });
                PopuWindowBase.showPopuWindows(sortLayout, popuView, context, sortIv);

                break;
            case R.id.reorder_new_layout:
                popuList.setAdapter(new CommonAdaper<DisplayNewPopuBean.ObjectBean.OrderlistBean>(context, orderlistBeen,
                        R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayNewPopuBean.ObjectBean.OrderlistBean item) {
                        holder.setText(R.id.popu_item_tv, item.getNames());
                    }
                });
                PopuWindowBase.showPopuWindows(reorderLayout, popuView, context, reorderIv);

                break;
            case R.id.new_style_layout:
                popuList.setAdapter(new CommonAdaper<DisplayNewPopuBean.ObjectBean.StylelistBean>(context, stylelistBeen,
                        R.layout.popu_item) {
                    @Override
                    public void convert(ViewHolder holder, DisplayNewPopuBean.ObjectBean.StylelistBean item) {
                        holder.setText(R.id.popu_item_tv, item.getNames());
                    }
                });
                PopuWindowBase.showPopuWindows(styleLayout, popuView, context, styleIv);
                break;
        }

    }
}
