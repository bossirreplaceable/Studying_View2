package com.yobo.studying_view2.lsn21_md_anim;

import android.animation.Animator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateInterpolator;

import com.yobo.studying_view2.R;

/**
 * Created by YoBo on 2018/7/9.
 * 1
 */

public class A_MDAnimation extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_md_activity);
    }


    public void clickReveal(View v) {
//        ViewAnimationUtils.createCircularReveal(
//                View view,                作用在哪个View上
//                int centerX, int centerY, 作用的中心点
//                float startRadius,        开始时的半径
//                float endRadius);         扩散完成以后的半径
        Animator animation = ViewAnimationUtils.createCircularReveal(v, v.getWidth() / 2,
                v.getHeight() / 2, 0, v.getHeight());
        animation.setDuration(2000);
        animation.setInterpolator(new AccelerateInterpolator());
        animation.start();
    }
    public void clickReveal1(View v) {
        Animator animation = ViewAnimationUtils.createCircularReveal(v, 0, 0, 0,
                (float) Math.hypot(v.getWidth(), v.getHeight()));
        animation.setDuration(2000);
        animation.setInterpolator(new AccelerateInterpolator());
        animation.start();
    }


}
