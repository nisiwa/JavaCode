package com.cskaoyan.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
    抽奖小游戏
    分析：
        1. 创建一个文件（将名字按行写入）
        2. 将文件内容读入List中
        3. 生成随机数 [0，list.size())
        4. 根据随机数拿到List的值
 */
public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("test3.txt"));
        List<String> names = new ArrayList<>();
        String s;
        while ((s = reader.readLine()) != null) {
            // 集合添加数据
            names.add(s);
        }
        //关流
        reader.close();
        // 生成随机数
        int size = names.size();
        int index = (int) (Math.random() * size);
        // 根据随机数拿到List的值
        System.out.println("恭喜" + names.get(index) + "获得2018年最帅人物奖");
    }
}
