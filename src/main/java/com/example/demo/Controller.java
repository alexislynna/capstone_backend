package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.capstone.Science.Planet;

@RestController
public class Controller {
	
	@Autowired
	private MyService service;
	
	@GetMapping("/ping")
	public String ping() {
		return "pong";
	}
	
	@GetMapping("/pong")
	public String pong() {
		return "ping";
	}
	
	@GetMapping("/greeting/{name}")
	public String getGreeting(@PathVariable String name) {
		return service.getGreeting(name);
	}
	
//	@GetMapping("/message")
//	public BeerData getServerMessage() {
//		return new BeerData("Server", "Hello from the Server!");
//	}
//	
//	@PostMapping("/message")
//	public BeerData receiveMessage(@RequestBody BeerData beer) {
//		return new BeerData("Server",
//				"I received the following message from '" + beer.getName() + "':" 
//						+ " \"" + beer.getType() + "\"");
//	}
	
}
