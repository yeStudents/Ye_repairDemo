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
        tv_test=findViewById(R.id.tv_test);
    }

    public void bt_tocoloe(View view) {
        int num=15;
        tv_test.setText("修复成功="+num);
    }
}
