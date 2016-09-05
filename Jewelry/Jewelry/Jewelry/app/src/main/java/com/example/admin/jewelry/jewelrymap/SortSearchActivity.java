package com.example.admin.jewelry.jewelrymap;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by admin on 2016/9/1.
 */
public class SortSearchActivity extends BaseActivity implements View.OnClickListener {
    private LinearLayout nearLayout,designLayout,institutionLayout,trainLayout,originLayout,allLayout;

    @Override
    public int setLayout() {
        return R.layout.activity_search_sort;
    }

    @Override
    protected void initView() {
        findViewById(R.id.sort_search_near).setOnClickListener(this);
        findViewById(R.id.sort_search_desgin).setOnClickListener(this);
        findViewById(R.id.sort_search_institution).setOnClickListener(this);
        findViewById(R.id.sort_search_train).setOnClickListener(this);
        findViewById(R.id.sort_search_origin).setOnClickListener(this);
        findViewById(R.id.sort_search_all).setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.sort_search_near:
                Intent intent = new Intent(SortSearchActivity.this,JewelryMapActivity.class);
                startActivity(intent);
                break;
            case R.id.sort_search_desgin:
                Intent intent1 = new Intent(SortSearchActivity.this,JewelryMapActivity.class);
                startActivity(intent1);
                break;
            case R.id.sort_search_institution:
                Intent intent2 = new Intent(SortSearchActivity.this,JewelryMapActivity.class);
                startActivity(intent2);
                break;
            case R.id.sort_search_train:
                Intent intent3 = new Intent(SortSearchActivity.this,JewelryMapActivity.class);
                startActivity(intent3);
                break;
            case R.id.sort_search_origin:
                Intent intent4 = new Intent(SortSearchActivity.this,JewelryMapActivity.class);
                startActivity(intent4);
                break;
            case R.id.sort_search_all:
                Intent intent5 = new Intent(SortSearchActivity.this,JewelryMapActivity.class);
                startActivity(intent5);
                break;

        }
    }
}
