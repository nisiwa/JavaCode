package com.cskaoyan.store;
/*
    陈妍希牌小龙包
    生产者：一次只生产一个包子   // 一个线程
    消费者：一次只消费一个包子   // 一个线程

    生产者：如果生产的包子大于等于最大的size，就等待。生产者生产了一个包子，就通知消费者消费。
    消费者：如果包子等于0，就等待。如果消费了一个包子，就通知生产者生产。

    为什么 notify notifyAll wait方法不定义在Thread类中？
    线程之间进行通信是通过锁对象进行。（锁对象是线程通信的媒介）
    锁对象可以是任意类型的，所以这些方法定义Object类中。
 */
public class StoreDemo {
    public static void main(String[] args) {
        Store store = new Store("陈妍希牌小龙包", 100);

        Runnable pRunnable = new ProduceRunnable(store);
        Runnable cRunnable = new ConsumeRunnable(store);
        Thread thread1 = new Thread(pRunnable, "陈妍希");
        Thread thread2 = new Thread(cRunnable, "陈晓");
        thread1.start();
        thread2.start();
    }
}
