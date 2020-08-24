package org.mbs.lecture.ioc;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 * Created by mbs on 2020/8/20 14:56
 */
@Aspect
//@Order(300) // 该值越小优先级越高
public class TaskCalculateAspect {

	@Pointcut("execution(* org.mbs.lecture.ioc.TaskCalculate.doLogic(..))")
	public void point() {

	}

	@Before("point()")
	public void before(JoinPoint joinPoint) {

	}

	@After("point()")
	public void after(JoinPoint joinPoint) {

	}

	@AfterReturning("point()")
	public void afterReturning(JoinPoint joinPoint) {

	}
}
