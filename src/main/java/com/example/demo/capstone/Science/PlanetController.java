package com.example.demo.capstone.Science;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin("*")
@RequestMapping("/science")
public class PlanetController {
	
	@Autowired
	PlanetRepository repository;
	
	@GetMapping
	public List<Planet> readAllPlanets() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Planet readPlanetById(@PathVariable Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping
	public Planet createPlanet(@RequestBody Planet planet) {
		return repository.save(planet);
	}

//	@PutMapping("/{id}")
//	public Planet updateType(@PathVariable Integer id, @RequestBody Planet beer) {
//		Planet beerToEdit = repository.findById(id).orElse(null);
//		
//		if (beerToEdit == null) {
//			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Beer not found.");
//		}
//		
//		beerToEdit.setBrand(beer.getBrand());
//		beerToEdit.setType(beer.getType());
//		
//		return repository.save(beerToEdit);
//	}
	
	@DeleteMapping("/{id}")
	public void deletePlanet(@PathVariable Integer id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Planet not found.");
		}
	}
	
}




