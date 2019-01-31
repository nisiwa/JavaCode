package com.cskaoyan.timer;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

public class DelFolderTask extends TimerTask {
    File dir;
    Timer timer;

    public DelFolderTask(File dir, Timer timer) {
        this.dir = dir;
        this.timer = timer;
    }

    @Override
    public void run() {
        delete(dir);
        timer.cancel();
    }

    public void delete(File dir) {
        if (dir == null) {
            return;
        }
        if (dir.isFile()) {
            dir.delete();
            return;
        }else {
            File[] files = dir.listFiles();
            for (File file : files) {
                delete(file);
            }
            dir.delete();
        }
    }

}
