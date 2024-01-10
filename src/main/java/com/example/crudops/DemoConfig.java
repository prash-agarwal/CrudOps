package com.example.crudops;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

//by default the bean scope will be singleton - only one object can be created.
//prototype - we can have multiple objects of it.	
@Configuration("myconfig")
//@Scope("singleton") - by default scope is singleton
@Scope("prototype")
public class DemoConfig {

	//@Component - this is used to define our own class as a bean.
	//@Bean - used to define beans which are part of predefined java source code and don't have
	//@Component Annotation.
	
	@Bean("bean1")  //if we want to use bean declared with specific bean name like bean1 or bean2
	//here while autowiring, then we need to specify name using qualifier.
//	@Primary    //if we use @primary, then only this bean will be used while autowiring. 
	public RestTemplate getRestTemplate1(){
		System.out.println("Inside RestTemplate");
		return new RestTemplate();
	}
	//we can create this bean of restemplate using @Bean in any class.
	
	//spring will create 2 different beans of RestTemplate using above and below methods
	//as they are returning the same RestTemplate bean that would get stored in IOC container
	//and this would give ambiguity when we are trying to create bean of RestTemplate using Autowired
	//in DemoConfig class. 
	
	@Bean("bean2")
	public RestTemplate getRestTemplate2(){
		System.out.println("Inside RestTemplate");
		return new RestTemplate();
	}
	
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
	
	public String getDetails() {
//		ApplicationContext.getBean();
     return "My name is Ram";
	}
}
