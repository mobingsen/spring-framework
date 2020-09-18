package org.mbs.lecture.ioc;

import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * IOC(inverse of control) 控制反转
 * DI(dependency injection) 依赖注入
 * Created by mbs on 2020/6/12 11:04
 *
 * BeanFactory是Spring Bean工厂最顶层的抽象
 * 关于Spring Bean实例的注册流程
 *
 * 1. 定义好Spring的配置文件。
 * 2. 通过Resource对象将Spring配置文件进行抽象，抽象成一个具体的Resource对象（如ClassPathResource）。
 * 3. 定义好将要使用的Bean工厂（各种BeanFactory）。
 * 4. 定义好XmlBeanDefinitionReader对象，并将工厂对象作为参数传递进去，从而构建好二者之间的关联关系。
 * 5. 通过XMLBeanDefinitionReader对象读取之前所抽取出的Resource对象。
 * 6. 流程开始进行解析。
 * 7. 针对XML文件进行各种元素以及元素属性的解析，这里面，真正的解析是通过BeanDefinitionParserDelegate对象来完成的（委托模式）。
 * 8. 通过BeanDefinitionParserDelegate对象在解析XML文件时，又使用到了模板方法设计模式（pre， process， post）。
 * 9. 当所有的Bean标签元素都解析完毕后，开始定义一个BeanDefinition对象，该对象是一个非常重要的对象，里面容纳了一个Bean相关的所有属性。
 * 10. BeanDefinition对象创建完毕后，Spring又会创建一个BeanDefinitionHolder对象来持有这个BeanDefinition对象。
 * 11. BeanDefinitionHolder对象主要包含两部分内容：beanName与BeanDefinition。
 * 12. 工厂会将解析出来的Bean信息存放到内部的一个ConcurrentHashMap中，该Map的键是beanName（唯一），值是BeanDefinition对象。
 * 13. 调用Bean解析完毕的触发动作，从而触发相应的监听器的方法的执行（使用到了观察者模式）。
 *
 * 关于Spring Bean的创建流程
 *
 * 1. Spring所管理的Bean实际上是缓存在一个ConcurrentHashMap中的（SingletonObjects对象中）。
 * 2. 该对象本质上是一个key-value对的形式，key指的是bean的名字（id）， value是一个Object对象，就是所创建的bean对象。
 * 3. 在创建Bean之前，首先需要将该Bean的创建标识指定好，表示该bean已经或是即将被创建，目的是增强缓存的效率。
 * 4. 根据bean的scope属性来确定当前这个bean是一个singleton还是一个prototype的bean，然后创建相应的对象。
 * 5. 无论是singleton还是prototype的bean，其创建的过程是一致的。
 * 6. 通过Java反射机制来创建Bean的实例，在创建之前需要检查构造方法的访问修饰符，如果不是public的，则会调用setAccessible（true）方法来
 * 	  突破Java的语法限制，使得可以通过非public构造方法来完成对象实例的创建。
 * 7. 当对象创建完毕后，开始进行对象属性的注入。
 * 8. 在对象属性注入的过程中，Spring除去使用之前通过BeanDefinition对象获取的Bean信息外，还会通过反射的方式获取到上面所创建的Bean中的真
 * 	  实属性信息（包括一个class属性，表示该Bean所对应的Class类型）。
 * 9. 完成Bean属性的注入（或抛出异常）。
 * 10. 如果Bean是一个单例的，那么将创建出来的Bean添加到singletonObjects对象中（缓存中），供程序后续再次使用。
 */
public class XmlClient {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext-ioc.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		BeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		definitionReader.loadBeanDefinitions(resource);
		Student student = (Student) defaultListableBeanFactory.getBean("student");
		System.out.println(student.getName());
		System.out.println(student.getAge());
	}
}
