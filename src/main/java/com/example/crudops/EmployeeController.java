package com.example.crudops;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {


//	@Bean
//	public RestTemplate getRestTemplate2(){
//		System.out.println("Inside RestTemplate");
//		return new RestTemplate();
//	}
	//for classes which are having @Component at the top of the class directly or indirectly 
	//bean would get created.
	
	// CRUD operations
	//API 1 - creation of employee  //HTTP METHOD - POST
	// add a new Employee
	//input : Employee Details
	//output : void or you want to return the emp object that you saved
	
	//we cannot have same name API in 2 different classes.
	
	@Autowired
	CRUD obj;
	Employee e=new Employee();
	
	private static int count =1;
	private HashMap<Integer,Employee> empMap=new HashMap<>(); 
	
	@PostMapping(value="/createEmployee")
	public void createEmployee(@Valid@RequestBody Employee employee) {
		
//		employee.setId(count);
//		count++;
		System.out.println(this);
		empMap.put(employee.getId(),employee);
		obj.crudMethod();
		System.out.println(obj);
	}
	
	@GetMapping(value="/getEmployee")
	public Employee getEmployee() {
		
//		employee.setId(count);
//		count++;
		e.setName("prash");
		e.setId(45);
		e.setAddress("Delhi");
		e.setEmail("prash@hotmail.com");
		obj.crudMethod();
		System.out.println(obj);
		return e;
	}
	
	@GetMapping("employee/get/all")
	public List<Employee> getAllEmployee() {
		
//		When createEmployee/getAllEmployee is invoked on the obj instance,
//		it will print something like MyClass@3fee733d 
//		(the actual hexadecimal representation can vary) to the console.
//		This output indicates the class name (MyClass) followed by an @ symbol
//		and the hash code of the object in hexadecimal format.
		System.out.println(this);
		
		return empMap.values().stream().collect(Collectors.toList());
	}
	
	@GetMapping(value="/getDetails")
	public String getDetailss() {
		return "ShivKant";
	}
	
	
	@GetMapping(value="/getNameDetails")
	public void getName() {
		System.out.println("RaviKant");
	}
}
