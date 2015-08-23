package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

  //绘制Android的机器人
public class Activity9_6 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_6);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout6);
        frameLayout.addView(new MyView(this));
    }

    public class MyView extends View{
        public MyView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(0xFFA4C739);
            //绘制机器人的头部
            RectF rectF_head = new RectF(10,10,100,100);
            rectF_head.offset(100, 20);
            canvas.drawArc(rectF_head, -10, -160, false, paint);
            //绘制眼睛
            paint.setColor(Color.WHITE);
            canvas.drawCircle(135, 53, 4, paint);
            canvas.drawCircle(175, 53, 4, paint);
            paint.setColor(0xFFA4C739);
            //绘制天线
            paint.setStrokeWidth(2);
            canvas.drawLine(120,15,135,35,paint);
            canvas.drawLine(190, 15, 175, 35, paint);
            //绘制身体
            canvas.drawRect(110, 75, 200, 150, paint);
            RectF rectF_body = new RectF(110,140,200,160);
            canvas.drawRoundRect(rectF_body,10,10,paint);
            //绘制胳膊
            RectF rectF_arm = new RectF(85,75,105,140);
            canvas.drawRoundRect(rectF_arm,10,10,paint);
            rectF_arm.offset(120, 0);
            canvas.drawRoundRect(rectF_arm,10,10,paint);
            //绘制腿
            RectF rectF_leg = new RectF(125,150,145,200);
            canvas.drawRoundRect(rectF_leg,10,10,paint);
            rectF_leg.offset(40,0);
            canvas.drawRoundRect(rectF_leg,10,10,paint);

            super.onDraw(canvas);
        }
    }
}
