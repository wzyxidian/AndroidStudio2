package com.example.administrator.multimedia;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.VideoView;
import com.example.administrator.androidstudio2.R;

import java.io.File;

public class Activity10_3 extends Activity {
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity10_3);
        video = (VideoView) findViewById(R.id.video01);
        File file = new File("/sdcar/bell.mp4");
        android.widget.MediaController mc = new android.widget.MediaController(Activity10_3.this);
        if (file.exists()) {    //判断要播放的视频文件是否存在
            video.setVideoPath(file.getAbsolutePath());    //指定要播放的视频
            video.setMediaController(mc);    //设置VideoView与MediaController相关联
            video.requestFocus();    //让VideoView获得焦点
            try {
                video.start();    //开始播放视频
            } catch (Exception e) {
                e.printStackTrace();    //输出异常信息
            }
            //为VideoView添加完成事件监听器
            video.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mp) {
                    Toast.makeText(Activity10_3.this, "视频播放完毕！", Toast.LENGTH_SHORT).show();    //弹出消息提示框显示播放完毕
                }
            });
        } else {
            Toast.makeText(this, "要播放的视频文件不存在", Toast.LENGTH_SHORT).show();    //弹出消息提示框提示文件不存在
        }
    }


}
