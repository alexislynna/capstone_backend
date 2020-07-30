package com.example.demo.capstone.Geography;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class loadContinents implements ApplicationRunner {
		
	@Autowired
	private ContinentRepository continentRepository;
		
	public void run(ApplicationArguments args) {
	continentRepository.save(new Continent("North America",1));   
	continentRepository.save(new Continent("South America",2)); 
	continentRepository.save(new Continent("Africa",3));   
	continentRepository.save(new Continent("Asia",4)); 
	continentRepository.save(new Continent("Europe",5));   
	continentRepository.save(new Continent("Australia",6)); 
	continentRepository.save(new Continent("Antartica",7));   
	}

}
