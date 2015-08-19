package com.example.administrator.androidstudio2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class EditViewActivity extends ActionBarActivity {

    private Button btYes,btCancel;
    private EditText etNickName,etPwd,etRePwd,etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_view);
        initBinding();


        btYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String nickName = etNickName.getText().toString().trim();
                 String pwd  = etPwd.getText().toString().trim();
                 String rePwd = etRePwd.getText().toString().trim();
                 String email = etEmail.getText().toString().trim();
                Log.i("nickName:",nickName);
                Log.i("pwd:",pwd);
                System.out.println("email:" + email);
            }
        });
        btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*etxZCXNickName.setHint("please input nickname");
                etPwd.setHint("please input password");
                etEmail.setHint("please input email");*/
                etNickName.setText("");
                etPwd.setText("");
                etRePwd.setText("");
                etEmail.setText("");
                Log.i("nickName", etNickName.getHint().toString());
                Log.i("pwd",etPwd.getHint().toString());

            }
        });
    }

    private void initBinding() {
        btYes = (Button) findViewById(R.id.btYes);
        btCancel = (Button) findViewById(R.id.btCancle);
        etNickName = (EditText) findViewById(R.id.etNickName);
        etPwd = (EditText) findViewById(R.id.etPwd);
        etRePwd = (EditText) findViewById(R.id.etRePwd);
        etEmail = (EditText) findViewById(R.id.etEmail);
    }

}
