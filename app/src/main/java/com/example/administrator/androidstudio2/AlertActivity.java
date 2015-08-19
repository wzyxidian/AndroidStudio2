package com.example.administrator.androidstudio2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;


public class AlertActivity extends ActionBarActivity {
    private Button bt1,bt2,bt3,bt4;
    final String[] items = new String[]{"跑步","羽毛球","乒乓球","网球","体操"};
    final String[] modes = new String[]{"标准","无声","会议","户外","离线"};
    final String[] games = new String[]{"植物大战僵尸","愤怒的小鸟","泡泡龙","开心农场","超级玛丽"};
    private boolean[] chechedItems = new boolean[]{false,true,false,true,false};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alert = new AlertDialog.Builder(AlertActivity.this).create();
                alert.setIcon(R.drawable.img01);
                alert.setTitle("系统提示：");
                alert.setMessage("带取消、确定、中立的对话框");
                alert.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertActivity.this, "您点击了取消按钮", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertActivity.this,"您点击了确定按钮",Toast.LENGTH_SHORT).show();
                    }
                }) ;
                alert.setButton(DialogInterface.BUTTON_NEUTRAL, "中立", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertActivity.this,"您点击了中立按钮",Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });

         bt2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                AlertDialog.Builder builder =  new AlertDialog.Builder(AlertActivity.this);
                 builder.setIcon(R.drawable.img01);
                 builder.setTitle("请选择你喜欢的项目");
                 builder.setItems(items, new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         Toast.makeText(AlertActivity.this, "您选择了：" + items[which], Toast.LENGTH_SHORT).show();
                     }
                 });
                 builder.create().show();
             }
         });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setIcon(R.drawable.img02);
                builder.setTitle("请选择要使用的情景模式：");
                builder.setSingleChoiceItems(modes, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(AlertActivity.this, "您选择了：" + modes[which], Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setPositiveButton("确定", null);
                builder.create().show();
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AlertDialog.Builder builder = new AlertDialog.Builder(AlertActivity.this);
                builder.setIcon(R.drawable.img03);
                builder.setTitle("请选择喜欢的游戏");
                builder.setMultiChoiceItems(games, chechedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        chechedItems[which] = isChecked;
                    }
                });
                builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String result= "";
                        for(int i=0;i<chechedItems.length;i++){
                            if(chechedItems[i]){
                                result+=games[i]+"、";
                            }
                        }
                        if(!"".equals(result)){
                            result = result.substring(0,result.length() - 1);
                            Toast.makeText(AlertActivity.this,"您选择了"+result,Toast.LENGTH_SHORT).show();
                        }
                    }
                });
                builder.create().show();
            }

        });
    }


}
