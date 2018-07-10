package com.yobo.studying_view2.lsn20_property;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.yobo.studying_view2.R;

/**
 * Created by YoBo on 2018/7/9.
 * b属性动画结合版本
 */

public class B_SafariActivity extends AppCompatActivity {

    private ImageView iv1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_safari_acitivity);
        iv1= (ImageView) findViewById(R.id.b_iv1);


    }


    public void clickBiv1(View v) {
        Log.e("B--------------","点击执行了1");
        //往后旋转
        ObjectAnimator rotationX1 = ObjectAnimator.ofFloat(iv1, "rotationX", 0, 20f);
        //变得透明
        ObjectAnimator alpha2 = ObjectAnimator.ofFloat(iv1, "alpha", 1f, 0.5f);
        //缩小
        ObjectAnimator scaleX3 = ObjectAnimator.ofFloat(iv1, "scaleX", 1f, 0.8f);

        ObjectAnimator scaleY4 = ObjectAnimator.ofFloat(iv1, "scaleY", 1f, 0.8f);
        //往上平移
        ObjectAnimator translationY5 = ObjectAnimator.ofFloat(iv1, "translationY", 0, -0.1f * iv1.getHeight());
        //一起执行
        AnimatorSet set = new AnimatorSet();
        set.setDuration(400);
        set.playTogether(rotationX1, alpha2, scaleX3, scaleY4, translationY5);
        set.start();
        //往后旋转以后再旋转回来
        ObjectAnimator rotationX6 = ObjectAnimator.ofFloat(iv1, "rotationX", 20f, 0f);
        rotationX6.setDuration(300);
        rotationX6.setStartDelay(400);
        rotationX6.start();


    }


    public void clickBiv2(View v) {


    }


}
