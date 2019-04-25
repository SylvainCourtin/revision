package com.scourtin.revision.modele;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Recipe implements Serializable {
	private static final long serialVersionUID = -4501355446045714049L;
	private Long id;
	private String name;
	private String picture;
	private String description;
	private Set<RecipeIngredient> ingredients;
	private Set<String> instructions;
	
	public Recipe() {
	}
	
	public Recipe(Long id, String name, String picture, String description, Set<RecipeIngredient> ingredients,
			Set<String> instructions) {
		this.id = id;
		this.name = name;
		this.picture = picture;
		this.description = description;
		this.ingredients = ingredients;
		this.instructions = instructions;
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
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	public Set<RecipeIngredient> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<RecipeIngredient> ingredients) {
		this.ingredients = ingredients;
	}
	@ElementCollection
	public Set<String> getInstructions() {
		return instructions;
	}
	public void setInstructions(Set<String> instructions) {
		this.instructions = instructions;
	}
	
}
