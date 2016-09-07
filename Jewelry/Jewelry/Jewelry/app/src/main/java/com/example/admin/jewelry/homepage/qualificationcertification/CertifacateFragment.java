package com.example.admin.jewelry.homepage.qualificationcertification;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseFragment;

/**
 * Created by admin on 2016/8/24.
 */
public class CertifacateFragment extends BaseFragment implements View.OnClickListener {
    private LinearLayout linearLayout;
    private View popuView;
    private ListView popuList;
    private ListView listView;


    @Override
    protected int setLayout() {
        return R.layout.fragment_certificate;
    }

    @Override
    protected void initView(View view) {
        linearLayout = (LinearLayout) view.findViewById(R.id.certificate_layout);
        popuView = LayoutInflater.from(context).inflate(R.layout.view_popu,null);
        popuList = (ListView) popuView.findViewById(R.id.popu_list);
        listView = (ListView) view.findViewById(R.id.fragment_certificate_list);

    }

    @Override
    protected void initData() {
        linearLayout.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.certificate_layout:

                break;

        }
    }
}
