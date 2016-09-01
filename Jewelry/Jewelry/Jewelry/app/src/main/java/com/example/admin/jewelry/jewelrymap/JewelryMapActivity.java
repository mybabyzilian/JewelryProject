package com.example.admin.jewelry.jewelrymap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.amap.api.maps.AMap;
import com.amap.api.maps.LocationSource;
import com.amap.api.maps.MapView;
import com.example.admin.jewelry.R;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2016/8/23.
 */
public class JewelryMapActivity extends AppCompatActivity implements AMapLocationListener,LocationSource {
    private AMapLocationClientOption mLocationOption;
    private MapView mapView;
    private AMapLocationClient mlocationClient;
    private AMap aMap;
    private LocationSource.OnLocationChangedListener mListener;
    private ImageView returnIv;
    private TextView searchTv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        returnIv = (ImageView) findViewById(R.id.trend_return);
        returnIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        searchTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        mapView = (MapView) findViewById(R.id.map);
        mapView.onCreate(savedInstanceState);

        aMap = mapView.getMap();
        aMap.setLocationSource(this);
        aMap.getUiSettings().setMyLocationButtonEnabled(true);//设置默认按钮是否显示
        aMap.setMyLocationEnabled(true);
        //设置定位类型定位模式
        aMap.setMyLocationType(AMap.LOCATION_TYPE_LOCATE);

        mLocationOption = new AMapLocationClientOption();
        mLocationOption.setNeedAddress(true);
        mLocationOption.setOnceLocation(false);
        mlocationClient = new AMapLocationClient(getApplicationContext());
        //设置定位监听
        mlocationClient.setLocationListener(this);
        //高精度模式
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        //定位间隔
        mLocationOption.setInterval(3000);
        //设置定位参数
        mlocationClient.setLocationOption(mLocationOption);
        if (mLocationOption.isOnceLocation()) {
            mLocationOption.setOnceLocation(true);
        }
        //启动定位
        mlocationClient.startLocation();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
        mlocationClient.stopLocation();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    public void onLocationChanged(AMapLocation aMapLocation) {
        if (aMapLocation != null) {
            if (aMapLocation.getErrorCode() == 0) {
                Log.d("MainActivity", "chrnggong");
                aMapLocation.getLocationType();
                aMapLocation.getLatitude();//获取纬度
                aMapLocation.getLongitude();//获取经度
                aMapLocation.getAccuracy();//获取精度信息
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date(aMapLocation.getTime());
                df.format(date);//定位时间
                aMapLocation.getAddress();//地址，如果option中设置isNeedAddress为false，则没有此结果，网络定位结果中会有地址信息，GPS定位不返回地址信息。
                aMapLocation.getCountry();//国家信息
                aMapLocation.getProvince();//省信息
                Log.d("MainActivity", aMapLocation.getCity());//城市信息
                aMapLocation.getDistrict();//城区信息
                aMapLocation.getStreet();//街道信息
                aMapLocation.getStreetNum();//街道门牌号信息
                aMapLocation.getCityCode();//城市编码
                aMapLocation.getAdCode();//地区编码
                aMapLocation.getAoiName();//获取当前定位点的AOI信息

                mListener.onLocationChanged(aMapLocation);



            } else {
                Log.d("xx", aMapLocation.getErrorCode() + "//" + aMapLocation.getErrorInfo());
            }
        }


    }

    @Override
    public void activate(OnLocationChangedListener onLocationChangedListener) {
        this.mListener = onLocationChangedListener;
    }

    @Override
    public void deactivate() {

    }
}
