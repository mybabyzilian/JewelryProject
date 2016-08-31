package com.example.admin.jewelry.login;

import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;
import com.example.admin.jewelry.homepage.MainActivity;
import com.example.admin.jewelry.netrequest.OkHttpClientManager;
import com.example.admin.jewelry.netrequest.Urls;
import com.squareup.okhttp.Request;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2016/8/30.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private CheckBox chekBox;
    private boolean a = true;
    private EditText numEt,passwordEt;
    private UserLoginBean bean;
    private ProgressBar progressBar;

    @Override
    public int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        chekBox = bindView(R.id.check_iv);
        numEt= (EditText) findViewById(R.id.num_edit);
        passwordEt = (EditText) findViewById(R.id.password_edit);
        findViewById(R.id.login_bt).setOnClickListener(this);
        findViewById(R.id.register_bt).setOnClickListener(this);
        progressBar = (ProgressBar) findViewById(R.id.login_progress_bar);
    }

    @Override
    protected void initData() {



    }

    @Override
    public void onClick(View view) {
       switch (view.getId()){
           case R.id.login_bt:
               progressBar.setVisibility(View.VISIBLE);
               String num = numEt.getText().toString();
               String password = passwordEt.getText().toString();
               Map<String,String> map = new HashMap<>();
               map.put("user_account",num);
               map.put("user_password",password);
               OkHttpClientManager.postAsyn(Urls.USER_LOGIN_URL, new OkHttpClientManager.ResultCallback<UserLoginBean>() {
                   @Override
                   public void onError(Request request, Exception e) {

                   }

                   @Override
                   public void onResponse(UserLoginBean response) {
                       bean = response;
                       if (bean.getMsg().equals("登录成功")){
                           Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                           Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                           startActivity(intent);
                       }else if (bean.getMsg().equals("无效账号")){
                           Toast.makeText(LoginActivity.this, "无效账号", Toast.LENGTH_SHORT).show();

                       }
                   }
               },map);

               break;
           case R.id.register_bt:

               break;

       }
    }
}
