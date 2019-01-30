package com.cskaoyan.fileReader;

import java.io.FileReader;
import java.io.IOException;

/*
        FileReader(File file)
        FileReader(String fileName)
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("fw.txt");
        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars)) != -1) {
            String s = new String(chars, 0, len);
            System.out.print(s);
        }
    }
}
