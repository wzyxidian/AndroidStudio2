package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;


public class ActivityChaper7_4 extends ActionBarActivity implements View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOnTouchListener(this);
        linearLayout.setBackgroundResource(R.drawable.img01);
        setContentView(linearLayout);

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Toast.makeText(this,"发生触摸事件",Toast.LENGTH_SHORT).show();
        return true;
    }
}
