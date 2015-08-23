package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelXorXfermode;
import android.graphics.RectF;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class Activity9_3 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_3);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout3);
        frameLayout.addView(new MyView(this));
    }

    public class MyView extends View{

        public MyView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setStrokeWidth(3);
            paint.setStyle(Paint.Style.STROKE);

            paint.setColor(Color.BLUE);
            canvas.drawCircle(50, 50, 30, paint);

            paint.setColor(Color.YELLOW);
            canvas.drawCircle(100, 50, 30, paint);

            paint.setColor(Color.BLACK);
            canvas.drawCircle(150, 50, 30, paint);

            paint.setColor(Color.GREEN);
            canvas.drawCircle(75, 90, 30, paint);

            paint.setColor(Color.RED);
            canvas.drawCircle(125, 90, 30, paint);

//            //绘制弧
//            RectF rectF = new RectF(10,20,100,10);
//            canvas.drawArc(rectF, 0, 60, true, paint);
//            rectF = new RectF(110,20,200,110);
//            canvas.drawArc(rectF, 0, 60, false, paint);
//            //绘制圆环
//            canvas.drawCircle(50, 50, 15, paint);
//            //绘制一条线
//            paint.setStyle(Paint.Style.FILL);
//            canvas.drawLine(100, 10, 150, 10, paint);
//            //绘制多条线
//            canvas.drawLines(new float[]{10, 10, 30, 10, 30, 10, 15, 30, 15, 30, 10, 10}, paint);
//            //绘制一个点
//            canvas.drawPoint(10, 10, paint);
//            //绘制椭圆
//            rectF = new RectF(40,20,80,40);
//            canvas.drawOval(rectF, paint);
//            //绘制多个点
//            canvas.drawPoints(new float[]{10, 10, 15, 10, 20, 15, 25, 10, 30, 10}, paint);
//            //绘制矩形
//            canvas.drawRect(10,10,40,30,paint);
//            paint.setXfermode(new PixelXorXfermode(Color.BLUE));
//            //绘制圆角矩阵
//            rectF = new RectF(40,20,80,40);
//            canvas.drawRoundRect(rectF,6,6,paint);
//            paint.setStyle(Paint.Style.FILL);
            super.onDraw(canvas);
        }
    }


}
