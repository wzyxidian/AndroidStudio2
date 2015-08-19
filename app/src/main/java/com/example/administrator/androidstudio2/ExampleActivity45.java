package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;


public class ExampleActivity45 extends ActionBarActivity {
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
    private ImageSwitcher isExample45;
    private GridView gvExample45;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_activity45);
        isExample45 = (ImageSwitcher) findViewById(R.id.isExample45);
        gvExample45 = (GridView) findViewById(R.id.gvExample45);

        isExample45.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        isExample45.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        isExample45.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(ExampleActivity45.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                return imageView;
//                return null;
            }
        });
        isExample45.setImageResource(imageId[1]);


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
                    imageView = new ImageView(ExampleActivity45.this);
                    imageView.setAdjustViewBounds(true);
                    imageView.setMaxWidth(150);
                    imageView.setMaxHeight(113);
                    imageView.setPadding(5,5,5,5);
                } else{
                      imageView = (ImageView) convertView;
                }
                imageView.setImageResource(imageId[position]);
                return imageView;
            }
        } ;

        gvExample45.setAdapter(adapter);
        gvExample45.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                isExample45.setImageResource(imageId[position]);
            }
        });
    }

}
