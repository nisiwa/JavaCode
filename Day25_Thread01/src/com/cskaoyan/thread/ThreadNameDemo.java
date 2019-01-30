package com.cskaoyan.thread;
/*
    我们可以根据名称去区分线程：
        String getName()
          返回该线程的名称。
        void setName(String name)
          改变线程名称，使之与参数 name 相同。

    static Thread currentThread()
          返回对当前正在执行的线程对象的引用。
 */
public class ThreadNameDemo {
    public static void main(String[] args) {
       /* MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();*/
        MyThread myThread = new MyThread("Henson_z");
        MyThread myThread1 = new MyThread("刘亦菲");

        //myThread.setName("Henson_z");
        // myThread1.setName("刘亦菲");

        myThread.start();
        myThread1.start();

       /* String name = myThread.getName();
        System.out.println(name);*/

       // 如何获取主线程的名字呢？
        Thread thread = Thread.currentThread(); // 获取当前执行线程的对象
        System.out.println(thread.getName()); // main
    }
}
