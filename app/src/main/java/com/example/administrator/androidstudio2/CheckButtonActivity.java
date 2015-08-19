package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;


public class CheckButtonActivity extends ActionBarActivity {

    private CheckBox cbmusic,cbphysical,cbart;
    private Button btSubmitCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_button);
        cbart = (CheckBox) findViewById(R.id.cbart);
        cbmusic = (CheckBox) findViewById(R.id.cbmusic);
        cbphysical = (CheckBox) findViewById(R.id.cbphysical);
        btSubmitCheckBox = (Button) findViewById(R.id.btSubmitCheckBox);

        cbart.setOnCheckedChangeListener(checkBoxListener);
        cbmusic.setOnCheckedChangeListener(checkBoxListener);
        cbphysical.setOnCheckedChangeListener(checkBoxListener);

        btSubmitCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "";
                if(cbart.isChecked()){
                    str += cbart.getText().toString() + " ";
                }
                if(cbmusic.isChecked()){
                    str += cbmusic.getText().toString() + " ";
                }
                if(cbphysical.isChecked()){
                    str +=cbphysical.getText().toString();
                }
                Toast.makeText(CheckButtonActivity.this,"选中了" + str, Toast.LENGTH_SHORT ).show();
            }
        });

    }
     private CompoundButton.OnCheckedChangeListener checkBoxListener = new CompoundButton.OnCheckedChangeListener() {
         @Override
         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             if(isChecked){
                 Log.i("复选框", "选中了" + buttonView.getText().toString());
             }
         }
     };
}
