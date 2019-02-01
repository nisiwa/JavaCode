package com.cskaoyan.tcp;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/*
    这是客户端
    Socket:
        此类实现客户端套接字
    构造方法：
        Socket(InetAddress address, int port)
        Socket(String host, int port)
    主要方法：
         InputStream getInputStream()
         OutputStream getOutputStream()
     注意事项：
        1. 没有启动服务器端，就启动客户端，会报：ConnectException: Connection refused: connect
            tcp是建立连接的基础的
 */
public class Client {
    public static void main(String[] args) throws Exception{
        // 1. 建立 socket
        // Socket socket = new Socket(InetAddress.getByName("Henson_z"), 12306);
        Socket socket = new Socket("192.168.3.92", 12306);

        // 2:通过Socket对象的方法,可以获取这两个流
        OutputStream outputStream = socket.getOutputStream();
        // 3. 写数据
        outputStream.write("Hello tcp, I'm coming~".getBytes());
        // 如果传输数据完毕,关闭资源
        // 因为输出流是通过socket获取的，所以关闭socket，也会关闭输出流
        socket.close();
    }
}
