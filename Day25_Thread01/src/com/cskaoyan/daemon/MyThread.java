package com.cskaoyan.daemon;

public class MyThread extends Thread{
    private Thread daemon;
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    public MyThread(String name, Thread daemon) {
        super(name);
        this.daemon = daemon;
    }

    @Override
    public void run() {
        if (daemon != null) {
            daemon.setDaemon(true);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
