package com.cskaoyan.bean;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 11:09
 */
public class Person {

	//before
	//around前
	public boolean  method(){
		//如果发生异常AfterThrowing
		//around后
		return false;
		//afterReturning
	}
	//after
}
