package com.example.administrator.androidstudio2;

import android.os.Bundle;
import android.os.Message;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.os.Handler;


public class ProgressBarActivity extends ActionBarActivity {
    private ProgressBar progressBar1, progressBar2;
    private int mProgressStatus = 0;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        progressBar1 = (ProgressBar) findViewById(R.id.progressBar1);
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);

        handler = new Handler() {
            public void handleMessage(Message m) {
                if (m.what == 0x11) {
                    progressBar1.setProgress(mProgressStatus);
                } else {
                    Toast.makeText(ProgressBarActivity.this, "耗时操作工作已经完成", Toast.LENGTH_SHORT).show();
                    progressBar1.setVisibility(View.GONE);
                    progressBar2.setVisibility(View.GONE);
                }
            }
        };
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    mProgressStatus = doWork();
                    Message m = new Message();
                    if (mProgressStatus < 100) {
                        m.what = 0x11;
                        handler.sendMessage(m);
                    } else {
                        m.what = 0x10;
                        handler.sendMessage(m);
                        break;
                    }
                }

            }

            private int doWork() {
                mProgressStatus += Math.random() * 10;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return mProgressStatus;
            }
        }).start();
    }

}