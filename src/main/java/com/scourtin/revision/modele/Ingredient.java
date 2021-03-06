package com.scourtin.revision.modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ingredient implements Serializable {

	private static final long serialVersionUID = -285129389406821593L;
	private Long id;
	private String name;
	
	public Ingredient() {
	}
	public Ingredient(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	@Id @GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
