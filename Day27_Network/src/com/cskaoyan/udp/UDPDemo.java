package com.cskaoyan.udp;
/*
    DatagramSocket:
        此类表示用来发送和接收数据报包的套接字。
    构造方法：
        DatagramSocket()：随机给你一个可用的端口
        DatagramSocket(int port) 创建数据报套接字并将其绑定到本地主机上的指定端口。
        DatagramSocket(int port, InetAddress laddr) 创建数据报套接字，将其绑定到指定的本地地址。
    主要的成员方法：
        void send(DatagramPacket p)
        从此套接字发送数据报包。DatagramPacket 包含的信息指示：将要发送的数据、其长度、远程主机的 IP 地址和远程主机的端口号。
        void receive(DatagramPacket p)
          从此套接字接收数据报包。
        void close()
           关闭Socket

    DatagramPacket:
        此类表示数据报包
        构造方法：
        DatagramPacket(byte[] buf, int length)
          构造 DatagramPacket，用来接收长度为 length 的数据包。
        DatagramPacket(byte[] buf, int length, InetAddress address, int port)
          构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
        成员方法：
            byte[] getData()
            返回数据缓冲区。
            int getLength()
          返回将要发送或接收到的数据的长度。

 */
public class UDPDemo {
}
