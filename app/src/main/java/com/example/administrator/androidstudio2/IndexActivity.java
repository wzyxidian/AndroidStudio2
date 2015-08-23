package com.example.administrator.androidstudio2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class IndexActivity extends ActionBarActivity {
    private Button btTextView, btEditText,btButtonActivity,btRadioActivity,btCheckBoxActivity,btImageViewActivity,btSpinnerActivity;
    private Button btListViewActivity,btTimeAndCountActivity;
    private buttonClickListener buttonClickListener;
    private Button btExample1,btExample2,btExample3,btExample4;
    private Button btAutoCTV,btProbar,btSeekAndRate,btTabHost,btImgSwitcher,btGridView1,btGallery;
    private Button btExample41,btExample42,btToastActivity,btNotification,btExample43,btExample44;
    private Button btExample45,btExample46;
    private Button btChaper7,btTitle7_4;
    private Button btMenu8_6;
    private Button btMenu8_9;
    private Button btMenu9_1,btMenu9_2,btMenu9_3,btMenu9_4,btMenu9_5,btMenu9_6,btMenu9_8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        init();
        buttonClickListener = new buttonClickListener();
        buttonClickListener();

    }

    private void init() {
        btTextView = (Button) findViewById(R.id.btTextView);
        btEditText = (Button) findViewById(R.id.btEditText);
        btButtonActivity = (Button) findViewById(R.id.btBttonActivity);
        btRadioActivity = (Button) findViewById(R.id.btRadioActivity);
        btCheckBoxActivity = (Button) findViewById(R.id.btCheckBoxActivity);
        btImageViewActivity = (Button) findViewById(R.id.btImageViewActivity);
        btSpinnerActivity = (Button) findViewById(R.id.btSpinnerActivity);
        btListViewActivity = (Button) findViewById(R.id.btListViewActivity);
        btTimeAndCountActivity = (Button) findViewById(R.id.btTimeAndCountActivity);
        btExample1 = (Button) findViewById(R.id.btExample1);
        btExample2 = (Button) findViewById(R.id.btExample2);
        btExample3 = (Button) findViewById(R.id.btExample3);
        btExample4 = (Button) findViewById(R.id.btExample4);
        btAutoCTV = (Button) findViewById(R.id.btAtuoCTV);
        btProbar = (Button) findViewById(R.id.btProbar);
        btSeekAndRate = (Button) findViewById(R.id.btSeekAndRate);
        btTabHost = (Button) findViewById(R.id.btTabHost);
        btImgSwitcher = (Button) findViewById(R.id.btImgSwitcher);
        btGridView1 = (Button) findViewById(R.id.btGridView1);
        btGallery = (Button) findViewById(R.id.btGallery);
        btExample41 = (Button) findViewById(R.id.btExample41);
        btExample42 = (Button) findViewById(R.id.btExample42);
        btToastActivity = (Button) findViewById(R.id.btToastActivity);
        btNotification = (Button) findViewById(R.id.btNotification);
        btExample43 = (Button) findViewById(R.id.btExample43);
        btExample44 = (Button) findViewById(R.id.btExample44);
        btExample45 = (Button) findViewById(R.id.btExample45);
        btExample46 = (Button) findViewById(R.id.btExample46);
        btChaper7 = (Button) findViewById(R.id.btChaper7);
        btTitle7_4 = (Button) findViewById(R.id.btTitle7_4);
        btMenu8_6 = (Button) findViewById(R.id.btMenu8_6);
        btMenu8_9 = (Button) findViewById(R.id.btMenu8_9);
        btMenu9_1 = (Button) findViewById(R.id.btMenu9_1);
        btMenu9_2 = (Button) findViewById(R.id.btMenu9_2);
        btMenu9_3 = (Button) findViewById(R.id.btMenu9_3);
        btMenu9_4 = (Button) findViewById(R.id.btMenu9_4);
        btMenu9_5 = (Button) findViewById(R.id.btMenu9_5);
        btMenu9_6 = (Button) findViewById(R.id.btMenu9_6);
        btMenu9_8 = (Button) findViewById(R.id.btMenu9_8);
    }

    private void buttonClickListener() {
        btTextView.setOnClickListener(buttonClickListener);
        btEditText.setOnClickListener(buttonClickListener);
        btButtonActivity.setOnClickListener(buttonClickListener);
        btRadioActivity.setOnClickListener(buttonClickListener);
        btCheckBoxActivity.setOnClickListener(buttonClickListener);
        btImageViewActivity.setOnClickListener(buttonClickListener);
        btSpinnerActivity.setOnClickListener(buttonClickListener);
        btListViewActivity.setOnClickListener(buttonClickListener);
        btTimeAndCountActivity.setOnClickListener(buttonClickListener);
        btExample1.setOnClickListener(buttonClickListener);
        btExample2.setOnClickListener(buttonClickListener);
        btExample3.setOnClickListener(buttonClickListener);
        btExample4.setOnClickListener(buttonClickListener);
        btAutoCTV.setOnClickListener(buttonClickListener);
        btProbar.setOnClickListener(buttonClickListener);
        btSeekAndRate.setOnClickListener(buttonClickListener);
        btTabHost.setOnClickListener(buttonClickListener);
        btImgSwitcher.setOnClickListener(buttonClickListener);
        btGridView1.setOnClickListener(buttonClickListener);
        btGallery.setOnClickListener(buttonClickListener);
        btExample41.setOnClickListener(buttonClickListener);
        btExample42.setOnClickListener(buttonClickListener);
        btToastActivity.setOnClickListener(buttonClickListener);
        btNotification.setOnClickListener(buttonClickListener);
        btExample43.setOnClickListener(buttonClickListener);
        btExample44.setOnClickListener(buttonClickListener);
        btExample45.setOnClickListener(buttonClickListener);
        btExample46.setOnClickListener(buttonClickListener);
        btChaper7.setOnClickListener(buttonClickListener);
        btTitle7_4.setOnClickListener(buttonClickListener);
        btMenu8_6.setOnClickListener(buttonClickListener);
        btMenu8_9.setOnClickListener(buttonClickListener);
        btMenu9_1.setOnClickListener(buttonClickListener);
        btMenu9_2.setOnClickListener(buttonClickListener);
        btMenu9_3.setOnClickListener(buttonClickListener);
        btMenu9_4.setOnClickListener(buttonClickListener);
        btMenu9_5.setOnClickListener(buttonClickListener);
        btMenu9_6.setOnClickListener(buttonClickListener);
        btMenu9_8.setOnClickListener(buttonClickListener);
    }

    public class buttonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
               switch (v.getId()){
                   case R.id.btTextView:
                       Intent intent1 = new Intent(IndexActivity.this, TextViewActivity.class);
                       startActivity(intent1);
                       break;
                   case R.id.btEditText:
                       Intent intent2 = new Intent(IndexActivity.this, EditViewActivity.class);
                       startActivity(intent2);
                       break;
                   case R.id.btBttonActivity:
                       Intent intent3 = new Intent(IndexActivity.this, ButtonActivity.class);
                       startActivity(intent3);
                       break;
                   case R.id.btRadioActivity:
                       Intent intent4 = new Intent(IndexActivity.this,RadioActivity.class);
                       startActivity(intent4);
                       break;
                   case R.id.btCheckBoxActivity:
                       Intent intent5 = new Intent(IndexActivity.this,CheckButtonActivity.class);
                       startActivity(intent5);
                       break;
                   case R.id.btImageViewActivity:
                       Intent intent6 = new Intent(IndexActivity.this,ImageViewActivity.class);
                       startActivity(intent6);
                       break;
                   case R.id.btSpinnerActivity:
                       Intent intent7 = new Intent(IndexActivity.this,SpinnerActivity.class);
                       startActivity(intent7);
                       break;
                   case R.id.btListViewActivity:
                       Intent intent8 = new Intent(IndexActivity.this,ListViewActivity.class);
                       startActivity(intent8);
                       break;
                   case R.id.btTimeAndCountActivity:
                       Intent intent9 = new Intent(IndexActivity.this,TimeAndCountActivity.class);
                       startActivity(intent9);
                       break;
                   case R.id.btExample1:
                       Intent intent10 = new Intent(IndexActivity.this,ImageButton1.class);
                       startActivity(intent10);
                       break;
                   case R.id.btExample2:
                       Intent intent11 = new Intent(IndexActivity.this,Example2.class);
                       startActivity(intent11);
                       break;
                   case R.id.btExample3:
                       Intent intent12 = new Intent(IndexActivity.this,Example3.class);
                       startActivity(intent12);
                       break;
                   case R.id.btExample4:
                       Intent intent13 = new Intent(IndexActivity.this,Example4.class);
                       startActivity(intent13);
                       break;
                   case R.id.btAtuoCTV:
                       Intent intent14 = new Intent(IndexActivity.this,AutoCompleteTextViewActivity.class);
                       startActivity(intent14);
                       break;
                   case R.id.btProbar:
                       Intent intent15 = new Intent(IndexActivity.this,ProgressBarActivity.class);
                       startActivity(intent15);
                       break;
                   case R.id.btSeekAndRate:
                       Intent intent16 = new Intent(IndexActivity.this,SeekBarAndRatingBarActivity.class);
                       startActivity(intent16);
                       break;
                   case R.id.btTabHost:
                       Intent intent17 = new Intent(IndexActivity.this,TableHostActivity.class);
                       startActivity(intent17);
                       break;
                   case R.id.btImgSwitcher:
                       Intent intent18 = new Intent(IndexActivity.this,ImageSwitcherActivity.class);
                       startActivity(intent18);
                       break;
                   case R.id.btGridView1:
                       Intent intent19 = new Intent(IndexActivity.this,GridViewActivity1.class);
                       startActivity(intent19);
                       break;
                   case R.id.btGallery:
                       Intent intent20 = new Intent(IndexActivity.this,GalleryActivity.class);
                       startActivity(intent20);
                       break;
                   case R.id.btExample41:
                       Intent intent21 = new Intent(IndexActivity.this,ExampleActivity41.class);
                       startActivity(intent21);
                       break;
                   case R.id.btExample42:
                       Intent intent22 = new Intent(IndexActivity.this,ExampleActivity42.class);
                       startActivity(intent22);
                       break;
                   case R.id.btToastActivity:
                       Intent intent23 = new Intent(IndexActivity.this,ToastActivity.class);
                       startActivity(intent23);
                       break;
                   case R.id.btNotification:
                       Intent intent24 = new Intent(IndexActivity.this,NotificationActivity.class);
                       startActivity(intent24);
                       break;
                   case R.id.btExample43:
                       Intent intent25 = new Intent(IndexActivity.this,ExampleActivity43.class);
                       startActivity(intent25);
                       break;
                   case R.id.btExample44:
                       Intent intent26 = new Intent(IndexActivity.this,ExampleActivity44.class);
                       startActivity(intent26);
                       break;
                   case R.id.btExample45:
                       Intent intent27 = new Intent(IndexActivity.this,ExampleActivity45.class);
                       startActivity(intent27);
                       break;
                   case R.id.btExample46:
                       Intent intent28 = new Intent(IndexActivity.this,ExampleActivity46.class);
                       startActivity(intent28);
                       break;
                   case R.id.btChaper7:
                       Intent intent29 = new Intent(IndexActivity.this,Activity5_7.class);
                       startActivity(intent29);
                       break;
                   case R.id.btTitle7_4:
                       Intent intent30 = new Intent(IndexActivity.this,ActivityChaper7_4.class);
                       startActivity(intent30);
                       break;
                   case R.id.btMenu8_6:
                       Intent intent31 = new Intent(IndexActivity.this,Activity8_6.class);
                       startActivity(intent31);
                       break;
                   case R.id.btMenu8_9:
                       Intent intent32 = new Intent(IndexActivity.this,Activity89.class);
                       startActivity(intent32);
                       break;
                   case R.id.btMenu9_1:
                       Intent intent33 = new Intent(IndexActivity.this,Activity9_1.class);
                       startActivity(intent33);
                       break;
                   case R.id.btMenu9_2:
                       Intent intent34 = new Intent(IndexActivity.this,Activity9_2.class);
                       startActivity(intent34);
                       break;
                   case R.id.btMenu9_3:
                       Intent intent35 = new Intent(IndexActivity.this,Activity9_3.class);
                       startActivity(intent35);
                       break;
                   case R.id.btMenu9_4:
                       Intent intent36 = new Intent(IndexActivity.this,Activity9_4.class);
                       startActivity(intent36);
                       break;
                   case R.id.btMenu9_5:
                       Intent intent37 = new Intent(IndexActivity.this,Activity9_5.class);
                       startActivity(intent37);
                       break;
                   case R.id.btMenu9_6:
                       Intent intent38 = new Intent(IndexActivity.this,Activity9_6.class);
                       startActivity(intent38);
                       break;
                   case R.id.btMenu9_8:
                       Intent intent39 = new Intent(IndexActivity.this,Activity9_8.class);
                       startActivity(intent39);
                       break;
               }
        }
    }
}
