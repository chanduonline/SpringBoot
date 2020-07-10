package com.chandra.spring.SpringBoot_FirstApplication_01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@RequestMapping("/")
	public String welcome()
	{
		return "Welcome to Spring Boot Applications";
	}
	
	@RequestMapping("/greet")
	public String greet()
	{
		return "Hello Spring Boot";
	}

}
