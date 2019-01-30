package com.cskaoyan.properties;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

/*
    Properties和IO流的结合使用
        public void load(Reader reader)
            按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
        public void store(Writer writer,String comments)
            以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
 */
public class PropertyDemo2 {
    public static void main(String[] args) throws IOException {
        /*Properties properties = new Properties();
        properties.setProperty("黄晓明", "杨颖");
        properties.setProperty("henson_z", "刘亦菲");
        properties.setProperty("文章", "姚笛");
        properties.setProperty("文章", "马伊琍");*/

        // 将Properties中的内容持久化到文件中
        /*Writer writer = new FileWriter("a.properties");
        properties.store(writer, "first properties");*/

        // 将文件中的键值对读入到Properties的对象中
        Properties properties = new Properties();
        Reader reader = new FileReader("a.properties");
        properties.load(reader);

        // 遍历properties
        Enumeration<?> enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String key = (String) enumeration.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }

}
