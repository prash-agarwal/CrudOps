package com.example.crudops;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetImageAPI2 {
	
	@GetMapping(value="/getImagebyImgId",produces=MediaType.IMAGE_PNG_VALUE)
	public byte[] getimage(@RequestParam("id")int id, @RequestParam("l")int l,@RequestParam("b")int b) {
		
		
		//http://localhost:8081/getImagebyId?id=238&l=200&b=200
		String url="https://picsum.photos/id/"+id+"/"+l+"/"+b;
		
		//JS - HTTP Client
		//JAVA - WEBCLIENT OR RESTTEMPLATE
		RestTemplate rt=new RestTemplate(); //hits the modified url on the internet.
		byte[] response=rt.getForObject(url, byte[].class);
		return response;
		
	}
}
