package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.GreetService;

@RestController
public class GreetControllers {

	@Autowired
	GreetService greetservice;
	@RequestMapping("/greet")
	public String sayHello() {
		
		return greetservice.showMessage();
	}
	@GetMapping("/hi")
	public String sayHi(@RequestParam("name")String name) {
		
		return greetservice.printName(name);
	}
	@GetMapping("/welcome/{username}")
	public String sayWelcome(@PathVariable("username")String name) {
		
		return greetservice.welcomeUser(name);
	}
	
	
}
