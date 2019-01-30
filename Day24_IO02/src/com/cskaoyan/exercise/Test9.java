package com.cskaoyan.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    用Reader模拟BufferedReader的readLine()功能
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new FileReader("s.txt"));
        String s = reader.readLine();
        System.out.println(s);
        s = reader.readLine();
        System.out.println(s);*/
        MyBufferedReader reader = new MyBufferedReader(new FileReader("s.txt"));
        String s = reader.readLine();
        System.out.println(s);
        s = reader.readLine();
        System.out.println(s);
        s = reader.readLine();
        System.out.println(s);
    }
}
