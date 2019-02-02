package com.cskaoyan.reflection;

public class Student {
    private String name;
    private int age;

    public Student() {
        // System.out.println("无参");
    }

    Student(String name) {
        // System.out.println("string");
        this.name = name;
    }

    protected Student(int age) {
        // System.out.println("int");
        this.age = age;
    }
    public Student(String name, int age) {
        // System.out.println("string, int");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Deprecated
    public void setAge(int age) {
        this.age = age;
    }

    public void love() {
        System.out.println("爱生活，爱学习！");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
