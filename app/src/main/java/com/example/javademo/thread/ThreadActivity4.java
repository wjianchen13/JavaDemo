package com.example.javademo.thread;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javademo.R;
import com.example.javademo.Utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * ReentrantLock
 */
public class ThreadActivity4 extends AppCompatActivity {

    private Factory mFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread4);
    }

    /**
     * ReentrantLock
     * @param v
     */
    public void onTest1(View v) {
        mFactory = new Factory();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    boolean cell = mFactory.sell("t1");
                    if(!cell)
                        break;
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    boolean cell = mFactory.sell("t2");
                    if(!cell)
                        break;
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    boolean cell = mFactory.sell("t3");
                    if(!cell)
                        break;
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }

    public static class Factory {

        private static int ticket;
        private final Lock lock = new ReentrantLock();

        public Factory() {
            this.ticket = 100;
        }

        public boolean sell(String tag) {
            lock.lock();
            try {
                if (ticket > 0) {
                    Utils.log("tag:" + tag + "   售出票号为: " + ticket + " 的票");
                    ticket -= 1;
                    lock.unlock();
                    return true;
                } else {
                    Utils.log("tag:" + tag + "  售罄");
                    lock.unlock();
                    return false;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            lock.unlock();
            return false;
        }
    }

    /**
     * 测试2
     * @param v
     */
    public void onTest2(View v) {

    }

}