package com.cskaoyan.tcp;

import jdk.nashorn.internal.runtime.ECMAException;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server4 {
    public static void main(String[] args) throws Exception {
        //1. 创建ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(12345);
        //2. 监听端口，获取Socket对象
        Socket socket = serverSocket.accept();
        //3. 获取输入流对象
        BufferedInputStream inputStream = new BufferedInputStream(socket.getInputStream());
        //4. 创建输出流对象
        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("e:\\mm.jpeg"));
        //5. 读写数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        // 6. 反馈数据
        OutputStream os = socket.getOutputStream();
        os.write("图片上传成功".getBytes());
        //6. 释放资源
        outputStream.close();
        socket.close();
        serverSocket.close();
    }
}
