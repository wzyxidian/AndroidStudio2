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

    }

    private void buttonClickListener() {
         button101.setOnClickListener(buttonClickListener);
         button102.setOnClickListener(buttonClickListener);
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

            }
        }
    }

}

