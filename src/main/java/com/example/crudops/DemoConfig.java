package com.example.crudops;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//by default the bean scope will be singleton - only one object can be created.
//prototype - we can have multiple objects of it.	
@Configuration("myconfig")
//@Scope("singleton") - by default scope is singleton
@Scope("prototype")
public class DemoConfig {

	
	public DemoConfig() {
		System.out.println("in demo config constructor");
	}
	
	public static String getConfig() {
		return "config:: "+"This is default config please refactor later";
	}
//	beans with prototype scope are indeed stored in the IoC (Inversion of Control) 
//	container in Spring
	//Beans with prototype scope are created whenever they're requested by the application	
	//how ui mapping works when we hit api??
	//Purpose of dispatcherServlet - to route incoming request to particular controller.
	//@RestController makes the controller visible to dispatcherServlet. 
	//URI to method mapping is done by 
	//RequestMappingHandlerMapper
}
