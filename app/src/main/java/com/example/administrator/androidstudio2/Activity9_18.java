package com.example.administrator.androidstudio2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Activity9_18 extends ActionBarActivity {
    private List<String> imagePath = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity9_18);
        String sdPath = Environment.getExternalStorageState() + "/";
        System.out.println(sdPath);
        getFiles(sdPath);
        if (imagePath.size() < 1){
            return;
        }
        GridView gridView = (GridView) findViewById(R.id.gridView2);
        BaseAdapter adapter = new BaseAdapter() {
            @Override
            public int getCount() {
                return imagePath.size();
            }

            @Override
            public Object getItem(int position) {
                return position;
            }

            @Override
            public long getItemId(int position) {
                return position;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                ImageView imageView;
                if(convertView == null){
                    imageView = new ImageView(Activity9_18.this);
                    imageView.setAdjustViewBounds(true);
                    imageView.setMaxWidth(150);
                    imageView.setMaxHeight(113);
                    imageView.setPadding(5,5,5,5);
                }  else{
                    imageView = (ImageView) convertView;
                }
                Bitmap bm = BitmapFactory.decodeFile(imagePath.get(position));
                imageView.setImageBitmap(bm);
                return imageView;
            }
        };

        gridView.setAdapter(adapter);

    }

    //遍历指定的路径
    private void getFiles(String url){
        File files = new File(url);
        File[] file = files.listFiles();
        try{
            for(File f : file){
                if(f.isDirectory()){
                    getFiles(f.getAbsolutePath());
                }else{
                    if(isImmerFile(f.getPath())) {
                        imagePath.add(f.getPath());
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static String[] imageFormatSet = new String[] {"jpg","png","gif"};
    //判断是否为图片格式
    private static boolean isImmerFile(String path){
        for(String format : imageFormatSet){
            if(path.contains(format)){
                return true;
            }
        }
        return false;
    }

}
