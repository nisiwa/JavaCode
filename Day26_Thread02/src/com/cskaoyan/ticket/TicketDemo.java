package com.cskaoyan.ticket;
/*
    添加延迟后，出现了一些问题：
        1. 出现了相同的票
        2. 出现负票的情况

    出现线程安全问题的原因：
        1. 多线程的环境
        2. 多线程有共享数据
        3. 操作共享数据并非原子操作

    解决方案：
        经过分析，我们只能破坏第三个条件。



  */

public class TicketDemo {
    public static void main(String[] args) {


        Runnable runnable = new TicketRunnable();
        Thread thread1 = new Thread(runnable, "窗口1");
        Thread thread2 = new Thread(runnable, "窗口2");
        Thread thread3 = new Thread(runnable, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
