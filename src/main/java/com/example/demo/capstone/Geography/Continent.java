package com.example.demo.capstone.Geography;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Continent {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Continent(String name, Integer id) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Continent() {
		
	}

}