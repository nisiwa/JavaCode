package com.cskaoyan.stop;

import java.util.Date;

public class StopThread extends Thread{
    // private int i;

    @Override
    public void run() {
        System.out.println(new Date());
        // 亲,我想休息十秒钟,请不要打扰我
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
        System.out.println("线程被中断");
    }
        System.out.println(new Date());
    }
}
