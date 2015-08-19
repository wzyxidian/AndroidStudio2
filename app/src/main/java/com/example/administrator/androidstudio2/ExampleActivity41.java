package com.example.administrator.androidstudio2;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;


public class ExampleActivity41 extends Activity {
    private int[] imageId = new int[]{
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
            R.drawable.img05,
            R.drawable.img06
    };
    private LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_PROGRESS); // 显示水平进度条
        setContentView(R.layout.activity_example_activity41);
        l = (LinearLayout) findViewById(R.id.linerLayout);
        new MyTack().execute();
    }

    class MyTack extends AsyncTask<Void,Integer,LinearLayout>{
        @Override
        protected void onPreExecute() {
            setProgressBarVisibility(true);
            super.onPreExecute();

        }

        @Override
        protected LinearLayout doInBackground(Void... params) {
            LinearLayout ll = new LinearLayout(ExampleActivity41.this);
            for(int i=1;i<imageId.length;i++){
                ImageView imageView = new ImageView(ExampleActivity41.this);
                imageView.setLayoutParams(new LayoutParams(245,108));
                imageView.setImageResource(imageId[i-1]);
                ll.addView(imageView);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                publishProgress(i);
            }
            return ll;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            setProgress(values[0] * 2500);
            super.onProgressUpdate(values);
        }

        @Override
        protected void onPostExecute(LinearLayout linearLayout) {
            setProgressBarVisibility(false);
            l.addView(linearLayout);
            super.onPostExecute(linearLayout);
        }
    }

}
