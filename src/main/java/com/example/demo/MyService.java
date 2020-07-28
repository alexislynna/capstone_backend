package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	private String capitalizeName(String name) {
		return name.substring(0,1).toUpperCase() + name.substring(1);
	}
	
	public String getGreeting(String name) {
		return "Hello " + capitalizeName(name);
	}
}
