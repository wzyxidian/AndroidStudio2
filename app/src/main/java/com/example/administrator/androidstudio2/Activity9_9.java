package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;


public class Activity9_9 extends ActionBarActivity {
    private int view_width;
    private int view_height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_9);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.frameLayout9);
        frameLayout.addView(new MyView(this));
    }

    public class MyView extends View {


       public MyView(Context context){
           super(context);
           view_width = context.getResources().getDisplayMetrics().widthPixels;
           view_height = context.getResources().getDisplayMetrics().heightPixels;
       }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Bitmap bitmap_bg = BitmapFactory.decodeResource(Activity9_9.this.getResources(),R.drawable.aaa);
            canvas.drawBitmap(bitmap_bg, 0, 0, paint);

            Bitmap bitmap_pic = BitmapFactory.decodeResource(Activity9_9.this.getResources(),R.drawable.img01);
           // canvas.drawBitmap(bitmap_pic, 0, 0, paint);
             //旋转30度
           /* Matrix matrix = new Matrix();
            matrix.setRotate(30);
            canvas.drawBitmap(bitmap_pic, matrix, paint);

            //以87,87为心旋转90度
            Matrix matrix1 = new Matrix();
            matrix1.setRotate(90, 87, 87);
            canvas.drawBitmap(bitmap_pic, matrix1, paint);

            //x轴放大两倍，y轴放大两倍
            Matrix matrix2 = new Matrix();
            matrix2.setScale(2f, 2f);
            canvas.drawBitmap(bitmap_pic, matrix2, paint);

            //以156,156为轴心，在x轴、y轴都缩放80%
            Matrix matrix3 = new Matrix();
            matrix3.setScale(0.8f, 0.8f, 156, 156);
            canvas.drawBitmap(bitmap_pic, matrix3, paint);

            //以0,0为轴心，将图像在x轴上倾斜2，在y轴上倾斜1,
            Matrix matrix4 = new Matrix();
            matrix4.setSkew(2f,1f);
            canvas.drawBitmap(bitmap_pic, matrix4, paint);

            //以（300,300）为轴心将图像在x轴上倾斜-0.5
            Matrix matrix5 = new Matrix();
            matrix5.setSkew(-0.5f,0f,300,300);
            canvas.drawBitmap(bitmap_pic, matrix5, paint);

            //将图像平移到（100,100）这个位置上
            Matrix matrix6 = new Matrix();
            matrix6.setTranslate(100,100);
            canvas.drawBitmap(bitmap_pic,matrix6,paint);
            */

            //使用BitmapShader渲染图像
           /* BitmapShader bitmapShader = new BitmapShader(bitmap_pic, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
            paint.setShader(bitmapShader);
            canvas.drawRect(0, 0, view_width, view_height, paint);

            Bitmap bitmap_pic1 = BitmapFactory.decodeResource(Activity9_9.this.getResources(),R.drawable.img02);
            BitmapShader bitmapShader1 = new BitmapShader(bitmap_pic1, Shader.TileMode.REPEAT, Shader.TileMode.MIRROR);
            paint.setShader(bitmapShader1);
            RectF rectF = new RectF(0,0,280,180);
            canvas.translate(300,300);
            canvas.drawOval(rectF,paint);*/

            //实现带描边的圆角照片
            RectF rectF = new RectF(0,0,280,280);
            canvas.translate(100, 100);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(2);
            canvas.drawRoundRect(rectF, 10, 10, paint);
            paint.setStyle(Paint.Style.FILL);
            BitmapShader bitmapShader2 = new BitmapShader(bitmap_pic, Shader.TileMode.REPEAT, Shader.TileMode.MIRROR);
            paint.setShader(bitmapShader2);
            canvas.drawRoundRect(rectF,10,10,paint);
            super.onDraw(canvas);
        }
    }
}
