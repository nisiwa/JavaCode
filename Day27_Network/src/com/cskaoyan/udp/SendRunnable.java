package com.cskaoyan.udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendRunnable implements Runnable {
    private DatagramSocket ds;

    public SendRunnable(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        // 发送数据
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String s = null;
                s = reader.readLine();
                if ("886".equals(s)) {
                    break;
                }
                byte[] bytes = s.getBytes();
                // 创建数据报包
                DatagramPacket dp = new DatagramPacket(bytes, bytes.length,
                        InetAddress.getByName("192.168.3.255"), 10086);
                // 发送数据
                ds.send(dp);
            }
        } catch (Exception e ) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            ds.close();
        }
    }
}
