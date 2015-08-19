package com.example.administrator.androidstudio2;

import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;


public class RabbitActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabbit);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mylayout);
        final RabbitView rabbitView = new RabbitView(RabbitActivity.this);
        rabbitView.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                rabbitView.bitmapX = event.getX();
                rabbitView.bitmapY = event.getY();
                rabbitView.invalidate();
                return true;
            }
        });
        frameLayout.addView(rabbitView);
    }


}
