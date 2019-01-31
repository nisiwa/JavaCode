package com.cskaoyan.store;
/*
    生产者：如果生产的包子大于等于最大的size，就等待。生产者生产了一个包子，就通知消费者消费。
    消费者：如果包子等于0，就等待。如果消费了一个包子，就通知生产者生产。

        void wait()
          在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待。
        void notify()
          唤醒在此对象监视器上等待的单个线程。
        void notifyAll()
          唤醒在此对象监视器上等待的所有线程。
 */
public class Store {
    String name;
    int MAX_SIZE;
    int size;

    public Store(String name, int MAX_SIZE) {
        this.name = name;
        this.MAX_SIZE = MAX_SIZE;
    }

    public synchronized void produce() {
        // 生产者：如果生产的包子大于等于最大的size，就等待。生产者生产了一个包子，就通知消费者消费。
        // 如果size一直大于等于MAX_SIZE就一直等待
        while (size >= MAX_SIZE) {
            try {
                wait(); //释放所对象，进入阻塞状态，放弃执行权
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        size++;
        System.out.println(Thread.currentThread().getName() + ": 生产了一个包子，有" + size + "个包子");
        notifyAll(); // notifyAll不会释放所对象，仍然有执行权
        System.out.println("consumer notified");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void consume() {
        // 消费者：如果包子等于0，就等待。如果消费了一个包子，就通知生产者生产。
        while (size <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        size--;
        System.out.println(Thread.currentThread().getName() + ": 消费了一个包子，还剩" + size + "个包子");
        notifyAll();
        System.out.println("producer notified");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
