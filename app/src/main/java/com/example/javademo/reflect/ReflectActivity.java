package com.example.javademo.reflect;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javademo.R;
import com.example.module.ReflectTestActivity;

/**
 * 反射
 */
public class ReflectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reflect);
    }

    /**
     * Java反射常规测试
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, ReflectMainActivity.class));
    }

    /**
     * Java反射实例化子library的类
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, ReflectTestActivity.class));
    }

}