package com.cskaoyan.timer;

import java.util.Timer;
import java.util.TimerTask;

public class BoomTask extends TimerTask {
    Timer timer;

    public BoomTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("boom!");
        // timer.cancel();
    }
}
