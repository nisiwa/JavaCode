package com.cskaoyan.controller;

import com.cskaoyan.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by little Stone
 * Date 2019/3/26 Time 10:27
 */

@Controller
public class HelloController {

	@RequestMapping("hello")
	public String hello() throws CustomException {
		if (true){
			throw new CustomException("人为的制造了一个自定义异常");
		}
		return "hello.jsp";
	}
}
