package com.example.crudops;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetImageAPI {
	
	//API to get image from lorem picsum internet and resize it.
	//https://picsum.photos/id/237/200/300
	//HTTP method
	//pass id
	
	//response that we got at start is byte code
	//consumes - type of data that ur api will consume.
	//produces - type of data that ur api will produce.
	
	@Autowired        //we are using this after creating @Bean in DemoConfig class. 
	@Qualifier("bean1") //using particular RestTemplate bean specified in DemoConfig class. 
	RestTemplate rt;   
	
	@GetMapping(value="/getImagebyId",produces=MediaType.IMAGE_PNG_VALUE)
	public byte[] getimage(@RequestParam("id")int id, @RequestParam("l")int l,@RequestParam("b")int b) {
		
		
		//http://localhost:8081/getImagebyId?id=238&l=200&b=200
		String url="https://picsum.photos/id/"+id+"/"+l+"/"+b;
		
		//JS - HTTP Client
		//JAVA - WEBCLIENT OR RESTTEMPLATE
		//RestTemplate acts as a client for making HTTP requests to interact with RESTful APIs 
		//or web services.
//		RestTemplate rt=new RestTemplate(); //hits the modified url on the internet.
		byte[] response=rt.getForObject(url, byte[].class);//getForObject(request, response)
		return response;
		
	}  
}
