package com.cskaoyan.thread;
/*
    static void yield()
          暂停当前正在执行的线程对象，并执行其他线程。
 */
public class YieldDemo {
    public static void main(String[] args) {
        MyThread hz = new MyThread("Henson_z");
        MyThread lyf = new MyThread("刘亦菲");
        // Thread.sleep(1000); 主线程休眠
        lyf.start();
        hz.start();
    }
}
