package com.cskaoyan.timer;

import java.util.Timer;
import java.util.TimerTask;

/*
    Timer:
    一种工具，线程用其安排以后在后台线程中执行的任务。可安排任务执行一次，或者定期重复执行。
    schedule(TimerTask task, Date time)
        安排在指定的时间执行指定的任务。
    schedule(TimerTask task, Date firstTime, long period)
        安排指定的任务在指定的时间开始进行重复的固定延迟执行。
    void schedule(TimerTask task, long delay)
        安排在指定延迟后执行指定的任务。
    void schedule(TimerTask task, long delay, long period)
        安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。

   TimerTask:
        由 Timer 安排为一次执行或重复执行的任务。
        abstract  void run()
          此计时器任务要执行的操作。
        boolean cancel()
          取消此计时器任务。

 */
public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new BoomTask(timer);
        // 3秒后，执行爆炸
        //timer.schedule(timerTask, 3000);
        // 但是发现，任务执行完毕，程序没有结束（线程池）
        // timer.cancel(); // 任务没执行完，就程序就结束了
        // 任务执行多次
        timer.schedule(timerTask, 3000, 3000);
    }
}
