package com.test.input.input;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

//    String app_name = getResources().getString(R.string.app_name);
//    String b = String.format(app_name,"aaaa");

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edit1 = (EditText) findViewById(R.id.editText);
        final EditText edit2 = (EditText) findViewById(R.id.editText2);

//        Dialog alertDialog = new AlertDialog.Builder(this).
//                setTitle("对话框的标题").
//                setMessage("对话框的内容").
//                create();

            Button button = (Button) findViewById(R.id.button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String user = edit1.getText().toString();
                    String password = edit2.getText().toString();
                    //创建Intent对象，参数分别为上下文，要跳转的Activity类
                    if( "".equals(edit1.getText().toString()))
                    {
                        Toast.makeText(MainActivity.this, "用户名不能为空", Toast.LENGTH_LONG).show();//显示消息提示
                    }
                    else {
                        Intent intent = new Intent(MainActivity.this, UserActivity.class);

                        Bundle bundle = new Bundle();
                        bundle.putCharSequence("user", user);
                        bundle.putCharSequence("password", password);
                        //将要传递的值附加到Intent对象
                        intent.putExtras(bundle);
//                        new AlertDialog.Builder(this).setTitle("错误").setMessage("不能为空").setPositiveButton("返回",null).show();
                        startActivity(intent);
//                       Log.d("Debug","onCreate");
                    }
                }

            });

    }

    public void onClickshow(View view){
//        Log.d("Debug","onClickshow");
        TextView user=(TextView)findViewById(R.id.editText);
        TextView pass=(TextView)findViewById(R.id.editText2);
        user.setText("");
        pass.setText("");

    }

    public void onStart(){
        super.onStart();
        Log.d("Debug","onStart");
   }
    public void onRestart(){
      super.onRestart();
        Log.d("Debug", "onRestart");
    }
    public void onResume(){
     super.onResume();
        Log.d("Debug", "onResume");
    }
    public void onPause(){
    super.onPause();
        Log.d("Debug", "onPause");

    }
    public void onStop(){
        super.onStop();
        Log.d("Debug", "onStop");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.d("Debug", "onDestroy");
    }



}
