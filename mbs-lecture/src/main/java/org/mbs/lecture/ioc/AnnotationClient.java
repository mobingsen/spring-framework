package org.mbs.lecture.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanDefinition
 * IOC容器的含义
 * Created by mbs on 2020/8/18 15:23
 */
public class AnnotationClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
//		Object person = context.getBean("person");
//		System.out.println("person: " + person);
		PersonService personService = context.getBean(PersonService.class);
		personService.svi();
	}
}
