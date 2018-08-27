package com.sandi.recipe.controller;

import com.sandi.recipe.domain.Category;
import com.sandi.recipe.domain.UnitOfMeasure;
import com.sandi.recipe.repository.CategoryRepository;
import com.sandi.recipe.repository.UnitOfMeasureRepository;
import com.sandi.recipe.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Slf4j
@Controller
public class IndexController {
    private RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/", "", "/index"})
    public String loadIndexPage(Model model){
        //log.debug();
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
