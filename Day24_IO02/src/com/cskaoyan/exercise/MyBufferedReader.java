package com.cskaoyan.exercise;

import java.io.IOException;
import java.io.Reader;

public class MyBufferedReader {
    private Reader reader;

    public MyBufferedReader(Reader reader) {
        this.reader = reader;
    }

    public String readLine() throws IOException {
        int ch;
        // 如何读到换行符
        StringBuilder sb = new StringBuilder();
        while ((ch = reader.read()) != -1) {
            // 拼接字符串
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                return sb.toString();
            }
            sb.append((char) ch);
        }
        // 为了防止数据丢失(最后一行没有换行符)
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public void close() throws IOException {
        reader.close();
    }
}
