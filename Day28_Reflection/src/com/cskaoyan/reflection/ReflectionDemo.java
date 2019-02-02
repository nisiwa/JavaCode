package com.cskaoyan.reflection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionDemo {
    public static void main(String[] args) throws Exception{
        /*Student student = new Student();
        student.love();*/

        /*Teacher teacher = new Teacher();
        teacher.love();*/
         /*Soldier soldier = new Soldier();
         soldier.love();*/
         // 1. 读取配置文件
        Properties properties = new Properties();
        Reader reader = new BufferedReader(new FileReader("b.properties"));
        properties.load(reader);
        String className = properties.getProperty("ClassName");
        String methodName = properties.getProperty("MethodName");
        // 2. 加载类的字节码文件
        Class<?> aClass = Class.forName(className);
        // 3. 通过字节码文件对象，获取方法
        Method method = aClass.getDeclaredMethod(methodName);
        // 4. 创建对象
        Object object = aClass.newInstance();
        // 5. 调用方法
        method.setAccessible(true);
        method.invoke(object);
    }
}
