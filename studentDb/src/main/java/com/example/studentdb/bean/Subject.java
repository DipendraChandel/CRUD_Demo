package com.example.studentdb.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 Entity annotation defines that a class can be mapped to a table, it's just a marker
 &
 Table annotation specifies the name of the db table to be used for mapping
 */

@Entity 
@Table(name = "Subject") 
public class Subject {
	
	
	
	public Subject() {}
	
	@Id
	private String id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
