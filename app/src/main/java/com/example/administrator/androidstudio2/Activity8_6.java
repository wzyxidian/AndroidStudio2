package com.example.administrator.androidstudio2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class Activity8_6 extends ActionBarActivity {
    private TextView tvContextmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity8_6);
        tvContextmenu = (TextView) findViewById(R.id.tvContextmenu);
        registerForContextMenu(tvContextmenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.contextmenu, menu);
        menu.setHeaderIcon(R.drawable.img01);
        menu.setHeaderTitle("请选择文字颜色：");
//        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.color1:
                tvContextmenu.setTextColor(Color.rgb(255,0,0));
                break;
            case R.id.color2:
                tvContextmenu.setTextColor(Color.rgb(0,255,0));
                break;
            case R.id.color3:
                tvContextmenu.setTextColor(Color.rgb(0,0,255));
                break;
            case R.id.color4:
                tvContextmenu.setTextColor(Color.rgb(255,180,0));
                break;
            case R.id.color5:
                tvContextmenu.setTextColor(Color.rgb(255,255,255));
                break;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getGroupId() == R.id.setting){
            if(item.isChecked()){
                item.setChecked(false);
            }else{
                item.setChecked(true);
            }
        }
        if(item.getItemId() != R.id.item2){
            Toast.makeText(Activity8_6.this,item.getTitle(),Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
