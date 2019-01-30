package com.cskaoyan.fileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
        FileWriter(File file)
        FileWriter(String fileName)
        FileWriter(File file, boolean append)
        FileWriter(String fileName, boolean append)
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String s = "Hello world, java!";
        FileWriter writer = new FileWriter("fw.txt");
        writer.write(s);
        writer.close();
    }
}
