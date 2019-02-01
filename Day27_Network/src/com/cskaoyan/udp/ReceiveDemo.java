package com.cskaoyan.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
    public static void main(String[] args) throws Exception{
        // 1:建立udp的socket服务.
        DatagramSocket socket = new DatagramSocket(9528);
        // 2. 创建数据报包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        // 3:通过receive方法接收数据
        socket.receive(dp);// receive方法是个阻塞方法

        // 4:通过数据包对象的功能来完成对接收到数据进行解析.
        InetAddress address = dp.getAddress();
        String hostname = address.getHostName();
        String ip = address.getHostAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        String s = new String(data, 0, length);
        System.out.println("from" + hostname + "/" + ip + ": " + s);
        // 5:可以对资源进行关闭
        socket.close();
    }
}
