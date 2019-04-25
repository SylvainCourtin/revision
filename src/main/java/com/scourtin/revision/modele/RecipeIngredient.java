package com.scourtin.revision.modele;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RecipeIngredient implements Serializable {
	private static final long serialVersionUID = 9115841495108468483L;
	private Long id;
	private Ingredient ingredient;
	private Long quantity;
	private String unit;
		
	public RecipeIngredient() {
	}
	
	public RecipeIngredient(Long id, Ingredient ingredient, Long quantity, String unit) {
		this.id = id;
		this.ingredient = ingredient;
		this.quantity = quantity;
		this.unit = unit;
	}
	@Id @GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@ManyToOne
	public Ingredient getIngredient() {
		return ingredient;
	}
	public void setIngredient(Ingredient ingredient) {
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
