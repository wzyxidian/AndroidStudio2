package com.example.administrator.androidstudio2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExampleActivity44 extends ActionBarActivity {

    private static final int[] imageId = new int[]{
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
            R.drawable.img05,
            R.drawable.img06,
            R.drawable.img07,
            R.drawable.img08
    };
    private Button btlistShow;
    private static final String[] title = new String[]{"img01","img02","img03","img04","img05","img06","img0","img08"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_activity44);

        List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < imageId.length; i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("image", imageId[i]);
            map.put("title", title[i]);
            listItems.add(map);
        }
        final SimpleAdapter adapter = new SimpleAdapter(this,
                listItems,
                R.layout.items,
                new String[]{"image", "title"},
                new int[]{R.id.image, R.id.title});
        btlistShow = (Button) findViewById(R.id.btlistShow);
        btlistShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ExampleActivity44.this);
                builder.setIcon(R.drawable.img01);
                builder.setTitle("设置");
                builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(ExampleActivity44.this,"您选择了"+title[which],Toast.LENGTH_SHORT).show();
                    }

                });
                builder.create().show();
            }
        });
    }

    }
