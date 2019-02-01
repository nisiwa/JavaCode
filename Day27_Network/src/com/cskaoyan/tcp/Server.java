package com.cskaoyan.tcp;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
    这是我的服务器端
    ServerSocket:
        此类实现服务器套接字
    构造方法：
        ServerSocket(int port)
          创建绑定到特定端口的服务器套接字。
    主要方法：
         Socket accept()
         侦听并接受到此套接字的连接。
 */
public class Server {
    public static void main(String[] args) throws Exception{
        // 1. 创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(12306);
        // 2. 通过accept方法获取客户端对象
        Socket socket = serverSocket.accept(); // 阻塞方法
        // 3. 通过socket获取输入流
        InputStream inputStream = socket.getInputStream();
        // 4. 获取数据并解析
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String s = new String(bytes, 0, len);
        InetAddress address = socket.getInetAddress();
        System.out.println("from " + address.getHostAddress() + ": " + s);
        // 5. 释放资源
        socket.close();
        serverSocket.close();

    }
}
