package com.cskaoyan.annotation;

/*
    给学生类一个说明：
        desc: 学生是集智慧与美貌于一体的生物
 */
@Desc(value = "学生是集智慧与美貌于一体的生物")
public class Student {

    @NameConstraint(MaxLength = 8)
    private String name;

    @AgeConstraint(MinAge = 6, MaxAge = 60)
    private int age;

    private Student() {
    }


    private Student(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
