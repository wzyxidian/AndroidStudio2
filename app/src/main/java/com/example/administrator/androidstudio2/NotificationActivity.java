package com.example.administrator.androidstudio2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class NotificationActivity extends ActionBarActivity {
    Button btShowNotification,btDeleteNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        final NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        btShowNotification = (Button) findViewById(R.id.btShowNotification);
        btDeleteNotification = (Button) findViewById(R.id.btDeleteNotification);

        btShowNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Notification notification = new Notification();
                notification.icon = R.drawable.img01;
                notification.tickerText="显示第一个通知";
                notification.when = System.currentTimeMillis();
                notification.defaults = Notification.DEFAULT_ALL;
                notification.setLatestEventInfo(NotificationActivity.this, "无题", "每天进步一点点", null);
                notificationManager.notify(123, notification);

                Notification notification1 = new Notification(R.drawable.img02,"显示第二个通知",System.currentTimeMillis());
                notification1.flags|=Notification.FLAG_AUTO_CANCEL;

                Intent intent = new Intent(NotificationActivity.this,ContentActivity.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(NotificationActivity.this, 0, intent, 0);
                notification1.setLatestEventInfo(NotificationActivity.this,"通知","查看详细信息",pendingIntent);
                notificationManager.notify(1234,notification1);
            }
        });

        btDeleteNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationManager.cancel(123);
                notificationManager.cancelAll();
            }
        });
    }


}
