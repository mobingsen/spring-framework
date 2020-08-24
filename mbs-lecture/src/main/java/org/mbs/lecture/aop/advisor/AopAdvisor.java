package org.mbs.lecture.aop.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by mbs on 2020/6/17 13:32
 */
public class AopAdvisor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before advisor invoke.");
		Object proceed = invocation.proceed();
		System.out.println("after advisor invoke.");
		return proceed;
	}
}
