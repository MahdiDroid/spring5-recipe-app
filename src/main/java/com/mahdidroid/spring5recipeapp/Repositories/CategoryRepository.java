package com.mahdidroid.spring5recipeapp.Repositories;

import com.mahdidroid.spring5recipeapp.Domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {


    Optional<Category> findByDescription(String description);
}
