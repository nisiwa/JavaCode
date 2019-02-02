package com.cskaoyan.reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
    在ArrayList<Integer>中存储字符串
    泛型擦除：
        其实泛型编译成字节码文件的时候，就已经被擦除了
        泛型只是给编译看的
        反射是在运行时，动态的加载类，以及修改属性和调用，使用反射可以绕过编译器的泛型检查
    ArrayList.add(E e)  --> ArrayList.add(Object obj)
 */
public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        /*ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("hello");
        for (Object object : list) {
            System.out.println(object);
        }*/

        /*ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);*/
        //list.add("hello"); 这样就不能添加字符串了

        // 使用反射可以绕过编译器的泛型检查
        //1. 获取字节码文件对象
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Class<? extends ArrayList> aClass = list.getClass();
        //2. 获取add方法
        Method addMethod = aClass.getDeclaredMethod("add", Object.class);
        //3. 进行暴力访问
        addMethod.setAccessible(true);
        //4. 调用方法
        addMethod.invoke(list, "hello");
        //5.遍历输出
        for (Object object : list) {
            System.out.println(object);
        }
    }
}
