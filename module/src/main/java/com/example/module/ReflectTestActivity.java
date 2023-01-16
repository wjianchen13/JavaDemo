package com.example.module;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

/**
 * 反射
 */
public class ReflectTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect_test);
    }

    /**
     * 通过对象取得包名和类名
     * @param v
     */
    public void onTest1(View v) {
        println("onTest1: " + Flavor.getInstance().getName());
    }

    private void println(Object str) {
        System.out.println("==============================> " + str);
    }
}