package com.scourtin.revision.binding.dtos;

import java.util.Set;

public class RecipeDTO {
	private Long id;
	private String name;
	private String picture;
	private String description;
	private Set<RecipeIngredientDTO> ingredients;
	private Set<String> instructions;
	
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
	public Set<RecipeIngredientDTO> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<RecipeIngredientDTO> ingredients) {
		this.ingredients = ingredients;
	}
	public Set<String> getInstructions() {
		return instructions;
	}
	public void setInstructions(Set<String> instructions) {
		this.instructions = instructions;
	}
}
