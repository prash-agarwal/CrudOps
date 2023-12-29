package com.example.crudops;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("mycontrollerProd")     //custom bean name
public class PersonController {
	
	@Autowired
	CRUD obj;
	
	@Autowired
	CRUD obj1;          //Despite the fact that the scope of the CRUD bean is singleton,
//				Spring won't create multiple instances of the CRUD bean in this context.
//				Both obj and obj1 will refer to the same instance of the CRUD bean managed 
//				by the Spring container.
//	
	@Autowired
	DemoConfig demoConfig;
	private static Logger logger=LoggerFactory.getLogger(PersonController.class); 	
	
	@GetMapping("/getName")
	public String getNameDetails() {
	System.out.println("Inside getNameDetails");
	logger.trace("Inside logger.trace");  //since the level in application.properties file is debug
	//trace will not get logged of.
	logger.debug("Inside logger.debug");
	logger.info("Inside logger.info");
	logger.warn("Inside logger.warn");
	logger.error("Inside logger.errors");
	obj.crudMethod();
	System.out.println(obj);
	System.out.println(obj1);
	return "My name is Rajat";
	}

	@GetMapping("/getbeanScopeExample")
	public String exampleBeanScope() {
	
	demoConfig.getConfig();
	return "bean scope";
	}
}
