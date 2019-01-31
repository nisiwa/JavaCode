package com.cskaoyan.stop;
/*
    线程的中断：
         void stop()
          void interrupt()
          中断线程。
 */
public class StopDemo {
    public static void main(String[] args) {
        StopThread stopThread = new StopThread();
        stopThread.start();
        // 给你休息三秒钟，三秒钟不醒，就直接干掉
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 该方法会直接干掉线程，catch里面的语句和后面的语句都不会执行
        // stopThread.stop();

        // public void interrupt()
        stopThread.interrupt();
    }
}
