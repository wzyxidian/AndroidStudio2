package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class SeekBarAndRatingBarActivity extends ActionBarActivity {
    private TextView tvSeekBar1;
    private SeekBar seekBar1;
    private RatingBar ratingBar;
    private Button btRatingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek_bar_and_rating_bar);
        tvSeekBar1 = (TextView) findViewById(R.id.tvSeekBar1);
        seekBar1 = (SeekBar) findViewById(R.id.seekbar1);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        btRatingBar = (Button) findViewById(R.id.btRatingBar);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tvSeekBar1.setText("当前值是："+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                 Toast.makeText(SeekBarAndRatingBarActivity.this,"开始滑动",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(SeekBarAndRatingBarActivity.this,"结束滑动",Toast.LENGTH_SHORT).show();
            }
        });
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(SeekBarAndRatingBarActivity.this,"当前的星级是："+rating,Toast.LENGTH_SHORT).show();
            }
        });
    }


}
