package com.microservices;

import javax.ws.rs.Produces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
//This is my second commit
public class Example {
	@RequestMapping("/")
	//@Produces("text/plain")
	public String home(){
		
		return "Hello World";
	}
	/*public static void main(String[] args) throws Exception{
		SpringApplication.run(Example.class, args);
	}*/
	

}
