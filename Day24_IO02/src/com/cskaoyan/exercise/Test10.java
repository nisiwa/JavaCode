package com.cskaoyan.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
    自定义类模拟LineNumberReader的特有功能获取每次读取数据的行号

     int getLineNumber() 获得当前行号。
     void setLineNumber(int lineNumber)
          设置当前行号。
 */
public class Test10 {
    public static void main(String[] args) throws IOException {
        /*LineNumberReader reader = new LineNumberReader(new FileReader("student.txt"));
        String s;
        reader.setLineNumber(-1);
        while ((s = reader.readLine()) != null) {
            System.out.println(reader.getLineNumber() + ": " + s);
        }
        reader.close();*/

        MyLineNumberReader reader = new MyLineNumberReader(new FileReader("student.txt"));
        String s;
        // reader.setLineNumber(-1);
        System.out.println(reader.getLineNumber());
        System.out.println(reader.getLineNumber());
        System.out.println(reader.getLineNumber());
        while ((s = reader.readLine()) != null) {
            System.out.println(reader.getLineNumber() + ": " + s);
        }
        reader.close();
    }
}
