package com.example.administrator.androidstudio2;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import java.io.LineNumberReader;


public class Activity9_16 extends ActionBarActivity {
    private boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_16);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.LinearLayout03);
        final AnimationDrawable anim = (AnimationDrawable)linearLayout.getBackground();

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   if(flag){
                       anim.start();
                       flag = false;
                   }else {
                       anim.stop();
                       flag = true;
                   }
            }
        });


    }


}
