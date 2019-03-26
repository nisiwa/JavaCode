package com.cskaoyan.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by little Stone
 * Date 2019/3/26 Time 10:56
 */
@Component
public class CustomExceptionHandler implements HandlerExceptionResolver {
	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
		e.printStackTrace();
		CustomException customException = null;
		System.out.println(o);
		if (e instanceof CustomException){
			customException = (CustomException) e;
		}else {
			customException = new CustomException("你不需要知道的异常");
		}
		String message = customException.getMessage();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message",message);
		modelAndView.setViewName("/error.jsp");

		return modelAndView;
	}
}
