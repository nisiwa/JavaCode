package com.cskaoyan.reflection;

public class ToolDemo {
    public static void main(String[] args) throws Exception{
        Student student = new Student();
       /* System.out.println(student);
        student.setName("刘亦菲");
        student.setAge(16);
        System.out.println(student);*/
       Tool.setProperty(student, "name", "刘亦菲");
       Tool.setProperty(student, "age", 16);
        System.out.println(student);
    }
}
