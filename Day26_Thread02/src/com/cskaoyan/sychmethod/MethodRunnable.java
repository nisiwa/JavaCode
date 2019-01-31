package com.cskaoyan.sychmethod;
/*
    同步方法的锁对象是；this
    静态方法的锁对象： MethodRunnable.class 是字节码文件对象

 */
public class MethodRunnable implements Runnable {
    private static int tickets = 100;
    private Object obj = new Object();
    int x = 0;

    @Override
    public void run() {
        while (true) {
            // 线程一进来了，发现门没锁，就进去
            // 线程二进来了，发现门锁了，就不能进去
            // 线程二进来了，发现门锁了，就不能进去
            //synchronized (new Object()) {
            if (x % 2 == 0) {
                // 字节码文件对象，字节码文件加载到内存的时候回生成这个对象
                synchronized (MethodRunnable.class) {
                    if (tickets > 0) {
                        System.out.println(Thread.currentThread().getName() + ": 正在出售第" + tickets + "张票");
                        try {
                            Thread.sleep(80);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        tickets--;
                    }
                }
            } else {
                method();
            }
            x++;
        }
    }

    // 同步方法：一进方法就加锁，知道方法结束，才打开
    /*private synchronized void method() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + ": 正在出售第" + tickets + "张票");
            try {
                Thread.sleep(81);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets--;
        }
    }*/

    private static synchronized void method() {
        if (tickets > 0) {
            System.out.println(Thread.currentThread().getName() + ": 正在出售第" + tickets + "张票");
            try {
                Thread.sleep(81);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tickets--;
        }
    }
}

