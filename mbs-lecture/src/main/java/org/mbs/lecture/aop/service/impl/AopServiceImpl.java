package org.mbs.lecture.aop.service.impl;

import org.mbs.lecture.aop.service.AopService;

/**
 * Created by mbs on 2020/6/17 13:31
 */
public class AopServiceImpl implements AopService {

	@Override
	public void work() {
		System.out.println("aop service work.");
	}
}
