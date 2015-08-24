package com.example.administrator.androidstudio2;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;


public class Activity9_8 extends ActionBarActivity {
     //绘制简易涂鸦板
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = new MenuInflater(this);
        inflater.inflate(R.menu.menu_activity9_8,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        DrawView dv = (DrawView) findViewById(R.id.drawView1);
        dv.paint.setXfermode(null);
        dv.paint.setStrokeWidth(1);
        switch (item.getItemId()){
            case R.id.red:
                dv.paint.setColor(Color.RED);
                item.setChecked(true);
                break;
            case R.id.green:
                dv.paint.setColor(Color.GREEN);
                item.setChecked(true);
                break;
            case R.id.blue:
                dv.paint.setColor(Color.BLUE);
                item.setChecked(true);
                break;
            case R.id.width_1:
                dv.paint.setStrokeWidth(1);
                break;
            case R.id.width_2:
                dv.paint.setStrokeWidth(5);
                break;
            case R.id.width_3:
                dv.paint.setStrokeWidth(10);
                break;
            case R.id.save:
                dv.save();
                break;
            case R.id.clear:
                dv.clear();
                break;
        }
        return true;
    }
}
