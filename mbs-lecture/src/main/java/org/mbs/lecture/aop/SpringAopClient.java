package org.mbs.lecture.aop;

import org.mbs.lecture.aop.service.AopService;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by mbs on 2020/6/17 13:31
 */
public class SpringAopClient {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext-aop.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		definitionReader.loadBeanDefinitions(resource);
		AopService aopService = (AopService) defaultListableBeanFactory.getBean("myAop");
		aopService.work();
	}
}
