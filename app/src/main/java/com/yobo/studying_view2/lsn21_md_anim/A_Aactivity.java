package com.yobo.studying_view2.lsn21_md_anim;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.yobo.studying_view2.R;

/**
 * Created by YoBo on 2018/7/10.
 */

public class A_Aactivity extends AppCompatActivity {
    private ImageView iv1;
    private ImageView iv2;
    private Button bt1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.a_a_ativity);
        initView();
    }

    private void initView() {
        iv1 = (ImageView) findViewById(R.id.a_girl1);
        iv2 = (ImageView) findViewById(R.id.a_man1);
    }


    public void go2B(View v) {
        //单个元素共享
        //ActivityOptionsCompat optionsCompat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, iv1, "a2b_anim");
        ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,
                Pair.create((View) iv1, "a2b_anim"),
                Pair.create((View) iv2, "a2b_anim1"),
                Pair.create(v,"a2b_anim2"));



        Intent intent = new Intent(this, A_Bactivity.class);
        startActivity(intent, options.toBundle());
    }


}
