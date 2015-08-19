package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class ButtonActivity extends ActionBarActivity {

    private Button btShowText,btShowImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btShowText = (Button) findViewById(R.id.btShowText);
//        btShowImage = (Button) findViewById(R.id.btShowImage);

        btShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this,"这是一个普通按钮",Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void myClick(View view){
        Toast.makeText(ButtonActivity.this,"这是一个图片按钮",Toast.LENGTH_SHORT).show();
    }

}
