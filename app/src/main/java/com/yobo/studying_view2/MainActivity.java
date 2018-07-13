package com.yobo.studying_view2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.yobo.studying_view2.lsn20_property.B_SafariActivity;
import com.yobo.studying_view2.lsn21_md_anim.A_Aactivity;
import com.yobo.studying_view2.lsn21_md_anim.A_MDAnimation;
import com.yobo.studying_view2.lsn23_svg.C_SvgActivity;
import com.yobo.studying_view2.lsn23_svg.C_SvgActivity2;
import com.yobo.studying_view2.lsn23_svg.C_SvgActivity3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickMdAnim(View v) {
        Intent intent = new Intent(this, A_MDAnimation.class);
        startActivity(intent);
    }

    public void clickB(View v) {

        Intent intent1 = new Intent(this, B_SafariActivity.class);
        startActivity(intent1);
    }

    public void clickA2B(View v) {

        Intent intent2 = new Intent(this, A_Aactivity.class);
        startActivity(intent2);


    }

    public void clickC_SVG(View v) {

        Intent intent3 = new Intent(this, C_SvgActivity.class);
        startActivity(intent3);

    }
    public void clickC_SVG1(View v) {

        Intent intent3 = new Intent(this, C_SvgActivity2.class);
        startActivity(intent3);

    }
    public void clickC_SVG2(View v) {

        Intent intent3 = new Intent(this, C_SvgActivity3.class);
        startActivity(intent3);

    }
}
