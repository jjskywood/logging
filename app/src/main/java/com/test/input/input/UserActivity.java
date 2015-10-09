package com.test.input.input;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 冯中杰 on 2015/9/30.
 */
public class UserActivity extends Activity {



    public void onCreate(Bundle savedInstanceState){
        //就是调用父类的onCreate构造函数，savedInstanceState是保存当前Activity的状态信息。
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcd);

        //取得启动该Activity的Intent对象
        Intent intent =getIntent();
        Bundle bundle = intent.getExtras();

        String first = bundle.getString("user");
        String second = bundle.getString("password");

        TextView show=(TextView)findViewById(R.id.textView3);
        ImageView pic=(ImageView)findViewById(R.id.imageView);

        if(first.equals("feng"))
        {

            show.setText("----欢迎进入----"+"\n"+"*"+first+"*");
        }
        else {

            show.setText("----输入错误----" + "\n" + "正确的用户名是：" + "feng" + "\n"+"密码是："+"feng");
        }

    }

    }


