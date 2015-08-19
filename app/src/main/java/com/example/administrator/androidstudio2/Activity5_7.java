package com.example.administrator.androidstudio2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Activity5_7 extends ActionBarActivity {
    Button btShortOrLong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity5_7);
        btShortOrLong = (Button) findViewById(R.id.btshortOrLong);

        //单机按键
        btShortOrLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity5_7.this,"短时间按键",Toast.LENGTH_SHORT).show();
            }
        });

        //长时间按键
        btShortOrLong.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(Activity5_7.this,"长时间按键",Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //屏蔽后退键
        if(keyCode == KeyEvent.KEYCODE_BACK){
//                return true;
        }

        if(keyCode == KeyEvent.KEYCODE_VOLUME_UP){
            Toast.makeText(this,"音量增加",Toast.LENGTH_SHORT).show();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }


}
