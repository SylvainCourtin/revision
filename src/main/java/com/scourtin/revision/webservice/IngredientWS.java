package com.scourtin.revision.webservice;

import java.util.Optional;
import java.util.Set;

import org.hibernate.service.spi.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
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
import com.scourtin.revision.exception.RecipeNotFoundException;
import com.scourtin.revision.service.IngredientService;

@RestController()
@RequestMapping("/ingredients")
public class IngredientWS {
	
	private static Logger logger = LoggerFactory.getLogger(IngredientWS.class);
	private IngredientService ingredientService;
	
	public IngredientWS(IngredientService ingredientService) {
		this.ingredientService = ingredientService;
	}

	@GetMapping
	public ResponseEntity<?> getAll() {
		try {
			return new ResponseEntity<Set<IngredientDTO> >(ingredientService
					.getAll(), HttpStatus.OK);
		} catch (ServiceException e) {
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		try {
			Optional<IngredientDTO> ingredientDTO = ingredientService.getById(id);
			if(ingredientDTO.isPresent()) {
				return new ResponseEntity<IngredientDTO>(ingredientDTO.get(), HttpStatus.OK);
			} else {
				return new ResponseEntity<>( HttpStatus.NOT_FOUND);
			}
		} catch (ServiceException e) { 
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<?> create(@RequestBody IngredientDTO ingredientDTO) {
		try {
			Long id = ingredientService.create(ingredientDTO);
			if(null == id || 0 > id) {
				throw new ServiceException("Echec de la création");
			}
			return new ResponseEntity<Long>(id, HttpStatus.CREATED);
		} catch (ServiceException e) {
			logger.error(e.getMessage());
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody IngredientDTO ingredientDTO) {
		try {
			ingredientService.update(ingredientDTO);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (RecipeNotFoundException e) {
			logger.debug(e.getMessage());
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (ServiceException e) { 
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody IngredientDTO ingredientDTO) {
		try {
			ingredientService.delete(ingredientDTO);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (RecipeNotFoundException e) {
			logger.debug(e.getMessage());
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (ServiceException e) { 
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		try {
			ingredientService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (RecipeNotFoundException e) {
			logger.debug(e.getMessage());
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (ServiceException e) { 
			logger.error(e.getMessage());
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
