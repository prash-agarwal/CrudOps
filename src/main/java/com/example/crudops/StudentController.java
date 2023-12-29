package com.example.crudops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	List<Students> list=new ArrayList<>();
	
	@PostMapping(value="/createStudent")
	public void createStudent(@RequestBody Students student) {
		list.add(student);
	}

	@GetMapping(value="/getStudents")
	public List<Students> getStudent() {
		return list.stream().collect(Collectors.toList());
	}		
}
