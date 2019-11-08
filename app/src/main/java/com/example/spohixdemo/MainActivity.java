package com.example.spohixdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_test = findViewById(R.id.tv_test);
    }

    /**
     * 提示：分别build的apk，提取出来放到不同文件夹方便测试使用
     */
    public void bt_tocoloe(View view) {
        int num = 15;

        //1.0利用下面的方法 ，制造一个bug后，build一个有问题的apk
        tv_test.setText(num);

        //2.0利用下面的方法 ，修复bug后，build 一个没问题的
        //tv_test.setText("修复成功="+num);

    }
}
