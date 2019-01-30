package com.cskaoyan.daemon;
/*
     void setDaemon(boolean on)
          将该线程标记为守护线程。
     注意事项：
        当有其他线程(非守护线程)在执行的话，主线程不会退出。
 */
public class DaemonDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread hz = new MyThread("Henson_z");
        MyThread lyf = new MyThread("刘亦菲", hz);
        /*hz.setDaemon(true);
        lyf.setDaemon(true);// 守护当前线程*/

        // System.out.println(hz.isDaemon());
        lyf.start();
        Thread.sleep(5000);
        hz.start();
        System.out.println("End of main");
    }
}
