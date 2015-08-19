package com.example.administrator.androidstudio2;

import android.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;


public class ImageSwitcherActivity extends ActionBarActivity {
     private ImageSwitcher imgSwitcher;
    private Button btUp,btDown;
    private static final int[] imageId = new int[]{
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
            R.drawable.img05,
            R.drawable.img06,
            R.drawable.img07,
            R.drawable.img08,
    };
    private int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_switcher);
        imgSwitcher = (ImageSwitcher) findViewById(R.id.imgSwitcher);
        btUp = (Button) findViewById(R.id.btUp);
        btDown = (Button) findViewById(R.id.btDown);

        imgSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,android.R.anim.fade_in));
        imgSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        imgSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(ImageSwitcherActivity.this);
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
                return imageView;
            }
        });
        imgSwitcher.setImageResource(imageId[index]);
        btUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (index > 0) {
                    index--;
                } else {
                    index = imageId.length - 1;
                }
                imgSwitcher.setImageResource(imageId[index]);
            }
        });

        btDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index < imageId.length - 1){
                    index++;
                }else {
                    index = 0 ;
                }
                imgSwitcher.setImageResource(imageId[index]);
            }
        });
    }


}
