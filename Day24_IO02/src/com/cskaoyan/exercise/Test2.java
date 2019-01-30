package com.cskaoyan.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
    从文本文件中读取数据(每一行为一个字符串数据)到集合中，并遍历集合
    分析：
        因为是每一行为一个字符串，所以我们应该用BufferedReader
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
        //创建集合
        List<String> list = new ArrayList<>();
        // 读数据，一次读一行
        String s;
        while ((s = reader.readLine()) != null) {
            // 集合添加数据
            list.add(s);
        }
        //关流
        reader.close();

        // 遍历结合
        for (String s1 : list) {
            System.out.println(s1);
        }
    }
}
