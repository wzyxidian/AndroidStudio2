package com.example.administrator.androidstudio2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;


public class AutoCompleteTextViewActivity extends Activity {

    private static final String[] COUNTRIES=new String[]{"mignri","mingrikeji","mignrikejiyouxin","mingrikejiyouxiangngsi","明日","日明","天天"};
    private AutoCompleteTextView textView;
    private Button btSearch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);
        textView = (AutoCompleteTextView) findViewById(R.id.autoctv);
        btSearch1 = (Button) findViewById(R.id.btSearch1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, COUNTRIES);
        textView.setAdapter(adapter);

        btSearch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AutoCompleteTextViewActivity.this,textView.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }


}


