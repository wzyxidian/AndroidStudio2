package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class Activity9_2 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_2);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout2);
        frameLayout.addView(new DrawView(this));
    }

    public class DrawView extends View{

        public DrawView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setShadowLayer(2, 3, 3, Color.rgb(180, 180, 180));
            canvas.drawRect(40,40,200,200,paint);
            super.onDraw(canvas);
        }
    }

}
