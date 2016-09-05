package com.example.admin.jewelry.mine.mymaterial;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by admin on 2016/9/5.
 */
public class SetUserNameActivitry extends BaseActivity {
    private EditText editText;
    private TextView textView;

    @Override
    public int setLayout() {
        return R.layout.activity_set_user_name;
    }

    @Override
    protected void initView() {
        editText = bindView(R.id.set_name_edit);
        textView = bindView(R.id.set_user_tv);
    }

    @Override
    protected void initData() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SetUserNameActivitry.this,MyMaterialActivity.class);
                intent.putExtra("userName",editText.getText().toString());
                startActivity(intent);
            }
        });

    }
}
