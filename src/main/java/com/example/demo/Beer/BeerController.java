package com.example.demo.Beer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@CrossOrigin("*")
@RequestMapping("/beerdata")
public class BeerController {
	
	@Autowired
	BeerRepository repository;
	
	@GetMapping
	public List<BeerData> readAllBeers() {
		return repository.findAll();
	}
	
	@GetMapping("/{id}")
	public BeerData readBeerById(@PathVariable Integer id) {
		return repository.findById(id).orElse(null);
	}
	
	@PostMapping
	public BeerData createBeer(@RequestBody BeerData beer) {
		return repository.save(beer);
	}
	
	@PutMapping("/{id}")
	public BeerData updateType(@PathVariable Integer id, @RequestBody BeerData beer) {
		BeerData beerToEdit = repository.findById(id).orElse(null);
		
		if (beerToEdit == null) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Beer not found.");
		}
		
		beerToEdit.setBrand(beer.getBrand());
		beerToEdit.setType(beer.getType());
		
		return repository.save(beerToEdit);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBeer(@PathVariable Integer id) {
		if (repository.existsById(id)) {
			repository.deleteById(id);
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Beer not found.");
		}
	}
	
}




