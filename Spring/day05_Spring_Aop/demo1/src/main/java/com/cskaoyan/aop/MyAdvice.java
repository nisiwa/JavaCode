package com.cskaoyan.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by little Stone
 * Date 2019/3/20 Time 10:58
 */
@Component("myadvice")
public class MyAdvice implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("before invoke");
		String methodName = methodInvocation.getMethod().getName();
		Object[] arguments = methodInvocation.getArguments();
		System.out.println("method name = " + methodName);
		System.out.println("arguments = " + Arrays.toString(arguments));
		Object proceed = methodInvocation.proceed();
		System.out.println("after invoke");
		return proceed;
	}
}
