package com.sandi.recipe.repository;

import com.sandi.recipe.domain.Category;
import com.sandi.recipe.domain.UnitOfMeasure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends JpaRepository<UnitOfMeasure, Long> {

    public Optional<UnitOfMeasure> findByDescription(String description);
}
