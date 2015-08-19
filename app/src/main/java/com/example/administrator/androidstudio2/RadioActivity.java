package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class RadioActivity extends ActionBarActivity {

    private RadioGroup radioGroup;
    private Button btSubmit;
    private String sex = "男";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        radioGroup = (RadioGroup) findViewById(R.id.rgSex);
        btSubmit = (Button) findViewById(R.id.btSubmit);

        //the first way to get the choose
        /*radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton r = (RadioButton) findViewById(checkedId);
                sex = r.getText().toString();
                Toast.makeText(RadioActivity.this,"选择的性别是：" + r.getText(),Toast.LENGTH_SHORT).show();
            }
        });*/

        //the second way to get the choose
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(RadioActivity.this,"选择的性别是： " + sex,Toast.LENGTH_SHORT).show();
                 for(int i=0;i<radioGroup.getChildCount();i++){
                    RadioButton r = (RadioButton) radioGroup.getChildAt(i);
                    if(r.isChecked()){
                        Toast.makeText(RadioActivity.this,"选择的性别是：" + r.getText(),Toast.LENGTH_SHORT).show();
                        break;
                    }
                 }
            }
        });
    }


}
