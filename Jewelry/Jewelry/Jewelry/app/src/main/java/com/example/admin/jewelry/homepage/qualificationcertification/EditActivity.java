package com.example.admin.jewelry.homepage.qualificationcertification;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.Utils.CommonAdaper;
import com.example.admin.jewelry.Utils.ViewHolder;
import com.example.admin.jewelry.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2016/9/7.
 */
public class EditActivity extends BaseActivity implements View.OnClickListener {
    private EditText editText;
    private TextView titleTv, baocunTv;
    private String request_code;
    private List<String> xiangmuList, fuwuList;
    private ListView listView;



    @Override
    public int setLayout() {
        return R.layout.activity_edit;
    }

    @Override
    protected void initView() {
        editText = bindView(R.id.activity_edit_et);
        titleTv = bindView(R.id.activity_edit_title);
        baocunTv = bindView(R.id.edit_baocun_tv);
        baocunTv.setOnClickListener(this);
        listView = bindView(R.id.activity_edit_list);
    }

    @Override
    protected void initData() {
        Intent intent = getIntent();
        request_code = intent.getStringExtra("request_code");
        titleTv.setText(intent.getStringExtra("zhuanye"));
        editText.setHint(intent.getStringExtra("zhuanye_hint"));


        xiangmuList = new ArrayList<>();
        fuwuList = new ArrayList<>();
        xiangmuList.add("品类一");
        xiangmuList.add("品类二");
        xiangmuList.add("品类三");
        xiangmuList.add("品类四");
        xiangmuList.add("品类五");
        xiangmuList.add("品类六");
        fuwuList.add("服务一");
        fuwuList.add("服务二");
        fuwuList.add("服务三");
        fuwuList.add("服务四");
        fuwuList.add("服务五");
        fuwuList.add("服务六");

        if (request_code.equals("203")) {
            listView.setAdapter(new CommonAdaper<String>(EditActivity.this, xiangmuList, R.layout.edit_item) {
                @Override
                public void convert(final ViewHolder holder, String item) {
                    holder.setText(R.id.edit_item_tv, item);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent1 = new Intent();
                            intent1.putExtra("tv", xiangmuList.get(i));
                            EditActivity.this.setResult(203, intent1);
                            finish();

                        }
                    });

                }
            });
            editText.setVisibility(View.GONE);
            baocunTv.setVisibility(View.GONE);

        }
        if (request_code.equals("204")) {
            listView.setAdapter(new CommonAdaper<String>(EditActivity.this, fuwuList, R.layout.edit_item) {
                @Override
                public void convert(final ViewHolder holder, String item) {
                    holder.setText(R.id.edit_item_tv, item);
                    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                            Intent intent1 = new Intent();
                            intent1.putExtra("tv", fuwuList.get(i));
                            EditActivity.this.setResult(204, intent1);
                            finish();

                        }
                    });

                }
            });
            editText.setVisibility(View.GONE);
            baocunTv.setVisibility(View.GONE);

        }




    }

    @Override
    public void onClick(View view) {
        final Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.edit_baocun_tv:
                if (request_code.equals("101")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(101, intent);
                    finish();
                }
                if (request_code.equals("102")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(102, intent);
                    finish();
                }
                if (request_code.equals("103")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(103, intent);
                    finish();
                }
                if (request_code.equals("104")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(104, intent);
                    finish();
                }
                if (request_code.equals("105")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(105, intent);
                    finish();
                }
                if (request_code.equals("106")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(106, intent);
                    finish();
                }
                if (request_code.equals("107")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(107, intent);
                    finish();
                }
                if (request_code.equals("108")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(108, intent);
                    finish();
                }
                if (request_code.equals("109")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(109, intent);
                    finish();
                }
                if (request_code.equals("201")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(201, intent);
                    finish();
                }
                if (request_code.equals("202")) {
                    intent.putExtra("tv", editText.getText().toString());
                    EditActivity.this.setResult(202, intent);
                    finish();
                }

                break;
        }
    }
}
