package com.example.administrator.androidstudio2;

import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.Time;
import java.util.Calendar;


public class TimeAndCountActivity extends ActionBarActivity {

    private DatePicker dpDate;
    private TimePicker tpTime;
    private Chronometer chronometer;
    private int year,month,day,hour,minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_and_count);
        dpDate = (DatePicker) findViewById(R.id.dpDate);
        tpTime = (TimePicker) findViewById(R.id.tpTime);
        chronometer = (Chronometer) findViewById(R.id.cmCount);

        Calendar calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DATE);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        dpDate.setCalendarViewShown(false);
        dpDate.init(year, month, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(TimeAndCountActivity.this, "当前日期是：" + year + "年" + month + "月" + day + "日", Toast.LENGTH_SHORT).show();
            }
        });
        tpTime.setIs24HourView(true);
        tpTime.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
                Toast.makeText(TimeAndCountActivity.this, "当前日期是：" + year + "年" + month + "月" + day + "日" + hourOfDay + "时" + minute + "秒", Toast.LENGTH_SHORT).show();
            }
        });

         chronometer.setBase(SystemClock.elapsedRealtime());
         chronometer.setFormat("已用时间： %s");
         chronometer.start();
         chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
             @Override
             public void onChronometerTick(Chronometer chronometer) {
                 if (SystemClock.elapsedRealtime() - chronometer.getBase() >= 10000) {
                     chronometer.stop();
                 }
             }
         });
    }


}
