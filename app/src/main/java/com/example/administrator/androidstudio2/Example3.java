package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Toast;


public class Example3 extends ActionBarActivity {
    private CheckBox cbAgree;
    private ImageButton ibCome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example3);
        cbAgree = (CheckBox) findViewById(R.id.cbAgree);
        ibCome = (ImageButton) findViewById(R.id.ibCome);

        cbAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    ibCome.setVisibility(View.VISIBLE);
                }else{
                    ibCome.setVisibility(View.INVISIBLE);
                }
                ibCome.invalidate();
            }
        });

        ibCome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Example3.this,"进入游戏...",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
