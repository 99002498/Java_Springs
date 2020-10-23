package com.example.service;

import org.springframework.stereotype.Service;

@Service
public interface GreetService {
	
	String showMessage();
	String printName(String name);
	String welcomeUser(String name);
	

}
