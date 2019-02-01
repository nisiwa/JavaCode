package com.cskaoyan.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveRunnable implements Runnable{
    private DatagramSocket ds;

    public ReceiveRunnable(DatagramSocket ds) {
        this.ds = ds;
    }
    @Override
    public void run() {
        while (true) {
            byte[] bytes = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
            try {
                ds.receive(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }
            // 解析数据
            InetAddress address = dp.getAddress();
            byte[] data = dp.getData();
            int length = dp.getLength();
            System.out.println("from " + address.getHostAddress() + ": " + new String(data, 0, length));
        }
    }
}
