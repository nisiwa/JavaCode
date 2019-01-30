package com.cskaoyan.inOut;

import java.io.*;
import java.util.Date;

/*
    System.in  -- InputStream 标准输入设备(键盘)
    System.out -- printStream 标准输出流（控制台）

    并测试如下两个代码：
        用System.in实现键盘录入数据。用BufferedReader改进。
        用System.out实现控制台输出数据。用 BufferedWriter 改进。
    从键盘录入数据的几种方式：
        1. java HelloWorld welcome to java
        2. Scanner录入数据
        3. 用流录入数据
 */
public class InOutDemo {
    public static void main(String[] args) throws IOException {
        /*InputStream inputStream = System.in;
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        // 把字节数组转换成字符串
        String s = new String(bytes, 0, len);
        System.out.println(s);*/
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);*/

        /*PrintStream printStream = System.out;
        printStream.print(100);
        printStream.println("hello");
        printStream.println();
        printStream.println(new Date());*/

        // 将标准输出流包装成BufferedWriter
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        writer.write("hello world");
        writer.newLine();
        writer.write('A');
        writer.flush();
        writer.close();
    }
}
