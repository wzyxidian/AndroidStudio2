package com.example.administrator.androidstudio2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Administrator on 2015/8/24.
 */
public class DrawView extends View {
    private int view_width = 0;
    private int view_height = 0;
    private float preX;
    private float preY;
    private Path path;
    public Paint paint = null;
    Bitmap cacheBitmap = null;
    Canvas cacheCanvas = null;

    public DrawView(Context context,AttributeSet set){
        super(context,set);
        view_width = context.getResources().getDisplayMetrics().widthPixels;
        view_height = context.getResources().getDisplayMetrics().heightPixels;
        System.out.print(view_height + " * "+ view_width);
        cacheBitmap = Bitmap.createBitmap(view_width,view_height, Bitmap.Config.ARGB_8888);
        cacheCanvas = new Canvas();
        path = new Path();
        cacheCanvas.setBitmap(cacheBitmap);
        paint =  new Paint(Paint.DITHER_FLAG);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(1);
        paint.setAntiAlias(true);
        paint.setDither(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawColor(0XFFFFFFFF);
        Paint bmpPaint = new Paint();
        canvas.drawBitmap(cacheBitmap, 0, 0, bmpPaint);
        canvas.drawPath(path, paint);
        canvas.save(Canvas.ALL_SAVE_FLAG);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                path.moveTo(x,y);
                preX = x;
                preY = y;
                break;
            case MotionEvent.ACTION_MOVE:
                float dx = Math.abs(x - preX);
                float dy = Math.abs(y - preY);
                if(dx >= 5 || dy >= 5){
                    path.quadTo(preX,preY,(x+preX)/2,(y+preY)/2);
                    preX = x;
                    preY = y;
                }
                break;
            case MotionEvent.ACTION_UP:
                cacheCanvas.drawPath(path,paint);
                path.reset();
                break;

        }
        invalidate();
        return true;
    }
    public void clear(){
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setStrokeWidth(50);
    }
    public void save(){
        try {
            saveBitmap("myPicture");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void saveBitmap(String fileName) throws IOException{
         File file = new File("/sdcard/pictures/"+fileName+ ".png");
         file.createNewFile();
         FileOutputStream fileOutputStream = new FileOutputStream(file);
         cacheBitmap.compress(Bitmap.CompressFormat.PNG,100,fileOutputStream);
         fileOutputStream.flush();
         fileOutputStream.close();
    }
}
