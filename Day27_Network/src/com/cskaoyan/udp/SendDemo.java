package com.cskaoyan.udp;

import java.net.*;

public class SendDemo {
    public static void main(String[] args) throws Exception {
        // 1:建立udp的socket服务
        DatagramSocket socket = new DatagramSocket();
        // 2:将要发送的数据封装成数据包
        String data = "Hello udp, I'm coming~";
        byte[] bytes = data.getBytes();
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("192.168.3.92"), 9528);
        // 3:通过udp的socket服务,将数据包发送出
        socket.send(dp);
        // 4:关闭资源
        socket.close();
    }
}
