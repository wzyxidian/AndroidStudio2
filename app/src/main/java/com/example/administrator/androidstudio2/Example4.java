package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Example4 extends ActionBarActivity {

    private ImageView ivDefault1,ivDefault2,ivDefault3;
    private TextView tvTitle;
    private Button btReset;
    int[] imageIds = new int[]{R.drawable.sorry,R.drawable.ok,R.drawable.sorry};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example4);
        ivDefault1 = (ImageView) findViewById(R.id.ivDefault1);
        ivDefault2 = (ImageView) findViewById(R.id.ivDefault2);
        ivDefault3 = (ImageView) findViewById(R.id.ivDefault3);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        btReset = (Button) findViewById(R.id.btReset);
        reset();
        ivDefault1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRight(v, 0);
            }
        });
        ivDefault2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRight(v,1);
            }
        });
        ivDefault3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isRight(v,2);
            }
        });
        btReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
                tvTitle.setText("猜猜鸡蛋在哪只鞋子里？");
                ivDefault1.setAlpha(255);
                ivDefault2.setAlpha(255);
                ivDefault3.setAlpha(255);
                ivDefault1.setImageDrawable(getResources().getDrawable(R.drawable.defaultweather1));
                ivDefault2.setImageDrawable(getResources().getDrawable(R.drawable.defaultweather1));
                ivDefault3.setImageDrawable(getResources().getDrawable(R.drawable.defaultweather1));
            }
        });
    }

    private void reset(){
        for(int i=0;i<3;i++){
            int temp =  imageIds[i];
            int index = (int)(Math.random() *2);
            imageIds[i] = imageIds[index];
            imageIds[index] = temp;
        }
    }

    private void isRight(View v, int index){
        ivDefault1.setImageDrawable(getResources().getDrawable(imageIds[0]));
        ivDefault2.setImageDrawable(getResources().getDrawable(imageIds[1]));
        ivDefault3.setImageDrawable(getResources().getDrawable(imageIds[2]));
        ivDefault1.setAlpha(100);
        ivDefault2.setAlpha(100);
        ivDefault3.setAlpha(100);

        ImageView v1 = (ImageView) v;
        v1.setAlpha(255);
        if(imageIds[index] ==  R.drawable.ok){
            tvTitle.setText("恭喜您，猜对了！");
        }else{
            tvTitle.setText("很抱歉，猜错了，再试一次");
        }

    }

}
