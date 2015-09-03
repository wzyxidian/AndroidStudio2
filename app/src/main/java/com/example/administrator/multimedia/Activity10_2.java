package com.example.administrator.multimedia;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.example.administrator.androidstudio2.R;

import java.util.HashMap;

public class Activity10_2 extends ActionBarActivity {
    private SoundPool soundpool;
    private HashMap<Integer,Integer> soundmap = new HashMap<Integer,Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10_2);
        Button chimes = (Button) findViewById(R.id.button08);	//获取“风铃声”按钮
        Button enter = (Button) findViewById(R.id.button09);		//获取“布谷鸟叫声”按钮
        Button notify = (Button) findViewById(R.id.button10);	//获取“门铃声”按钮
        Button ringout = (Button) findViewById(R.id.button11);	//获取“电话声”按钮
        soundpool = new SoundPool(5, AudioManager.STREAM_SYSTEM,0);
        soundmap.put(1, soundpool.load(this, R.raw.chimes, 1));
        soundmap.put(2, soundpool.load(this, R.raw.enter, 1));
        soundmap.put(3, soundpool.load(this, R.raw.notify, 1));
        soundmap.put(4, soundpool.load(this, R.raw.ringout, 1));
        soundmap.put(5, soundpool.load(this, R.raw.ding, 1));

        chimes.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                soundpool.play(soundmap.get(1), 1, 1, 0, 0, 1);
            }
        });
        enter.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                soundpool.play(soundmap.get(2), 1, 1, 0, 0, 1);//播放指定的音频

            }
        });
        notify.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                soundpool.play(soundmap.get(3), 1, 1, 0, 0, 1);//播放指定的音频

            }
        });
        ringout.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                soundpool.play(soundmap.get(4), 1, 1, 0, 0, 1);//播放指定的音频
                soundpool.play(soundpool.load(Activity10_2.this, R.raw.notify, 1), 1, 1, 0, 0, 1);
            }
        });

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        soundpool.play(soundmap.get(5), 1, 1, 0, 0, 1);		//播放按键音
        return true;
    }
}
