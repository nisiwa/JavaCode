package com.cskaoyan.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    将 fw.txt里面的内容赋值到 copy1.txt
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        // 封装数据源和目的地
        FileReader reader = new FileReader("fw.txt");
        FileWriter writer = new FileWriter("copy1.txt");
        // 读数据，也数据
        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars)) != -1) {
            writer.write(chars, 0 , len);
        }
        // 关流
        reader.close();
        writer.close();
    }
}
