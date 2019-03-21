package com.cskaoyan.aop;

import com.cskaoyan.annotation.CountMethodTime;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by little Stone
 * Date 2019/3/21 Time 11:17
 */
@Component("myaspect")
@Aspect
public class MyAspect {
	@Pointcut("execution(* com.cskaoyan..*.*(..))")
	public void mypointcut(){
	}
	@Around("@annotation(cmt)")
	public Object around(ProceedingJoinPoint joinPoint, CountMethodTime cmt) throws Throwable {
		long time1 = System.currentTimeMillis();
		String name = joinPoint.getSignature().getName();
		Object proceed = joinPoint.proceed();
		long time2 = System.currentTimeMillis();
		System.out.println(name + "方法 总耗时：" + (time2 - time1));
		return proceed;
	}
	/*@Before("mypointcut()")
	public void beforezzz(JoinPoint joinPoint){
		Object[] args = joinPoint.getArgs();
		System.out.println("参数" + Arrays.toString(args));
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getThis().getClass().getName());
		System.out.println(joinPoint.getTarget().getClass().getName());
		System.out.println("before");
	}

	@After(value = "execution(* com.cskaoyan..*.*(..))")
	public void after(){
		System.out.println("after");
	}

	@AfterReturning(value = "mypointcut()",returning = "myreturn")
	public void myAfterReturning(Object myreturn){
		System.out.println("after returning :" + myreturn);
	}

	@AfterThrowing(value = "mypointcut()",throwing = "myThrowable")
	public void myAfterThrowing(Throwable myThrowable)
	{
		System.out.println("myAfterThrowing" + myThrowable.getMessage() );
	}*/
}
