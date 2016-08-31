package com.example.admin.jewelry.login;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/8/31.
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    private EditText numEt, codeEt;
    private Button getCodeBt;
    private CountDownTimer timer;
    private String num, code;

    @Override
    public int setLayout() {
        return R.layout.activity_regsiter;
    }

    @Override
    protected void initView() {
        numEt = bindView(R.id.register_num_edit);
        codeEt = bindView(R.id.register_password_edit);
        getCodeBt = bindView(R.id.get_code_bt);
        getCodeBt.setOnClickListener(this);

    }

    @Override
    protected void initData() {
        num = numEt.getText().toString();
        code = codeEt.getText().toString();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.get_code_bt:
                Map<String, String> map = new HashMap<>();
                map.put("user_account", num);
                map.put("check_type", code);
                OkHttpClientManager.postAsyn(Urls.REGISTER_GET_YZM, new OkHttpClientManager.ResultCallback<RegisterBean>() {
                    @Override
                    public void onError(Request request, Exception e) {

                    }

                    @Override
                    public void onResponse(RegisterBean response) {
                        Toast.makeText(RegisterActivity.this, response.getStatus(), Toast.LENGTH_SHORT).show();
                        if (response.getStatus().equals("1")) {
                            timer = new CountDownTimer(60000, 1000) {
                                @Override
                                public void onTick(long l) {
                                    getCodeBt.setText(l / 1000 + "s");

                                }

                                @Override
                                public void onFinish() {
                                    getCodeBt.setText("获取");
                                }
                            }.start();
                        } else if (num == null) {
                            Toast.makeText(RegisterActivity.this, "您还没有填写手机号", Toast.LENGTH_SHORT).show();
                        } else if (response.getStatus().equals("0")) {
                            Toast.makeText(RegisterActivity.this, "该手机号已注册", Toast.LENGTH_SHORT).show();
                        }

                    }
                }, map);
                break;
        }
    }
}
