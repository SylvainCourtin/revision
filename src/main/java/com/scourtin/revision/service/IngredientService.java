package com.scourtin.revision.service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.scourtin.revision.binding.dtos.IngredientDTO;
import com.scourtin.revision.binding.mapping.MapperIngredient;
import com.scourtin.revision.exception.RecipeNotFoundException;
import com.scourtin.revision.modele.Ingredient;
import com.scourtin.revision.persistance.IngredientDAO;

@Service
public class IngredientService {
	
	private IngredientDAO ingredientDAO;

	public IngredientService(IngredientDAO ingredientDAO) {
		this.ingredientDAO = ingredientDAO;
	}
	
	public Set<IngredientDTO> getAll() {
		return ingredientDAO.getAll()
				.stream()
				.map(ingredient -> MapperIngredient.ingrendientToDto(ingredient))
				.collect(Collectors.toSet());
	}
	
	public Optional<IngredientDTO> getById(Long id) {
		Optional<Ingredient> ingredient = ingredientDAO.getById(id);
		if(ingredient.isPresent()) {
			return Optional.of(MapperIngredient.ingrendientToDto(ingredient.get()));
		} else {
			return Optional.empty();
		}
	}
	
	public Long create(IngredientDTO dto) {
		return ingredientDAO.create(MapperIngredient.dtoToIngredient(dto));
	}
	
	public void update(IngredientDTO dto) throws RecipeNotFoundException {
		ingredientDAO.update(MapperIngredient.dtoToIngredient(dto));
	}
	
	public void delete(IngredientDTO dto) throws RecipeNotFoundException {
		delete(dto.getId());
	}
	
	public void delete(Long id) throws RecipeNotFoundException {
		ingredientDAO.delete(id);
	}
}
