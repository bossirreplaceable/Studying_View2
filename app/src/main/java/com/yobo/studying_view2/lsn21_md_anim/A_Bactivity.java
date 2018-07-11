package com.yobo.studying_view2.lsn21_md_anim;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;

import com.yobo.studying_view2.R;

/**
 * Created by YoBo on 2018/7/10.
 * b
 */

public class A_Bactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.a_b_ativity);
        Fade fade=new Fade();
        fade.setDuration(1000);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);
    }


    public void go2C(View v) {

//        Slide slide = new Slide();
//        slide.setDuration(2000);
//        getWindow().setEnterTransition(slide);
//        getWindow().setExitTransition(slide);
//        Intent intent = new Intent(this, A_Cactivity.class);
//        startActivity(intent);
    }
    public void go2C_Explode(View v){
//        Explode explode=new Explode();
//        explode.setDuration(2000);
//        getWindow().setEnterTransition(explode);
//        getWindow().setExitTransition(explode);
//        Intent intent = new Intent(this, A_Cactivity.class);
//        startActivity(intent);
    }
    public void go2C_Fade(View v){

        Intent intent = new Intent(this, A_Cactivity.class);
        startActivity(intent);
    }


}
