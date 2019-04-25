package com.scourtin.revision.webservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scourtin.revision.binding.dtos.RecipeDTO;
import com.scourtin.revision.binding.dtos.RecipeIngredientDTO;

@RestController()
@RequestMapping("/recipes")
public class RecipeWS {

	@GetMapping
	public ResponseEntity<?> getAll() {
		return null;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		return null;
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody RecipeDTO reDto) {
		return null;
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody RecipeDTO reDto) {
		return null;
	}
	
	@PatchMapping("/ingredients")
	public ResponseEntity<?> addIngredients(@RequestBody RecipeIngredientDTO recipeIngredientDTO) {
		return null;
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody RecipeDTO reDto) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		return null;
	}
}
