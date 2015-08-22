package com.example.administrator.androidstudio2;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Activity8_10 extends ActionBarActivity {
    private EditText editText0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity8_10);
        editText0 = (EditText) findViewById(R.id.editText0);
        registerForContextMenu(editText0);
    }


    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,item.getItemId(),Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = new MenuInflater(this);
        menuInflater.inflate(R.menu.contextmenu1,menu);

    }
}
