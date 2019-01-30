package com.cskaoyan.set;

import java.util.TreeSet;

/*
    TreeSet:
    使用元素的自然顺序对元素进行排序，或者根据创建 set 时提供的 Comparator 进行排序，具体取决于使用的构造方法。

    Comparable接口：表示自然排序
    public interface Comparable<T>此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，
    类的 compareTo 方法被称为它的自然比较方法。

 */
public class TreeSetDemo {
    public static void main(String[] args) {
        /*TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("java");
        treeSet.add("hello");
        treeSet.add("world");

        for (String s : treeSet) {
            System.out.print(s + " ");
        }*/
        // 什么是自然排序？怎么判断一个类可以按自然排序？
        // TreeSet 底层调用的是Comparable的 compareTo() 方法，
        // 如果该方法返回0，则认为这两个对象相等。
        TreeSet<Student> treeSet = new TreeSet<>();
        Student student0 = new Student("刘亦菲", 16);
        Student student1 = new Student("王祖贤", 30);
        Student student2 = new Student("林志玲", 47);
        Student student3 = new Student("香奈儿", 60);
        Student student4 = new Student("赵灵儿", 16);
        Student student5 = new Student("刘亦菲", 18);

        treeSet.add(student0);
        treeSet.add(student3);
        treeSet.add(student2);
        treeSet.add(student1);
        treeSet.add(student4);
        treeSet.add(student5);

        for (Student student : treeSet) {
            System.out.println(student);
        }


    }
}


