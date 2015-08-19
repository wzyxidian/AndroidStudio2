package com.example.administrator.androidstudio2;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements  LeftFragment.onSendDataButtonClickedListener{

    private Button btnChangeRightFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnChangeRightFragment = (Button) findViewById(R.id.btnChangeRightFragment);
        btnChangeRightFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AnotherFragment anotherFragment = new AnotherFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fg_right, anotherFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }


    @Override
    public void onSendDataButtonClicked(String str) {
        RightFragment rightFragment = (RightFragment) getFragmentManager().findFragmentById(R.id.fg_Right);
        if(rightFragment != null){
            rightFragment.updateTextView(str);
        }

    }
}
