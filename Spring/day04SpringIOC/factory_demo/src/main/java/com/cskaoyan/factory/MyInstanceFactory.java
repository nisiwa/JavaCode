package com.cskaoyan.factory;

import com.cskaoyan.bean.MyInstance;

/**
 * Created by little Stone
 * Date 2019/3/19 Time 15:17
 */
public class MyInstanceFactory {

	public MyInstance createInstance(){
		return new MyInstance();
	}
}
