package com.cskaoyan.copy;

import java.io.*;

/*

    Writer -- OutputStreamWriter(转换流) -- FileWriter(便捷流) -- BufferedWriter(高效流)
    Reader -- InputStreamReader(转换流) -- FileReader(便捷流) --  BufferedReader(高效流)

 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("bw.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("copy2.txt"));
        char[] chars = new char[1024];
        int len;
        while ((len = reader.read(chars)) != -1) {
            writer.write(chars, 0, len);
            writer.flush();
        }
        reader.close();
        writer.close();
    }
}
