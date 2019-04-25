package com.scourtin.revision.binding.mapping;

import com.scourtin.revision.binding.dtos.IngredientDTO;
import com.scourtin.revision.modele.Ingredient;

public class MapperIngredient {

	public static Ingredient dtoToIngredient(IngredientDTO ingredientDTO) {
		return new Ingredient(
				ingredientDTO.getId(), 
				ingredientDTO.getName());
	}
	
	public static IngredientDTO ingrendientToDto(Ingredient ingredient) {
		IngredientDTO ingredientDTO = new IngredientDTO();
		ingredientDTO.setId(ingredient.getId());
		ingredientDTO.setName(ingredient.getName());
		return ingredientDTO;
	}
}
