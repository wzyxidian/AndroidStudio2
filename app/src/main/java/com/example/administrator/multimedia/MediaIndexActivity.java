package com.example.administrator.multimedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

import com.example.administrator.androidstudio2.R;

public class MediaIndexActivity extends ActionBarActivity {
    private ButtonClickListeners buttonClickListener;
    private Button button101,button102;
    private Button button103,button104;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_index);
        init();
        buttonClickListener = new ButtonClickListeners();
        buttonClickListener();
    }

    private void init(){
        button101 = (Button) findViewById(R.id.button101);
        button102 = (Button) findViewById(R.id.button102);
        button103 = (Button) findViewById(R.id.button103);
        button104 = (Button) findViewById(R.id.button104);

    }

    private void buttonClickListener() {
         button101.setOnClickListener(buttonClickListener);
         button102.setOnClickListener(buttonClickListener);
         button103.setOnClickListener(buttonClickListener);
         button104.setOnClickListener(buttonClickListener);
    }

    public class ButtonClickListeners implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case  R.id.button101:
                    Intent intent01 = new Intent(MediaIndexActivity.this,Activity10_1.class);
                    startActivity(intent01);
                case  R.id.button102:
                    Intent intent02 = new Intent(MediaIndexActivity.this,Activity10_2.class);
                    startActivity(intent02);
                case  R.id.button103:
                    Intent intent03 = new Intent(MediaIndexActivity.this,Activity10_3.class);
                    startActivity(intent03);
                case  R.id.button104:
                    Intent intent04 = new Intent(MediaIndexActivity.this,Activity10_4.class);
                    startActivity(intent04);

            }
        }
    }

}

