package org.mbs.web.lecture;

/**
 * http请求流程：
 * 1.请求经过tomcat的endpoint等转发处理过滤后到达了spring web中的FrameworkServlet
 * 2.org.springframework.web.servlet.FrameworkServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 *	 super.service(request, response);
 *	 	javax.servlet.http.HttpServlet#service(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 *			org.springframework.web.servlet.FrameworkServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 *	 			org.springframework.web.servlet.FrameworkServlet#processRequest(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 *	 				org.springframework.web.servlet.DispatcherServlet#doService(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 *						org.springframework.web.servlet.DispatcherServlet#doDispatch(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
 *							HandlerExecutionChain org.springframework.web.servlet.DispatcherServlet#getHandler(javax.servlet.http.HttpServletRequest)
 *							org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter#handle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
 *								org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter#handleInternal(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.web.method.HandlerMethod)
 *									org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter#invokeHandlerMethod(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.web.method.HandlerMethod)
 *										org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod#invokeAndHandle(org.springframework.web.context.request.ServletWebRequest, org.springframework.web.method.support.ModelAndViewContainer, java.lang.Object...)
 *											org.springframework.web.method.support.InvocableHandlerMethod#invokeForRequest(org.springframework.web.context.request.NativeWebRequest, org.springframework.web.method.support.ModelAndViewContainer, java.lang.Object...)
 *												org.springframework.web.method.support.InvocableHandlerMethod#doInvoke(java.lang.Object...)
 *													return getBridgedMethod().invoke(getBean(), args);
 *										org.springframework.web.method.support.HandlerMethodReturnValueHandlerComposite#handleReturnValue(java.lang.Object, org.springframework.core.MethodParameter, org.springframework.web.method.support.ModelAndViewContainer, org.springframework.web.context.request.NativeWebRequest)
 *									org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter#getModelAndView(org.springframework.web.method.support.ModelAndViewContainer, org.springframework.web.method.annotation.ModelFactory, org.springframework.web.context.request.NativeWebRequest)
 *
 * RequestBindingInterceptor
 * MappedInterceptor
 *
 * Created by mbs on 2020/9/4 11:15
 */
public class _2_请求流程 {
}
