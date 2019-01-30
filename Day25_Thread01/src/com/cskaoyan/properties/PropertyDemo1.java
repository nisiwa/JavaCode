package com.cskaoyan.properties;

import java.util.Enumeration;
import java.util.Properties;

/*
    查看API发现Properties是HashTable的子类
    所以它也以键值对的形式存储数据的

    String getProperty(String key)
    Object setProperty(String key, String value) // 不仅仅可以添加，还可以更新
    Enumeration<?> propertyNames()

    注意事项：
        1. Properties没有泛型，泛型是JDK1.5引入的，默认键值对都是String类型
 */
public class PropertyDemo1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("黄晓明", "杨颖");
        properties.setProperty("henson_z", "刘亦菲");
        properties.setProperty("文章", "姚笛");
        properties.setProperty("文章", "马伊琍");

        Enumeration enumeration = properties.propertyNames();
        while (enumeration.hasMoreElements()) {
            String key = ((String) enumeration.nextElement());
            String value = properties.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }
}
