package com.mahdidroid.spring5recipeapp.Repositories;

import com.mahdidroid.spring5recipeapp.Domain.Ingredient;
import com.mahdidroid.spring5recipeapp.Domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient,Long> {
}
