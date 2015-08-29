package com.example.administrator.androidstudio2;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
  * 迷途奔跑的野猪
  * */
public class Activity9_19 extends ActionBarActivity {
     private AnimationDrawable anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_19);
        final ImageView iv = (ImageView) findViewById(R.id.imageView02);
        final Animation translateright = AnimationUtils.loadAnimation(this,R.anim.translateright);
        final Animation translateleft = AnimationUtils.loadAnimation(this,R.anim.translateleft);
        anim = (AnimationDrawable) iv.getBackground();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linerLayout3);
        Toast.makeText(this,"触屏开始播放",Toast.LENGTH_SHORT).show();
        linearLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                anim.start();
                iv.startAnimation(translateright);
                return false;
            }
        });

        translateright.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.setBackgroundResource(R.anim.motionleft);
                iv.startAnimation(translateleft);
                anim = (AnimationDrawable) iv.getBackground();
                anim.start();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        translateleft.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                  iv.setBackgroundResource(R.anim.motionright);
                  iv.startAnimation(translateright);
                  anim=(AnimationDrawable)iv.getBackground();
                  anim.start();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}
