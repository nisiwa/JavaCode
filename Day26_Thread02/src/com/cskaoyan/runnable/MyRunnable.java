package com.cskaoyan.runnable;

// 1. 声明实现 Runnable 接口的类
public class MyRunnable implements Runnable{
    // 2. 该类然后实现 run 方法
    // private int i;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
