package com.cskaoyan.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
    public static void main(String[] args) throws Exception {
        //1. 创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(12345);
        //2. 监听端口，获取Socket对象
        Socket socket = serverSocket.accept();
        //3. 获取输入流对象
        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        //4. 创建输出流对象
        BufferedWriter writer = new BufferedWriter(new FileWriter("d:\\Network.txt"));
        //5. 读写数据
        String s;
        while ((s = reader.readLine()) != null) {
            writer.write(s);
            writer.newLine();
            writer.flush();
        }
        //6. 释放资源
        writer.close();
        socket.close();
        serverSocket.close();
    }
}
