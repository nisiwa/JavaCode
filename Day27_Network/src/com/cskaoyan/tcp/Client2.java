package com.cskaoyan.tcp;

import java.io.*;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) throws Exception{
        //1. 创建Socket对象
        Socket socket = new Socket("192.168.3.92", 6666);
        // 2. 输入数据：
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        //3. 通过Socket获取流对象
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        //素质三连
        writer.write(s);
        writer.newLine();
        writer.flush();
        //4. 释放资源
        socket.close();
    }
}
