package com.mahdidroid.spring5recipeapp.services;

import com.mahdidroid.spring5recipeapp.Domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
