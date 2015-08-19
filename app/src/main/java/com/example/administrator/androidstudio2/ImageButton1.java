package com.example.administrator.androidstudio2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class ImageButton1 extends ActionBarActivity {
    private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        imageButton = (ImageButton) findViewById(R.id.ibShow);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ImageButton1.this,"进入游戏...",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
