package com.mahdidroid.spring5recipeapp.Repositories;

import com.mahdidroid.spring5recipeapp.Domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
