package com.cskaoyan.lock;


/*
    Lock接口:
        Lock 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
            void lock()
            void unlock()
    子类：ReentrantLock
        一个可重入的互斥锁 Lock
 */
public class LockDemo {
    public static void main(String[] args) {
        Runnable runnable = new LockRunnable();
        Thread thread1 = new Thread(runnable, "窗口1");
        Thread thread2 = new Thread(runnable, "窗口2");
        Thread thread3 = new Thread(runnable, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
