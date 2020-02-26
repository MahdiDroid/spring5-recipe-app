package com.mahdidroid.spring5recipeapp.Controllers;


import com.mahdidroid.spring5recipeapp.Domain.Category;
import com.mahdidroid.spring5recipeapp.Domain.UnitOfMeasure;
import com.mahdidroid.spring5recipeapp.Repositories.CategoryRepository;
import com.mahdidroid.spring5recipeapp.Repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;


    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"/","/index"})
    public String getIndexPage(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
        System.out.println("Category ID is " +  categoryOptional.get().getId());
        System.out.println("UnitOfMeasure Id is " + unitOfMeasureOptional.get().getId());


        return "index";
    }


}
