package com.example.administrator.multimedia;

import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.androidstudio2.R;

import java.io.IOException;

public class Activity10_4 extends ActionBarActivity {
    private MediaPlayer mp;
    private SurfaceView sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10_4);
        mp=new MediaPlayer();		//实例化MediaPlayer对象
        sv=(SurfaceView)findViewById(R.id.surfaceView1);	//获取布局管理器中添加的SurfaceView组件
        Button play=(Button)findViewById(R.id.button11);	//获取“播放”按钮
        final Button pause=(Button)findViewById(R.id.button12);	//获取“暂停/继续”按钮
        Button stop=(Button)findViewById(R.id.button13);		//获取“停止”按钮
        //为“播放”按钮添加单击事件监听器
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.reset();
                try {
                    mp.setDataSource("/sdcard/ccc.mp4");
                    mp.setDisplay(sv.getHolder());
                    mp.prepare();
                    mp.start();
                    sv.setBackgroundResource(R.drawable.bg_playing);
                    pause.setText("暂停");
                    pause.setEnabled(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        //为“停止”按钮添加单击事件监听器
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(mp.isPlaying()){
                  mp.stop();
                  sv.setBackgroundResource(R.drawable.bg_finish);
                  pause.setEnabled(false);
              }

            }
        });
        //为“暂停”按钮添加单击事件监听器
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                   mp.pause();
                   ((Button)v).setText("继续");
                }else{
                    mp.start();
                    ((Button)v).setText("暂停");
                }
            }
        });
        //为MediaPlayer对象添加完成事件监听器
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                sv.setBackgroundResource(R.drawable.bg_finish);	//改变SurfaceView的背景图片
                Toast.makeText(Activity10_4.this, "视频播放完毕！", Toast.LENGTH_SHORT).show();
            }
        });

    }
    @Override
    protected void onDestroy() {
        if(mp.isPlaying()){
            mp.stop();	//停止播放视频
        }
        mp.release();	//释放资源
        super.onDestroy();
    }

}
