package com.example.javademo.thread;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javademo.R;

/**
 * 线程同步
 */
public class ThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread);
    }

    /**
     * Java线程竞争问题
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, ThreadActivity1.class));
    }

    /**
     * 同步代码快
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, ThreadActivity2.class));
    }

    /**
     * 同步方法
     * @param v
     */
    public void onTest3(View v) {
        startActivity(new Intent(this, ThreadActivity3.class));
    }

    /**
     * ReentrantLock
     * @param v
     */
    public void onTest4(View v) {
        startActivity(new Intent(this, ThreadActivity4.class));
    }

}