package com.mahdidroid.spring5recipeapp.Controllers;


import com.mahdidroid.spring5recipeapp.Domain.Category;
import com.mahdidroid.spring5recipeapp.Domain.UnitOfMeasure;
import com.mahdidroid.spring5recipeapp.Repositories.CategoryRepository;
import com.mahdidroid.spring5recipeapp.Repositories.RecipeRepository;
import com.mahdidroid.spring5recipeapp.Repositories.UnitOfMeasureRepository;
import com.mahdidroid.spring5recipeapp.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model ){
        model .addAttribute("recipes", recipeService.getRecipes() );



        return "index";
    }


}
