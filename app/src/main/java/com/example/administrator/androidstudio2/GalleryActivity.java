package com.example.administrator.androidstudio2;

import android.content.res.TypedArray;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


public class GalleryActivity extends ActionBarActivity {
    private Gallery gallery;
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        gallery = (Gallery) findViewById(R.id.gallery);

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
                    imageView = new ImageView(GalleryActivity.this);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                    imageView.setLayoutParams(new Gallery.LayoutParams(180, 135));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
                    imageView.setBackgroundResource(typedArray.getResourceId(R.styleable.Gallery_android_galleryItemBackground, 0));
                    imageView.setPadding(5,0,5,0);
                }else {
                    imageView = (ImageView)convertView;
                }
                return imageView;
            }
        };

        gallery.setAdapter(adapter);
        gallery.setSelection(imageId.length / 2);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GalleryActivity.this,"您选择了第"+String.valueOf(position)+"张图片",Toast.LENGTH_SHORT).show();
            }
        });
    }


}
