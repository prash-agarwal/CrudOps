package com.example.crudops;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


//when there is any annotation on top of class, it consist of @Component annotation inside it.
//Beans get created for the class having @Component annotation and gets stored in IOC
//container or application context.
//When a class uses @Autowired annotation to use that bean, that dependency/bean gets 
//injected in the class.

@Service            //@Scope("prototype") -using this below @Service enables us to create multiple beans
public class CRUD {
	
	public void crudMethod() {
		System.out.println("Crud method running successfullys");
	}
	// hashcode creating bean using objects in 2 different controller classes using new keyword	
//com.example.crudops.CRUD@34d90ec2
//com.example.crudops.CRUD@79e8da15
	
	// hashcode creating bean using autowired in 2 different controller classes
	//com.example.crudops.CRUD@296c9509
	//com.example.crudops.CRUD@296c9509
	
// hashcode creating beans using different object name CRUD1 and CRUD2 autowired in controller class.
//	com.example.crudops.CRUD@17d1811d
//	com.example.crudops.CRUD@17d1811d
}
