package com.cskaoyan.deadlock;
/*
    同步的两个弊端：
        1. 虽然没有了线程安全问题，但是效率低
        2. 如果出现嵌套锁，就容易产生死锁问题

    死锁：
        指两个以上的线程在执行过程中，因为争夺资源而产生的一种相互等待的现象

    举例：
        一个中国人和一个美国人去吃饭
        中国人吃饭    两支筷子
        美国人吃饭    刀和叉

        问题是：
            中国人  一支筷子和一把刀
            美国人  一支筷子和一把叉
 */
public class DeadLockDemo {
    public static void main(String[] args) {
        Runnable runnable = new DeadLockRunnable();
        Thread thread1 = new Thread(runnable, "henson_z");
        Thread thread2 = new Thread(runnable, "刘亦菲");
        thread1.start();
        thread2.start();
    }
}
