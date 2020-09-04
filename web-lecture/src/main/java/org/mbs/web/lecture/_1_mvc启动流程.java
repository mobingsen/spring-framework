package org.mbs.web.lecture;

/**
 * mvc启动流程：
 * 1.org.apache.catalina.core.StandardWrapper#initServlet(javax.servlet.Servlet)方法中调用servlet.init(facade);
 * 2.org.springframework.web.servlet.HttpServletBean#init()方法中initServletBean();
 * 3.org.springframework.web.servlet.FrameworkServlet#initServletBean()，在这个方法中最关键的两步：
 * 		3.1this.webApplicationContext = initWebApplicationContext();
 * 			3.1.1查找并加载WebApplicationContext rootContext = ...，如果没有找到就createWebApplicationContext(rootContext);
 * 				根据context class 设置的值：class org.springframework.web.context.support.XmlWebApplicationContext调用
 * 				wac = BeanUtils.instantiateClass(contextClass)进行实例化该class，然后设置环境，父应用上下文ApplicationContext parent
 * 				但此时parent为null。接着setConfigLocation(classpath:mvc-servlet.xml)。然后，configureAndRefreshWebApplicationContext(wac)
 *				,然后刷新这就回到了spring的bean factory的初始化流程了。
 * 		3.2initFrameworkServlet();
 *	4.最后回到了tomcat的启动流程中。
 * Created by mbs on 2020/9/4 10:25
 */
public class _1_mvc启动流程 {
}
