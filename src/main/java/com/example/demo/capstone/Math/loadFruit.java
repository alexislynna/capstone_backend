package com.example.demo.capstone.Math;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class loadFruit implements ApplicationRunner {
		
	@Autowired
	private FruitRepository fruitRepository;
		
	public void run(ApplicationArguments args) {
	fruitRepository.save(new Fruit("strawberries",5,1));   
	fruitRepository.save(new Fruit("peaches",10,2)); 
	fruitRepository.save(new Fruit("blueberries",5,3));   
	fruitRepository.save(new Fruit("blackberries",5,4));    
	}

}
