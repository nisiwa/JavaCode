package com.cskaoyan.theater;

public class MyRunnable implements Runnable{
    private int tickets = 300;
    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + ": 正在出售第" + tickets + "张票");
                tickets--;
            }

        }
    }
}
