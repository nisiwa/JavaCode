package com.cskaoyan.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
    将发送数据和接受接受数据显示在同一个窗口
 */
public class ChatRoom {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(10086);
        DatagramSocket ds1 = new DatagramSocket();

        new Thread(new ReceiveRunnable(ds)).start();
        new Thread(new SendRunnable(ds1)).start();
    }
}
