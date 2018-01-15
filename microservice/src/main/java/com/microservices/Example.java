package com.microservices;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
//This is my second commit
//This is third commit
public class Example {
	@RequestMapping(value="/",produces="application/json")
	public Employee home(Employee emp){
		emp.setId(1);
		emp.setName("Tom");
		return emp;
	}
	/*public static void main(String[] args) throws Exception{
		SpringApplication.run(Example.class, args);
	}*/
	

}
