package org.mbs.lecture.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by mbs on 2020/8/18 15:24
 */
@Configuration
//@ComponentScan(basePackages = {"org.mbs.lecture"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class JavaConfig {

	@Bean
	public Person person() {
		Person person = new Person();
		person.setName("zhangsan");
		person.setSex("男");
		return person;
	}

	@Bean
	public Calculate calculate() {
		return new TaskCalculate();
	}

	@Bean
	public TaskCalculateAspect calculateLog() {
		return new TaskCalculateAspect();
	}
}
