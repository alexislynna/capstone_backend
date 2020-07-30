package com.example.demo.capstone.Science;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Planet {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Planet(String name, String description,Integer id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Planet() {
		
	}

	
	
	
	
	
//	public Planet() {}
//	public Planet(String brand, String type) {
//		this.brand = brand;
//		this.type = type;
//	}
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getBrand() {
//		return brand;
//	}
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
}
