package com.cskaoyan.copy;

import java.io.*;

public class CopyDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("newLine.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("copy3.txt"));
        String s;
        while ((s = reader.readLine()) != null) {
            writer.write(s); // s不包含换行符
            writer.newLine();
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
