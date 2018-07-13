package com.yobo.studying_view2.lsn23_svg;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.yobo.studying_view2.R;

/**
 * Created by YoBo on 2018/7/12.
 */

public class C_SvgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.c_svg_activity);
        ImageView iv = (ImageView) findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.c_selector1);
    }
}
