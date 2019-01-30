package com.cskaoyan.thread;
/*
    实现多线程的方式：
    方式一：
        是将类声明为 Thread 的子类。
        该子类应重写 Thread 类的 run 方法。
        创建子类对象
        启动线程
    几个小问题：
        为什么要重写run()方法
            run()方法里面封装的是要被线程执行的代码
        启动线程使用的是那个方法
            start()
        线程能不能多次启动
            不能，如果多次启动，会报IllegalThreadStateException
        run()和start()方法的区别
            run()的调用相当于普通的方法调用
            start()： JVM会启动一个线程，并执行run()方法里面的代码
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        // 启动线程
        // 调用run()方法相当于方法的直接调用，并不会开启一个新线程
        //myThread.run();
        // myThread.run();
        // JVM调用start()方法，创建一个新线程，并执行run()的代码

        myThread.start();
        myThread1.start();
        // myThread.start(); // IllegalThreadStateException 这相当与myThread线程启动两次



    }
}
