package com.scourtin.revision.binding.dtos;

public class RecipeIngredientDTO {
	private Long id;
	private IngredientDTO ingredient;
	private Long quantity;
	private String unit;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public IngredientDTO getIngredient() {
		return ingredient;
	}
	public void setIngredient(IngredientDTO ingredient) {
		this.ingredient = ingredient;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
}
