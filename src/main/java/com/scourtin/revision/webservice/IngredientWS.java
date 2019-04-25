package com.scourtin.revision.webservice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scourtin.revision.binding.dtos.IngredientDTO;

@RestController()
@RequestMapping("/ingredients")
public class IngredientWS {
	
	@GetMapping
	public ResponseEntity<?> getAll() {
		return null;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		return null;
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody IngredientDTO ingredientDTO) {
		return null;
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody IngredientDTO ingredientDTO) {
		return null;
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody IngredientDTO ingredientDTO) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		return null;
	}
}
