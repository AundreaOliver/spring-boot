package com.example.Rest.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Gadget {

	@Id
	int id;
	String name;
	int yearModel;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	
	
}