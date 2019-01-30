package com.cskaoyan.exercise;


import java.io.IOException;
import java.io.Reader;

public class MyLineNumberReader extends MyBufferedReader{
    private Reader reader;
    private int LineNumber;

    public MyLineNumberReader(Reader reader) {
        super(reader);
    }

    public int getLineNumber() {
        // LineNumber++;
        return LineNumber;
    }

    public void setLineNumber(int lineNumber) {
        LineNumber = lineNumber;
    }

    public String readLine() throws IOException {
        LineNumber++;
        return super.readLine();
    }
}
