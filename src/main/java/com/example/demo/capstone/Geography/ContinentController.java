package com.example.demo.capstone.Geography;

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
@RequestMapping("/geography")
public class ContinentController {
	
	@Autowired
	ContinentRepository repository;
	
	
	@GetMapping
	public List<Continent> readAllContinents() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Continent readContinentById(@PathVariable Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping
	public Continent createContinent(@RequestBody Continent continent) {
		return repository.save(continent);
	}
	
	@DeleteMapping("/{id}")
	public void deleteContinent(@PathVariable Integer id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Continent not found.");
		}
	}
}