package com.cskaoyan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by little Stone
 * Date 2019/3/25 Time 16:29
 */
@Controller
public class AnnotationController {
	@RequestMapping("requiredParam")
	public String requiredParam(String id,String username,@RequestParam("password!=root") String password){
		System.out.println(id);
		System.out.println(username);
		System.out.println(password);

		return "success";
	}
	@RequestMapping("requiredParam/{password}")
	public String requiredParam2(String id,String username,@PathVariable("password") String password){
		System.out.println(id);
		System.out.println(username);
		System.out.println(password);

		return "success";
	}
	@RequestMapping("article/{articleId}")
	public String pathIndex(@PathVariable("articleId") String articleId){

		System.out.println("articleid:" + articleId);
		return "success";

	}
	/*@RequestMapping("order/{method}/{index}")
	public String method(@PathVariable("method") String method,@PathVariable("index") String index){
		switch (method){
			case "delete":
				orderservice.deleteOrder(index);
				break;
		}
		return "success";
	}*/
	/*@RequestMapping("order/delete")
	@RequestMapping("order/query")
	@RequestMapping("order/add")*/

}
