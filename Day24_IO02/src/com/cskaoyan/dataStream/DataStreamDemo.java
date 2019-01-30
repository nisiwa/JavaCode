package com.cskaoyan.dataStream;

import java.io.*;

/*
    DataInputStream
    DataOutputStream
        DataOutputStream(OutputStream out)
        它可以操作java基本数据类型
 */
public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
      write();
      read();
    }

    private static void read() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("dataStream.txt"));
        // 按什么顺序写，就得按什么顺序读
        byte b = dis.readByte();
        System.out.println(b);
        System.out.println(dis.readShort());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readFloat());
        System.out.println(dis.readDouble());
        System.out.println(dis.readChar());
        System.out.println(dis.readBoolean());

        dis.close();
    }


    private static void write() throws IOException {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(
                "dataStream.txt"));
        dos.writeByte(1);
        dos.writeShort(20);
        dos.writeInt(300);
        dos.writeLong(4000);
        dos.writeFloat(12.34f);
        dos.writeDouble(12.56);
        dos.writeChar('a');
        dos.writeBoolean(true);
        dos.close();
    }

}
