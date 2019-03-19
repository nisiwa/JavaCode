package com.cskaoyan.factory;

import com.cskaoyan.bean.Animal;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 15:03
 */
public class AnimalFactory {

	public static Animal createAnimal(){
		return new Animal();
	}
}
