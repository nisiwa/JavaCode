package com.cskaoyan.thread;
/*
    Java命令会启动JVM，即启动了一个进程
    该进程会启动一个主线程(main)，然后主线程调的main方法，所以main方法都是运行在主线程里。

    思考: JVM是单线程还是多线程
        JVM是多线程的，至少会创建一个main线程和 一个GC线程。

 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 拿到当前线程的名称
        /*String name = Thread.currentThread().getName();
        System.out.println(name);*/
        for (int i = 0; i < 10000000000L; i++) {
            new Object();
        }
    }
}
