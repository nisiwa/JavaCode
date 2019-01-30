package com.cskaoyan.exercise;

import java.io.*;
import java.util.Arrays;

/*
    已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”请编写程序读取数据内容，
    把数据排序后写入ss.txt中。

    分析：
        1. 创建s.txt，写入数据
        2. 把数据读入到内存中， char[]
        3. 对字符数组进行排序
        4. 把排序好的字符数组写入到ss.txt中
 */
public class Test8 {
    public static void main(String[] args) throws IOException {
        // 把数据读入到内存中， char[]
        BufferedReader reader = new BufferedReader(new FileReader("s.txt"));
        String s = reader.readLine();
        reader.close();

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        // 把排序好的字符数组写入到ss.txt中

        BufferedWriter writer = new BufferedWriter(new FileWriter("s.txt", true));
        writer.newLine();
        writer.write(chars);
        writer.close();
    }
}
