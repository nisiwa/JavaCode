package com.cskaoyan.exercise;

import com.cskaoyan.pojo.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
    键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
    分析：
        1. 从键盘录入数据
        2. 将数据封装到学生对象中
        3. 将学生放到TreeSet中
        4. 遍历TreeSet, 将学生信息写道文本文件中 student.txt
 */
public class Test7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // 总分排序
                int num1 = s2.getSum() - s1.getSum();
                int num2 = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;
                int num3 = num2 == 0 ? s2.getMath() - s1.getMath() : num2;
                int num4 = num3 == 0 ? s2.getEnglish() - s1.getEnglish() : num3;
                int num5 = num4 != 0 ? num4 : s2.getName().compareTo(s1.getName());
                return num5;
            }
        });

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入学生姓名：");
            String name = scanner.nextLine();
            System.out.println("请输入语文成绩：");
            int chinese = Integer.valueOf(scanner.nextLine());
            System.out.println("请输入数学成绩：");
            int math = Integer.valueOf(scanner.nextLine());
            System.out.println("请输入英语成绩：");
            int english = Integer.valueOf(scanner.nextLine());
            Student student = new Student(name, chinese, math, english);
            set.add(student);
        }

        // 遍历TreeSet, 将学生信息写道文本文件中 student.txt
        BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt"));
        writer.write("学生信息如下：");
        writer.newLine();
        writer.write("姓名    语文  数学  英语  总分");
        writer.newLine();
        for (Student student : set) {
            // 把学生信息拼接成一个字符串
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append('\t').append(student.getChinese()).append('\t')
                    .append(student.getMath()).append('\t').append(student.getEnglish()).append('\t')
                    .append(student.getSum());
            writer.write(sb.toString());
            writer.newLine();
            writer.flush();
        }
        // 关流
        writer.close();
    }
}
