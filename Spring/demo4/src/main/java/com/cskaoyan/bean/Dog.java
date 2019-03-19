package com.cskaoyan.bean;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 14:55
 */
public class Dog {
	String dogName;

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		System.out.println("dog的set");
		this.dogName = dogName;
	}

	public Dog() {
		System.out.println("init dog");
	}

	@Override
	public String toString() {
		return "Dog{" +
				"dogName='" + dogName + '\'' +
				'}';
	}
}
