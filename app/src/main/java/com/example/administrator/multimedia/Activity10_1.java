package com.example.administrator.multimedia;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.androidstudio2.R;

public class Activity10_1 extends ActionBarActivity {
    private TextView textView;
    private Button button05,button06,button07;
    private MediaPlayer mediaPlayer;
    private boolean isPause = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10_1);
        textView = (TextView) findViewById(R.id.textView01);
        button05 = (Button) findViewById(R.id.button05);
        button06 = (Button) findViewById(R.id.button06);
        button07 = (Button) findViewById(R.id.button07);
        mediaPlayer = MediaPlayer.create(this,R.raw.shengxia);


        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                play();
            }
        });
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                play();
                if (isPause) {
                    button06.setText("暂停");
                    isPause = false;
                }
                button05.setEnabled(false);
                button06.setEnabled(true);
                button07.setEnabled(true);
            }
        });

        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 if(mediaPlayer.isPlaying() && !isPause){
                     mediaPlayer.pause();
                     isPause = true;
                     ((Button) v).setText("继续");
                     textView.setText("暂停播放音乐。。。。");
                     button05.setEnabled(true);
                 }else {
                     mediaPlayer.start();
                     ((Button) v).setText("暂停");
                     textView.setText("继续播放音乐。。。。");
                     isPause = false;
                     button05.setEnabled(false);
                 }
            }
        });

        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                textView.setText("停止播放音乐。。。。。");
                button05.setEnabled(true);
                button06.setEnabled(true);
                button07.setEnabled(false);
            }
        });
    }


    private void play() {
        mediaPlayer.start();
        textView.setText("正在播放的音乐是。。。。");
    }

    @Override
    protected void onDestroy() {
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
        }
        mediaPlayer.release();
        super.onDestroy();
    }
}
