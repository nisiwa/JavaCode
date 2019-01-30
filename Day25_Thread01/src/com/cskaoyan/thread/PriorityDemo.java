package com.cskaoyan.thread;
/*
    java 使用的是抢占式调度模型（优先级）

    int getPriority()
          返回线程的优先级。
     void setPriority(int newPriority)
          更改线程的优先级。

    线程的默认优先级： 5
        public static final int MAX_PRIORITY 10
        public static final int MIN_PRIORITY 1
        public static final int NORM_PRIORITY 5

 */
public class PriorityDemo {
    public static void main(String[] args) {
        MyThread hz = new MyThread("Henson_z");
        MyThread lyf = new MyThread("刘亦菲");


        hz.setPriority(1); // IllegalArgumentException
        lyf.setPriority(10);

        System.out.println(hz.getName() + ": " + hz.getPriority());
        System.out.println(lyf.getName() + ": " + lyf.getPriority());
       /* myThread.start();
        myThread1.start();*/
    }
}
