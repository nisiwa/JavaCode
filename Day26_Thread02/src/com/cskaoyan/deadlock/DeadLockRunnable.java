package com.cskaoyan.deadlock;

public class DeadLockRunnable implements Runnable{
    private boolean flag;

    @Override
    public void run() {
        if (flag) {
            flag = false;

            synchronized (MyLock.ObjA) {
                System.out.println(Thread.currentThread().getName() + ": if ObjA");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (MyLock.ObjB) {
                    System.out.println("if ObjB");
                }
            }
        } else {
            flag = true;
            synchronized (MyLock.ObjB) {
                System.out.println(Thread.currentThread().getName() + ": else ObjB");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (MyLock.ObjA) {
                    System.out.println("else ObjA");
                }
            }
        }
    }
}
