package com.cskaoyan.theater;

public class TheatherDemo {
    public static void main(String[] args) {
        /*TheaterThread thread1 = new TheaterThread("窗口1");
        TheaterThread thread2 = new TheaterThread("窗口2");
        TheaterThread thread3 = new TheaterThread("窗口3");
        // 开始卖票
        thread1.start();
        thread2.start();
        thread3.start();*/

        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable, "窗口1");
        Thread thread2 = new Thread(runnable, "窗口2");
        Thread thread3 = new Thread(runnable, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
