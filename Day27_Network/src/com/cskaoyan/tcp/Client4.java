package com.cskaoyan.tcp;

import java.io.*;
import java.net.Socket;

/*
    上传图片案例,并给出反馈信息
 */
public class Client4 {
    public static void main(String[] args) throws Exception {
        //1. 创建Socket对象
        Socket socket = new Socket("192.168.3.92", 12345);
        // 2. 读入数据
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("d:\\mm.jpeg"));
        //3.获取输出流对象
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream outputStream = new BufferedOutputStream(os);
        //4. 读写数据
        byte[] bytes = new byte[1024];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
            outputStream.flush();
        }
        // 告诉服务器，我上传数据完毕
        socket.shutdownOutput();
        // 5. 得到反馈信息
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];

        int length = is.read(bys); // 阻塞方法
        String s = new String(bys, 0, length);
        System.out.println(s);
        //5. 释放资源
        inputStream.close();
        socket.close();
    }
}
