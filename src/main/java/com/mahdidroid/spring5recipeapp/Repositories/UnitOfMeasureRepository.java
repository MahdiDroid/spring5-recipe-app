package com.mahdidroid.spring5recipeapp.Repositories;

import com.mahdidroid.spring5recipeapp.Domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {



    Optional<UnitOfMeasure> findByDescription(String description);
}
