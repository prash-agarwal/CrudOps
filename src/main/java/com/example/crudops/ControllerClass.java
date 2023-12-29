package com.example.crudops;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@PostMapping(value="/employeeName")
	public String createStudent(@RequestBody Employee employee) {
		System.out.println(employee.getName());
		return employee.getName();
		
	}

//if we use only @Controller, then it won't be able to return any data in the API in
	//POST/GET mapping.

}
