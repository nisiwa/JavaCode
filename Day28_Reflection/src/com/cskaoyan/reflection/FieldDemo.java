package com.cskaoyan.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
    Field:
         Object get(Object obj)      返回指定对象上此 Field 表示的字段的值。
         void set(Object obj, Object value)  将指定对象变量上此 Field 对象表示的字段设置为指定的新值。
         String getName()  返回此 Field 对象表示的字段的名称。
         void setAccessible(boolean flag)
 */
public class FieldDemo {
    public static void main(String[] args) throws Exception{
        //1. 获取字节码文件对象
        Class<Student> clazz = Student.class;

        // 2. 创建对象
        Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Student student = constructor.newInstance("Henson_z", 18);
        // 3. 得到类的字段
        Field[] fields = clazz.getDeclaredFields();
        /*for (Field field : fields) {
           *//* String name = field.getName();
            System.out.println(name);*//*
            System.out.println(field);
        }*/
        // 获取一个对象的属性名称以及值
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            Object object = field.get(student);
            System.out.println(name + ": " + object);
        }

        // 修改一个对象的属性值
        Field nameFiled = clazz.getDeclaredField("name");
        nameFiled.setAccessible(true);
        nameFiled.set(student, "刘亦菲");
        Field ageFiled = clazz.getDeclaredField("age");
        ageFiled.setAccessible(true);
        ageFiled.set(student, 16);

        System.out.println(student);
    }
}
