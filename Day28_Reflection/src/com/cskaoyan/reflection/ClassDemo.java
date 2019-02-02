package com.cskaoyan.reflection;
/*
    获取类的字节码文件对象的方式：
    方式一：
        Person p = new Person();
        Class c = p.getClass();
    方式二
        Class c3 = Person.class;
    方式三：
        Class c4 = Class.forName("com.cskaoyan.Person");
 */
public class ClassDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式一：
       /* Student student = new Student();
        Class<? extends Student> aClass = student.getClass();
        // System.out.println(aClass);
        String name = aClass.getName();
        System.out.println(name); // 类的全限定名
        System.out.println("-------------------");
        // 方式二：Class c3 = Person.class;
        Class<Student> bClass = Student.class;
        System.out.println(bClass.getName());
        System.out.println("-------------------");
        // 方式三：Class c4 = Class.forName("com.cskaoyan.Person");
        Class<?> cClass = Class.forName("com.cskaoyan.reflection.Student");
        System.out.println(cClass.getName());

        System.out.println("--------------");
        System.out.println(aClass == bClass); // true
        System.out.println(bClass == cClass); // true 一个类的字节文件对应一个字节码文件对象（一一对应）*/
    }
}
