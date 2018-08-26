package com.sandi.recipe.service;

import com.sandi.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    public Set<Recipe> getRecipes();
}
