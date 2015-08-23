package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class Activity9_1 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_1);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout1);
        frameLayout.addView(new MyView(this));

    }
    public class MyView extends View {

        public MyView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            //线性渐变
            Shader shader = new LinearGradient(0,0,50,50, Color.RED,Color.GREEN,Shader.TileMode.MIRROR);
            paint.setShader(shader);
            canvas.drawRect(10,70,100,150,paint);

            //径向渐变
            shader =  new RadialGradient(160,110,50,Color.RED,Color.GREEN,Shader.TileMode.MIRROR);
            paint.setShader(shader);
            canvas.drawRect(115,70,205,150,paint);

            //角度渐变
            shader = new SweepGradient(265,110,new int[]{Color.RED,Color.GREEN,Color.BLUE},null);
            paint.setShader(shader);
            canvas.drawRect(220,70,310,150,paint);

            super.onDraw(canvas);
        }
    }

}
