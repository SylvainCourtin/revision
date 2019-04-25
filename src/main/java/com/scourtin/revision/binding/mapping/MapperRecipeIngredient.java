package com.scourtin.revision.binding.mapping;

import com.scourtin.revision.binding.dtos.RecipeIngredientDTO;
import com.scourtin.revision.modele.RecipeIngredient;

public class MapperRecipeIngredient {

	public static RecipeIngredient dtoToRecipeIngredient(RecipeIngredientDTO dto) {
		return new RecipeIngredient(
				dto.getId(),
				MapperIngredient.dtoToIngredient(dto.getIngredient()),
				dto.getQuantity(), 
				dto.getUnit());
	}
	
	public static RecipeIngredientDTO RecipeIngredientToDTO(RecipeIngredient recipeIngredient) {
		RecipeIngredientDTO dto = new RecipeIngredientDTO();
		dto.setId(recipeIngredient.getId());
		dto.setIngredient(MapperIngredient.ingrendientToDto(recipeIngredient.getIngredient()));
		dto.setQuantity(recipeIngredient.getQuantity());
		dto.setUnit(recipeIngredient.getUnit());
		return dto;
	}
}
