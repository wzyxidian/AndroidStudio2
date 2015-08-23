package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class Activity9_5 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_5);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout5);
        frameLayout.addView(new MyView(this));
    }

    public class MyView extends View{
        public MyView(Context context){
           super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            paint.setColor(0xFFFF6600);
            paint.setTextSize(24);
            //绘制圆形路径
            Path pathCircle = new Path();
            pathCircle.addCircle(70,70,40,Path.Direction.CCW);
            canvas.drawPath(pathCircle,paint);
            //绘制折线路径
            Path pathLine = new Path();
            pathLine.moveTo(150,100);
            pathLine.lineTo(200, 45);
            pathLine.lineTo(250, 100);
            pathLine.lineTo(300, 80);
            canvas.drawPath(pathLine,paint);
            //绘制三角形路径
            Path pathTr = new Path();
            pathTr.moveTo(350, 80);
            pathTr.lineTo(400, 30);
            pathTr.lineTo(450, 80);
            pathTr.close();
            canvas.drawPath(pathTr,paint);
            //绘制绕路径的环形文字
            Path path = new Path();
            String str = "风萧萧兮易水寒，壮士一去兮不复还";
            path.addCircle(550,100,48,Path.Direction.CW);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawTextOnPath(str,path,0,-18,paint);
        }
    }
}
