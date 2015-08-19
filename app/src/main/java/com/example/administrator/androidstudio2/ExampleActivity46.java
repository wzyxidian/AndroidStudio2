package com.example.administrator.androidstudio2;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.TableRow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExampleActivity46 extends ActionBarActivity {
    private Button btLogin46,btExit46;
    private EditText etUserName,etPassword;
    private String user = "匿名";
    final int NOTIFYID_1 = 123;
    private NotificationManager notificationManager;
    private static final int[] imageId = new int[]{
            R.drawable.img01,
            R.drawable.img02,
            R.drawable.img03,
            R.drawable.img04,
    };
    private static final String[] title = new String[]{"在线","离线","隐身","忙碌"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_activity46);
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        btLogin46 = (Button) findViewById(R.id.btLogin46);
        btExit46 = (Button) findViewById(R.id.btExit46);

        etUserName = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);

        btLogin46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!"".equals(etUserName.getText().toString())){
                    user = etUserName.getText().toString();
                    sendNotification();
                }
            }
        });

        btExit46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationManager.cancelAll();
                findViewById(R.id.tableRow1).setVisibility(View.VISIBLE);
                findViewById(R.id.tableRow2).setVisibility(View.VISIBLE);
                ((Button) findViewById(R.id.btLogin46)).setText("登陆");
            }
        });


    }

     private void sendNotification(){
         AlertDialog.Builder builder = new AlertDialog.Builder(ExampleActivity46.this);
         builder.setIcon(R.drawable.img01);
         builder.setTitle("我的登陆状态：");
         List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
         for(int i=0;i<imageId.length;i++){
             Map<String,Object> map = new HashMap<String,Object>();
             map.put("image",imageId[i]);
             map.put("title",title[i]);
             listItems.add(map);
         }
         final SimpleAdapter adapter = new SimpleAdapter(this,
                 listItems,
                 R.layout.items,
                 new String[]{"image", "title"},
                 new int[]{R.id.image, R.id.title});
         builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
             @Override
             public void onClick(DialogInterface dialog, int which) {
                 Notification notification = new Notification();
                 notification.icon = imageId[which];
                 notification.tickerText = title[which];
                 notification.when = System.currentTimeMillis();
                 notification.defaults = Notification.DEFAULT_SOUND;
                 notification.setLatestEventInfo(ExampleActivity46.this, user, title[which], null);
                 notificationManager.notify(NOTIFYID_1, notification);
                 ((TableRow) findViewById(R.id.tableRow1)).setVisibility(View.INVISIBLE);
                 ((TableRow)findViewById(R.id.tableRow2)).setVisibility(View.INVISIBLE);
                 ((Button)findViewById(R.id.btLogin46)).setText(user + title[which]);
             }
         });
         builder.create().show();
     }
}
