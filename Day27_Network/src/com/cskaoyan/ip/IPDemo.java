package com.cskaoyan.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    InetAddress
    此类表示互联网协议 (IP) 地址。
    没有构造方法的
        Math
        Arrays
        Collections
    单例模式：
        提供一个静态方法来获取对象

 */
public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        // static InetAddress getByName(String host) 在给定主机名的情况下确定主机的 IP 地址。
       /* InetAddress ip = InetAddress.getByName("Henson_z");
        System.out.println(ip);
        // String getHostAddress()
        String hostAddress = ip.getHostAddress();
        System.out.println(hostAddress); // 192.168.3.92
        //String getHostName() 获取此 IP 地址的主机名。
        String hostName = ip.getHostName();
        System.out.println(hostName); // Henson_z*/

        /*InetAddress ip = InetAddress.getByName("192.168.3.92");
        // System.out.println(ip);
        String hostAddress = ip.getHostAddress();
        System.out.println(hostAddress);
        String hostName = ip.getHostName();
        System.out.println(hostName); */

        /*InetAddress ip = InetAddress.getByName("PEW");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());*/

        InetAddress ip = InetAddress.getByName("192.168.3.95");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());

    }
}
