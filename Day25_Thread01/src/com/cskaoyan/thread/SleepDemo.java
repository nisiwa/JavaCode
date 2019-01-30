package com.cskaoyan.thread;
/*
    static void sleep(long millis)
          在指定的毫秒数内让当前正在执行的线程休眠
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread hz = new MyThread("Henson_z");
        MyThread lyf = new MyThread("刘亦菲");
        // Thread.sleep(1000); 主线程休眠
        hz.start();
        lyf.start();
    }
}
