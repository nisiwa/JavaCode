package com.cskaoyan.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo1 {
        public static void main(String[] args) throws Exception{
            DatagramSocket ds = new DatagramSocket(10086);
            while (true) {
                byte[] bytes = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
                ds.receive(dp);
                // 解析数据
                InetAddress address = dp.getAddress();
                byte[] data = dp.getData();
                int length = dp.getLength();
                System.out.println("from " + address.getHostAddress() + ": " + new String(data, 0, length));
            }
            // 模拟服务器一直开着
            // ds.close();
        }
}
