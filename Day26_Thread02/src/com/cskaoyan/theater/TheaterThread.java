package com.cskaoyan.theater;


public class TheaterThread extends Thread {
     private static int tickets = 300;
    public TheaterThread() {
    }

    public TheaterThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(getName() + ": 正在出售第" + tickets + "张票");
                tickets--;
            }
        }
    }
}
