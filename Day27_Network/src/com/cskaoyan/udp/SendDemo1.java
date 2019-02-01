package com.cskaoyan.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    从键盘录入数据进行发送，如果输入的是886那么客户端就结束输入数据。
 */
public class SendDemo1 {
    public static void main(String[] args) throws Exception{
        // 创建Socket对下给你
        DatagramSocket ds = new DatagramSocket();
        // 从键盘录入数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if ("886".equals(s)) {
                break;
            }
            byte[] bytes = s.getBytes();
            // 创建数据报包
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getByName("Henson_z"), 10086);
            // 发送数据
            ds.send(dp);
        }
        // 释放资源
        reader.close();
        ds.close();
    }
}
