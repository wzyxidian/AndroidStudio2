package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class Activity9_17 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_17);
        final Animation rotate = AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        final Animation translate = AnimationUtils.loadAnimation(this,R.anim.anim_translate);
        final Animation scale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        final Animation alpha = AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        final ImageView iv = (ImageView) findViewById(R.id.imageView01);
        final Button button01 = (Button) findViewById(R.id.button01);
        final Button button02 = (Button) findViewById(R.id.button02);
        final Button button03 = (Button) findViewById(R.id.button03);
        final Button button04 = (Button) findViewById(R.id.button04);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(rotate);
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(translate);
            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(scale);
            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iv.startAnimation(alpha);
            }
        });

    }


}
