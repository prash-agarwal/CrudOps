package com.example.crudops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorWayofDependencyInjection {

	//property injection - Actual value declared in application.properties
	//it is accessible everyhere and reduces redundancy
	//if the value gets changed, we don't need to change it everyhwere in the application.
	
	@Value("${jdbl.lecture.number}")
	int lectureNumber;
	
	int a=61;

	DemoConfig demo;

	@Autowired
	public ConstructorWayofDependencyInjection(DemoConfig demo,@Value("${jdbl.batch.number}") int batchNumber) {
		this.demo=demo;
		System.out.println("printing the value of lecture "+this.lectureNumber); //12
		System.out.println("printing the value of batch "+ batchNumber);  //61
		//this.loadConfigPanel(batchNumber);
		//printing the value of lecture 0
		//printing the value of batch 61
	}

//	@GetMapping("/getDetailsByName")
//	public String getDetailsByName() {
//	demoConfig.getDetails();
//	return "bean scope";
//	}

}
