package com.cskaoyan.copy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
    �� fw.txt��������ݸ�ֵ�� copy1.txt
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        // ��װ����Դ��Ŀ�ĵ�
        FileReader reader = new FileReader("fw.txt");
        FileWriter writer = new FileWriter("copy1.txt");
        // �����ݣ�Ҳ����
        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars)) != -1) {
            writer.write(chars, 0 , len);
        }
        // ����
        reader.close();
        writer.close();
    }
}
