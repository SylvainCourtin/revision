package com.scourtin.revision.binding.mapping;

import java.util.stream.Collectors;

import com.scourtin.revision.binding.dtos.RecipeDTO;
import com.scourtin.revision.modele.Recipe;

public class MapperRecipe {

	public static Recipe dtoToRecipe(RecipeDTO dto) {
		return new Recipe(
				dto.getId(), 
				dto.getName(),
				dto.getPicture(), 
				dto.getDescription(),
				dto.getIngredients()
					.stream()
					.map(reDTO -> MapperRecipeIngredient.dtoToRecipeIngredient(reDTO))
					.collect(Collectors.toSet()), 
				dto.getInstructions());
	}
	
	public static RecipeDTO recipeToDTO(Recipe recipe) {
		RecipeDTO recipeDTO = new RecipeDTO();
		recipeDTO.setId(recipe.getId());
		recipeDTO.setDescription(recipe.getDescription());
		recipeDTO.setName(recipe.getName());
		recipeDTO.setPicture(recipe.getPicture());
		recipeDTO.setIngredients(recipe.getIngredients()
				.stream()
				.map(ing -> MapperRecipeIngredient.RecipeIngredientToDTO(ing))
				.collect(Collectors.toSet()));
		recipeDTO.setInstructions(recipe.getInstructions());
		return recipeDTO;
	}
}
