package com.cskaoyan.thread;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        // 什么都不执行
        // super.run();
        // System.out.println("好好学习，天天向上");
        // 线程里面执行的任务一般都是比较耗时的
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
            /*try {
                Thread.sleep(100); // 当前线程进行休眠
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Thread.yield();
        }
    }
}
