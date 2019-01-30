package com.cskaoyan.exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
    把ArrayList集合中的字符串数据存储到文本文件
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        // 添加数据
        list.add("hello");
        list.add("world");
        list.add("java");

        // 字符流 Writer -- 转换流 -- 便捷流 -- 高效流
        BufferedWriter writer = new BufferedWriter(new FileWriter("test1.txt"));
        // 遍历集合
        for (String s : list) {
            writer.write(s);
            writer.newLine();
            writer.flush();
        }
        // 关流
        writer.close();
    }
}
