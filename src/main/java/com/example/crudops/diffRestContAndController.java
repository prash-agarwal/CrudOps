package com.example.crudops;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class diffRestContAndController {
	
	
	//@Target - you can find the details
	//@Retention - 
	//Source - It will disappear after compilation,it will not appear in the byte code
	//RUNTIME - annotation which are discarded by NONE even after compilation or running it will stay in code.
	//CLASS -these annotation are not required at runtime but present in bytecode.
	//Difference b/w @RestController and @Controller
	
	//@Controller do'nt have @ResponseBody in it's implementation, so we have to incorporate it
	//whereas in @RestController, @ResponseBody is in implementation.
	
	//hit postman - Json object gets converted into Java object by @RequestBody
	//java response-Java object gets converted into Json object by @ResponseBody
	
	@PostMapping(value="/getDetailsEmployee")
	public void getEmployee(@Valid@RequestBody Employee employee) {

		System.out.println("Inside EmployeeController");
		System.out.println("Inside create Employee");
		
	}
//when we use @Controller	
//	@PostMapping(value="/getDetailsEmployee")
//	@ResponseBody
//	public void getEmployee(@Valid@RequestBody Employee employee) {
//		
//		System.out.println("Inside create Employee");
//	}
}
