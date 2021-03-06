package com.example.demo.capstone.Math;

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
@RequestMapping("/math")
public class FruitController {
	
	@Autowired
	FruitRepository repository;

	
	@GetMapping
	public List<Fruit> readAllFruits() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public Fruit readFruitById(@PathVariable Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping
	public Fruit createFruit(@RequestBody Fruit fruit) {
		return repository.save(fruit);
	}
	
	@DeleteMapping("/{id}")
	public void deleteFruit(@PathVariable Integer id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Fruit not found.");
		}
	}
	
}

	
	
	