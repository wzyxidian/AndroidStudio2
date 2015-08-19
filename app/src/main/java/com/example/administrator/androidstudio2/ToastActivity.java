package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ToastActivity extends ActionBarActivity {
     private LinearLayout linearLayout2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        linearLayout2 =  new LinearLayout(this);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.img01);
        imageView.setPadding(0, 0, 5, 0);
        TextView textView = new TextView(this);
        textView.setText("我是通过构造方法创建的消息提示框");
        linearLayout2.addView(imageView);
        linearLayout2.addView(textView);
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setView(linearLayout2);
        toast.show();

    }


}
