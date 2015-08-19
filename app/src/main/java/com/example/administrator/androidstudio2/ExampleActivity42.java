package com.example.administrator.androidstudio2;

import android.content.res.TypedArray;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;


public class ExampleActivity42 extends ActionBarActivity {

    private ImageSwitcher imgSwitcherTop;
    private Gallery galleryButtom;
    private int[] imgId = new int[]{
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
            R.drawable.img05,
            R.drawable.img06,
            R.drawable.img07,
            R.drawable.img08,

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_activity42);

        imgSwitcherTop = (ImageSwitcher) findViewById(R.id.imgSwitcherTop);
        galleryButtom = (Gallery) findViewById(R.id.galleryButtom);

        imgSwitcherTop.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imgSwitcherTop.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        imgSwitcherTop.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(ExampleActivity42.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });

        BaseAdapter baseAdapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imgId.length;
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
                    imageView = new ImageView(ExampleActivity42.this);
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    imageView.setLayoutParams(new Gallery.LayoutParams(180,135));
                    TypedArray typedArray = obtainStyledAttributes(R.styleable.Gallery);
                    imageView.setBackgroundResource(typedArray.getResourceId(R.styleable.Gallery_android_galleryItemBackground,0));
                    imageView.setPadding(5,0,5,0);
                }else{
                    imageView = (ImageView) convertView;
                }
                imageView.setImageResource(imgId[position]);
                return imageView;
            }
        };

        galleryButtom.setAdapter(baseAdapter);
        galleryButtom.setSelection(imgId.length / 2);
        galleryButtom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgSwitcherTop.setImageResource(imgId[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }


}
