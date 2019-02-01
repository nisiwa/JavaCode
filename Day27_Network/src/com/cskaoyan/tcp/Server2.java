package com.cskaoyan.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) throws Exception{
        //1. 创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(6666);
        //2. 监听端口，获取socket对象
        Socket socket = serverSocket.accept();
        //3. 获取输入流，并解析数据
        InputStream inputStream = socket.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String s = reader.readLine();
        InetAddress address = socket.getInetAddress();
        System.out.println("from " + address.getHostAddress() + ": " + s);
        //4. 释放资源
        socket.close();
        serverSocket.close();
    }
}
