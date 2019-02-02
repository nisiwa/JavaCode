package com.cskaoyan.annotation;

public class StudentDemo {
    public static void main(String[] args) throws Exception{
        //Student student = new Student("aaaa", 100);
        // System.out.println(student);

        Student student = StudentFactory.getStudent("千年巫妖王千年巫妖王", 18);
        System.out.println(student);

        //禁止通过构造方法区获取学生对象
        /*Student student = new Student("fsakldjfldajflajkfdk", 10);
        System.out.println(student);*/
        String desc = StudentFactory.getDesc();
        System.out.println(desc);
    }
}
