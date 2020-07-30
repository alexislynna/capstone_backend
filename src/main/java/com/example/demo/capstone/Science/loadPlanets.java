package com.example.demo.capstone.Science;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class loadPlanets implements ApplicationRunner {
	
	@Autowired
	private PlanetRepository planetRepository;
	
	  public void run(ApplicationArguments args) {
	    planetRepository.save(new Planet("Mercury", "\"Mercury is the smallest and innermost planet in the Solar System. Its orbit around the Sun takes 87.97 days, the shortest of all the planets in the Solar System.\"(Wikipedia, 2020)",1)); 
		planetRepository.save(new Planet("Venus", "\"Venus is the second planet from the Sun. It is named after the Roman goddess of love and beauty. It is the second-brightest natural object in the night sky after the Moon. \"(Wikipedia, 2020)",2));
		planetRepository.save(new Planet("Earth", "\"Earth is the third planet from the Sun and the only astronomical object known to harbor life. Earth's axis of rotation is tilted with respect to its orbital plane, producing seasons on Earth.\" (Wikipedia, 2020)",3)); 
		planetRepository.save(new Planet("Mars", "\"Mars is the fourth planet from the Sun and the second-smallest planet in the Solar System.\"(Wikipedia, 2020)",4));
		planetRepository.save(new Planet("Jupiter", "\"Jupiter is the fifth planet from the Sun and the largest in the Solar System.\"(Wikipedia, 2020)",5));   
		planetRepository.save(new Planet("Saturn", "\"Saturn is the sixth planet from the Sun and the second-largest in the Solar System, after Jupiter. It is a gas giant with an average radius of about nine times that of Earth.\" (Wikipedia, 2020)",6)); 
		planetRepository.save(new Planet("Uranus", "\"Uranus is the seventh planet from the Sun. The name \"Uranus\" is a reference to the Greek god of the sky, Uranus.netary radius and fourth-largest planetary mass in the Solar System.\"(Wikipedia, 2020)",7)); 
		planetRepository.save(new Planet("Neptune", "\"Neptune is the eighth and farthest-known planet from the Sun in the Solar System.\" (Wikipedia, 2020)",8)); 		
	    }
}
