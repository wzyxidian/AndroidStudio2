package com.example.administrator.androidstudio2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;


public class GridViewActivity1 extends ActionBarActivity {
     private GridView gridView;
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
    private static final String[] title = new String[]{"img01","img02","img03","img04","img05","img06","img0","img08"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_activity1);
        gridView = (GridView) findViewById(R.id.gridView1);
//        List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
//
//        for(int i=0;i<imageId.length;i++){
//            Map<String,Object> map = new HashMap<String,Object>();
//            map.put("image",imageId[i]);
//            map.put("title",title[i]);
//            listItems.add(map);
//        }
//        SimpleAdapter adapter = new SimpleAdapter(this,
//                                    listItems,
//                                    R.layout.items,
//                                    new String[]{"image","title"},
//                                    new int[]{R.id.image,R.id.title});
//        gridView.setAdapter(adapter);


        //第二种方式，不带文字
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imageId.length;
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView;
                if(convertView == null){
                    imageView = new ImageView(GridViewActivity1.this);
                    imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    imageView.setPadding(5,0,5,0);
                }else {
                    imageView = (ImageView) convertView;
                }
                imageView.setImageResource(imageId[position]);
                return imageView;
            }
        };
        gridView.setAdapter(adapter);
    }


}
