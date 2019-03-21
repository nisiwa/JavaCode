package com.cskaoyan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 11:17
 */
@Component("myaspect")
public class MyAspect {

	public void beforezzz(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		System.out.println("参数" + Arrays.toString(args));
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getThis().getClass().getName());
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println("before");
	}
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("around前");
		Object proceed = joinPoint.proceed();
		System.out.println("around后");
		return proceed;
	}

	public void after(){
		System.out.println("after");
	}

	public void myAfterReturning(Object myreturn){
		System.out.println("after returning :" + myreturn);
	}

	public void myAfterThrowing(Throwable myThrowable)
	{
		System.out.println("myAfterThrowing" + myThrowable.getMessage() );
	}
}
