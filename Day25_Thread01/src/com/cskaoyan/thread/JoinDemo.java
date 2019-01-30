package com.cskaoyan.thread;
/*
    线程加入
        public final void join()
            void join()
            void join(long millis)
        等待该线程终止。
 */
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread hz = new MyThread("Henson_z");
        MyThread lyf = new MyThread("刘亦菲");
        // Thread.sleep(1000); 主线程休眠
        lyf.start();

        lyf.join(5000); // hz这个线程加入了当前线程。当前线程就会等待hz这个线程执行完毕，再执行主线程。

        hz.start();
    }
}
