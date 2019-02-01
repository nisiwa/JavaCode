package com.cskaoyan.tcp;

import java.io.*;
import java.net.Socket;

/*
    客户端文本文件，服务器输出文本文件(Network.txt) --> d:\\Network.txt
 */
public class Client3 {
    public static void main(String[] args) throws Exception{
        //1. 创建Socket对象
        Socket socket = new Socket("192.168.3.92", 12345);
        // 2. 读入数据
        BufferedReader reader = new BufferedReader(new FileReader("Network.txt"));
        //3.获取输出流对象
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        //4. 读写数据
        String s;
        while ((s = reader.readLine()) != null) {
            writer.write(s);
            writer.newLine();
            writer.flush();
        }
        //5. 释放资源
        reader.close();
        socket.close();
    }
}
