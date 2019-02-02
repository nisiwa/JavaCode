package com.cskaoyan.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
    这是创建学生的一个工厂类
 */
public class StudentFactory {
    private StudentFactory() {

    }
    /*public static Student getStudent(String name, int age) throws Exception {

        //名字数据的检验
        if (name == null || name.length() > 10) {
            throw new IllegalArgumentException("名字异常");
        }
        //年龄数据的检验
        if (age < 6 || age > 60) {
            throw new IllegalArgumentException("年龄异常");
        }
        // return new Student(name, age);
        // 不能使用构造方法区创建一个学生对象了，那我们该怎么办呢？
        Class<Student> clazz = Student.class;
        Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        return constructor.newInstance(name, age);
    }*/

    // 注解处理器
    public static Student getStudent(String name, int age) throws Exception {
        //1. 获取字节码文件对象
        Class<Student> clazz = Student.class;
        //2. 拿到nameField
        Field nameField = clazz.getDeclaredField("name");
        nameField.setAccessible(true);
        //3. 通过Field拿到指定类型的注解
        if (nameField.isAnnotationPresent(NameConstraint.class)) {
            NameConstraint nameCst = nameField.getAnnotation(NameConstraint.class);
            int maxLength = nameCst.MaxLength();
            if (name == null || name.length() > maxLength) {
                throw new IllegalArgumentException("name参数异常");
            }
        }

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        if (ageField.isAnnotationPresent(AgeConstraint.class)) {
            AgeConstraint ageCst = ageField.getAnnotation(AgeConstraint.class);
            int minAge = ageCst.MinAge();
            int maxAge = ageCst.MaxAge();
            if (age < minAge || age > maxAge) {
                throw new IllegalArgumentException("age参数异常");
            }
        }

        Constructor<Student> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.setAccessible(true);
        return constructor.newInstance(name, age);
    }

    public static String getDesc() {
        Class<Student> clazz = Student.class;
        if (clazz.isAnnotationPresent(Desc.class)) {
            Desc desc = clazz.getAnnotation(Desc.class);
            return desc.value();
        }
        return null;
    }
}
