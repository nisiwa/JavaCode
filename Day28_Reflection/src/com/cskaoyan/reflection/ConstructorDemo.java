package com.cskaoyan.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    Class<>
        Class 类的实例表示正在运行的 Java 应用程序中的类和接口
    获取构造方法：
        Constructor<T> getConstructor(Class<?>... parameterTypes)
          返回一个 Constructor 对象，它反映此 Class 对象所表示的类的指定公共构造方法。
        Constructor<?>[] getConstructors()
        Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)
          返回一个 Constructor 对象，该对象反映此 Class 对象所表示的类或接口的指定构造方法。
        Constructor<?>[] getDeclaredConstructors()
          返回 Constructor 对象的一个数组，这些对象反映此 Class 对象表示的类声明的所有构造方法。

    static Class<?> forName(String className)
        加载类
    Constructor:
         T newInstance(Object... initargs)


 */
public class ConstructorDemo {
    public static void main(String[] args) throws Exception {
        //1. 获取Student类的字节码文件对象
        Class aClass = Class.forName("com.cskaoyan.reflection.Student");
        // 2. 通过Class对象获取构造器
        Constructor<?>[] constructors = aClass.getConstructors(); //获取公共的构造方法
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
            //Object object = constructor.newInstance();
        }
        System.out.println("--------------");

        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors(); //获取所有的构造方法
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("---------------");
        //获取无参的构造方法
        // NoSuchMethodException
       /* Constructor<?> constructor = aClass.getConstructor();
        System.out.println(constructor);*/
       /* Constructor<?> constructor = aClass.getDeclaredConstructor();
        System.out.println(constructor);
        // 创建对象
        // IllegalAccessException 没有访问权限
        constructor.setAccessible(true); // void setAccessible(boolean flag)  设置访问权限
        Student s = (Student)constructor.newInstance();
        System.out.println(s);*/

       // 获取Student(String name)
       /* Constructor constructor = aClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor);
        constructor.setAccessible(true);
        Student s = ((Student) constructor.newInstance("刘亦菲", 16));
        System.out.println(s);*/

       // 用Class类的newInstance方法创建对象
        Student student = (Student)aClass.newInstance();
        System.out.println(student);
    }
}
