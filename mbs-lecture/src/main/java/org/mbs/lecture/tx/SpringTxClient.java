package org.mbs.lecture.tx;

import org.mbs.lecture.ioc.Student;
import org.mbs.lecture.tx.service.StudentService;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 针对数据库事务的操作：
 *
 * setAutoCommit(false);
 *
 * target.method();
 *
 * conn.commit(); or conn.rollback();
 *
 */
public class SpringTxClient {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext-tx.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		definitionReader.loadBeanDefinitions(resource);
		StudentService studentService = (StudentService) defaultListableBeanFactory.getBean("studentServiceProxy");

		Student student = new Student();
		student.setName("lisi");
		student.setAge(20);

		studentService.save(student);
	}
}
