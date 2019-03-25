package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by little Stone
 * Date 2019/3/25 Time 10:26
 */
@Controller
public class MainController {
	@RequestMapping("form")
	public String form(){
		return "form";
	}
}
