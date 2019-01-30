package com.cskaoyan.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Date;

/*
    打印流特点
             只能操作目的地，不能操作数据。
             可以操作任意类型的数据。
             如果启动了自动刷新，能够自动刷新。
             可以操作文件的流
    基本流：可以直接操作文件的流
        FileInputStream FileOutputSteam FileReader FileWriter PrintStream
    转换流：
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("print.txt");
        printStream.print(10);
        printStream.print(100L);
        printStream.print(100.00f);
        printStream.print(12.34);
        printStream.println('a');
        printStream.println(true);
        printStream.print("hello world!");
        printStream.print(new Date());
        printStream.close();
    }
}
