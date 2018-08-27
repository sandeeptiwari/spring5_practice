package com.sandi.recipe.service;

import com.sandi.recipe.domain.Recipe;
import com.sandi.recipe.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
//https://start.jhipster.tech/jdl-studio/
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        //log.debug("I am debug");

        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
