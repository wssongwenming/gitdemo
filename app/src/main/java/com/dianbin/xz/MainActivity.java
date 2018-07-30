package com.dianbin.xz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   String aa="我是小杨，我修改了程序";
   String bb="我是小杨，我创建了新分支，开发了新功能";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
