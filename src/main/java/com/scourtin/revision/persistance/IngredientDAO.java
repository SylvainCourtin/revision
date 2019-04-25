package com.scourtin.revision.persistance;

import static com.scourtin.revision.persistance.constant.SqlQuery.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.scourtin.revision.exception.RecipeNotFoundException;
import com.scourtin.revision.modele.Ingredient;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class IngredientDAO{
	
	private static Logger logger = LoggerFactory.getLogger(IngredientDAO.class);
	
	@PersistenceContext
	private EntityManager entityManager;

	
	public Set<Ingredient> getAll() {
		List<Ingredient> ingredients = entityManager.createQuery(SQL_QUERY_INGREDIENT_SELECT, Ingredient.class)
				.getResultList();
		return ingredients.stream().collect(Collectors.toSet());
	}
	
	public Optional<Ingredient> getById(Long id) {
		return Optional.ofNullable(entityManager.find(Ingredient.class, id));
	}
	
	@Transactional
	public Long create(Ingredient ingredient) {
		entityManager.persist(ingredient);
		entityManager.flush();
		return ingredient.getId();
	}
	
	@Transactional
	public void update(Ingredient ingredient) throws RecipeNotFoundException {
		entityManager.merge(ingredient);
		entityManager.flush();
	}
	
	@Transactional
	public void delete(Long id) throws RecipeNotFoundException {
		if(!(entityManager.createQuery(SQL_QUERY_INGREDIENT_DELETE)
				.setParameter("idIngredient", id)
				.executeUpdate() > 0)) {
			throw new RecipeNotFoundException("id :"+id+" doesn't exist");
		}
	}
}
