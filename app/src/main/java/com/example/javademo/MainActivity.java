package com.example.javademo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javademo.reflect.ReflectActivity;
import com.example.javademo.reflect.ReflectMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 反射
     * @param v
     */
    public void onReflect(View v) {
        startActivity(new Intent(this, ReflectActivity.class));
    }
}