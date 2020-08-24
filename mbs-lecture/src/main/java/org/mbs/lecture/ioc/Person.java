package org.mbs.lecture.ioc;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;

/**
 * Created by mbs on 2020/8/19 16:02
 */
public class Person implements InitializingBean {

	private String name;
	private String sex;

	public void init() {
		System.out.println("init方法");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		init();
	}

	@PostConstruct
	public void post() {
		System.out.println("PostConstruct...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
