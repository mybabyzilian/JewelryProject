package com.example.admin.jewelry.Utils;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.admin.jewelry.R;

/**
 * Created by admin on 2016/8/24.
 */
public class PopuWindowBase {

    private static PopupWindow popupWindow;


    public static void showPopuWindows(LinearLayout linearLayout, View view, Context context, final ImageView imageView) {
        WindowManager wm = (WindowManager) context
                .getSystemService(Context.WINDOW_SERVICE);

        int width = (int) (wm.getDefaultDisplay().getWidth());


        popupWindow = new PopupWindow(view, width, WindowManager.LayoutParams.WRAP_CONTENT, false) {
            @Override
            public void dismiss() {
                super.dismiss();

                imageView.setImageResource(R.mipmap.dropdown);

            }
        };
        //外部获得焦点
        popupWindow.setOutsideTouchable(true);
        //内部获得焦点
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setInputMethodMode(popupWindow.INPUT_METHOD_NEEDED);
        popupWindow.showAsDropDown(linearLayout);

    }

    public static void dismisPopu(){

        popupWindow.dismiss();

    }
}
