package com.wjw1.www.chapter_1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        String name = getIntent().getStringExtra("name");
        int age = getIntent().getIntExtra("age",1);
        Log.e("info", name+":"+age);
    }

    public static void actionStart(Context context,String name, int age){
        Intent intent = new Intent(context,FirstActivity.class);
        intent.putExtra("name",name);
        intent.putExtra("age",age);
        context.startActivity(intent);
    }
}
