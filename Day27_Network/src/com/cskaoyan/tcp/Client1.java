package com.cskaoyan.tcp;

import java.io.*;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) throws Exception{
        //1. 创建Socket对象
        Socket socket = new Socket("192.168.3.92", 8889);
        //2. 通过Socket获取流对象
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
        //3. 通过输出流传输数据
        String s = "server小姐姐你好啊";
        //素质三连
        writer.write(s);
        writer.newLine();
        writer.flush();
        // socket.shutdownOutput();
        //4. 通过socket获取输入流
        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        //5. 读取数据并解析
        String line = reader.readLine();
        System.out.println(line);
        //6. 释放资源
        socket.close();
    }
}
