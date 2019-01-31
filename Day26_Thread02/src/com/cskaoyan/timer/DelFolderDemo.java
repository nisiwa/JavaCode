package com.cskaoyan.timer;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
    在指定的时间，清理指定的文件夹
 */
public class DelFolderDemo {
    public static void main(String[] args) throws ParseException {
        // 创建定时器
        Timer timer = new Timer();
        // 创建定时任务
        File file = new File("E:\\demo");
        TimerTask timerTask = new DelFolderTask(file, timer);

        String s = "2019-1-31 17:43:00";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = dateFormat.parse(s);
        timer.schedule(timerTask, date);
    }
}
