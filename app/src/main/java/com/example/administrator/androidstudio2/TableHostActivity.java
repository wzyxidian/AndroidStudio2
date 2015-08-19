package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;


public class TableHostActivity extends ActionBarActivity {
    private TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_host);
        tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();

        LayoutInflater inflater = LayoutInflater.from(this);
        inflater.inflate(R.layout.tab1,tabHost.getTabContentView());
        inflater.inflate(R.layout.tab2,tabHost.getTabContentView());

        tabHost.addTab(tabHost.newTabSpec("tab01")
                    .setIndicator("未接来电")
                    .setContent(R.id.LinearLayout01));
        tabHost.addTab(tabHost.newTabSpec("tab02")
                    .setIndicator("已接来电")
                    .setContent(R.id.LinearLayout02));
    }


}
