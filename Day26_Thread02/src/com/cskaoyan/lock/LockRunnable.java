package com.cskaoyan.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    格式：
    synchronized（对象）{
 	    需同步代码块（我走你不能走， 你走我不能走）
    }
    1. 对象是什么？
        可不可以是任意一个对象？
    2. 需要同步的代码有哪些？

    同步代码块到底是怎么解决线程安全问题的？
        通过锁的机制就物理上的非原子操作变成了逻辑上的原子操作

    同步优缺点：
    优点： 解决了多线程的安全问题
    缺点： 消耗资源（当线程很多时，每个线程运行的时候都需要去判断同步锁，这个是很耗费系统资源的）效率低


 */
public class LockRunnable implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + ":正在出售第" + tickets + "张票");
                try {

                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tickets--;
            }
            lock.unlock();
        }

    }
}
