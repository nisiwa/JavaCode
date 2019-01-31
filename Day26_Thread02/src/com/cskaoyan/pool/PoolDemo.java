package com.cskaoyan.pool;

import java.util.concurrent.*;

/*
    线程池的原理：
        线程池里每一个线程代码结束后，并不会死亡，而是再次回到线程池中成为空闲状态，等待下一次被使用。
        JDK5之后提供的
    Executors提供了如下方法产生线程池：
        public static ExecutorService newCachedThreadPool() //创建一个默认线程池
        public static ExecutorService newFixedThreadPool(int nThreads)//创建一个指定数量初始线程的线程池
        public static ExecutorService newSingleThreadExecutor()
        ExecutorService 表示一个线程池

    ExecutorService:
        <T> Future<T> submit(Callable<T> task)
          提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。
        Future<?> submit(Runnable task)
          提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
        <T> Future<T> submit(Runnable task, T result)
          提交一个 Runnable 任务用于执行，并返回一个表示该任务的 Future。
        void shutdown()
            关闭线程池

     Future接口：
        如有必要，等待计算完成，然后获取其结果。
        V get()；
 */
public class PoolDemo {
    public static void main(String[] args) {
        // 创建线程池
       /* ExecutorService pool = Executors.newCachedThreadPool();
        // 创建任务：
        Runnable task = new MyRunnable();
        // 通过线程池执行任务
        pool.submit(task);
        // 任务执行完了，但是程序还是没有退出来？
        // 执行完任务之后，线程池必须关闭，程序才会停止
        pool.shutdown();*/

       /* ExecutorService pool = Executors.newFixedThreadPool(10);
        // 创建任务
        Callable task = new MyCallable();
        // 执行任务
        pool.submit(task);
        // 关闭线程池
        pool.shutdown();*/

        ExecutorService pool = Executors.newFixedThreadPool(10);
        // 创建任务
        Callable<Integer> task = new YourCallable();
        // 执行任务
        Future<Integer> submit = pool.submit(task);
        int sum = 0;
        try {
            sum = submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("sum=" + sum);
        // 关闭线程池
        pool.shutdown();
    }
}
