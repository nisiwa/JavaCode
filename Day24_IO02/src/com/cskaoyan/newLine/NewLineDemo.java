package com.cskaoyan.newLine;

import java.io.*;


/*
    public void newLine()
    写入一个行分隔符。行分隔符字符串由系统属性 line.separator 定义，并且不一定是单个新行 ('\n') 符。
    public String readLine()
    读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
    包含该行内容的字符串，不包含任何行终止符如果已到达流末尾，则返回 null
 */
public class NewLineDemo {
    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    private static void read() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("newLine.txt"));
        String s;
        while ((s = reader.readLine()) != null) {
            System.out.println(s);
            // System.out.println();
        }
        reader.close();
    }

    private static void write() throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("newLine.txt"));
        for (int i = 0; i < 10; i++) {
            writer.write("helloworld" + i);
            //writer.write("\r\n");
            writer.newLine();
        }
        writer.close();
    }
}
