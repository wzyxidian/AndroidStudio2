package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class Activity9_4 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_4);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout4);
        frameLayout.addView(new MyView(this));
    }

    public class MyView extends View{
        public MyView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(0xFFFF6600);
            paint.setTextAlign(Paint.Align.LEFT);
            paint.setTextSize(24);
            paint.setAntiAlias(true);
            canvas.drawText("不，我不想去!",520,75,paint);
            float[] pos = new float[]{400,260,425,260,450,260,475,260,363,290,388,290,413,290,438,290,463,290,488,290,513,290};
            canvas.drawPosText("你想跟我一起去探险吗?",pos,paint);
            super.onDraw(canvas);
        }
    }

}
