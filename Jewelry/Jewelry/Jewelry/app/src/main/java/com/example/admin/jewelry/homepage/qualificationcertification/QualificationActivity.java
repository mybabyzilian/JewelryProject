package com.example.admin.jewelry.homepage.qualificationcertification;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.example.admin.jewelry.R;
import com.example.admin.jewelry.base.BaseActivity;

/**
 * Created by admin on 2016/8/24.
<<<<<<< HEAD
 * 资质认证
=======
>>>>>>> bba5147b6ea0b0447664d9763043484f648e540f
 */
public class QualificationActivity extends BaseActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private RadioButton certificateRb,unCertificateRb;
    @Override
    public int setLayout() {
        return R.layout.activity_qualification;
    }

    @Override
    protected void initView() {
        certificateRb = (RadioButton) findViewById(R.id.rb_certificate_);
        unCertificateRb = (RadioButton) findViewById(R.id.rb_uncertificate_);
        certificateRb.setOnClickListener(this);
        unCertificateRb.setOnClickListener(this);
        certificateRb.setOnCheckedChangeListener(this);
        unCertificateRb.setOnCheckedChangeListener(this);


    }

    @Override
    protected void initData() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.qualification_frame, new CertifacateFragment());
        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (view.getId()) {
            case R.id.rb_certificate_:
                fragmentTransaction.replace(R.id.qualification_frame, new CertifacateFragment());
                break;
            case R.id.rb_uncertificate_:
                fragmentTransaction.replace(R.id.qualification_frame, new UnCertificateFragment());
                break;
        }
        fragmentTransaction.commit();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b) {
            compoundButton.setTextColor(Color.parseColor("#8f0303"));
        } else {
            compoundButton.setTextColor(Color.GRAY);
        }

    }
}
