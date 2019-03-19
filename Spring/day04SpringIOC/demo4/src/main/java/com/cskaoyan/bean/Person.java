package com.cskaoyan.bean;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 14:45
 */
public class Person {
	String personName;
	int age;

	public Person(String personName, int age) {
		System.out.println("init person");
		this.personName = personName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"personName='" + personName + '\'' +
				", age=" + age +
				'}';
	}
}
