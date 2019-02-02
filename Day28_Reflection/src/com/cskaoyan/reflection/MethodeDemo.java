package com.cskaoyan.reflection;

import java.lang.reflect.Method;

/*
     String getName()
     Class<?>[] getParameterTypes()
     Class<?> getReturnType()
     Object invoke(Object obj, Object... args)
 */
public class MethodeDemo {
    public static void main(String[] args) throws Exception{
        //1. 获取字节码文件对象
        Student student = new Student("刘亦菲", 16);
        Class<Student> clazz = (Class<Student>) student.getClass();
        // 获取所有方法
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            StringBuilder sb = new StringBuilder();
            String returnType = method.getReturnType().getName();
            sb.append(returnType).append(" ");
            String name = method.getName();
            sb.append(name).append(" ");
            Class<?>[] parameterTypes = method.getParameterTypes();
            sb.append("( ");
            for (Class<?> parameterType : parameterTypes) {
                sb.append(parameterType.getName()).append(" ");
            }
            sb.append(")");
            System.out.println(sb.toString());
        }
        System.out.println("--------------------");
        // 获取指定的方法，并调用
        Method method = clazz.getDeclaredMethod("toString");
        method.setAccessible(true);
        Object object = method.invoke(student);
        System.out.println(object);

        // 获取指定的方法，并调用
        Method setName = clazz.getDeclaredMethod("setName", String.class);
        setName.setAccessible(true);
        setName.invoke(student, "Henson_z");
        System.out.println(student);
    }
}
