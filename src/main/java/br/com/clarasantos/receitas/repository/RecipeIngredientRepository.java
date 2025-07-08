package br.com.clarasantos.receitas.repository;

import br.com.clarasantos.receitas.entity.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Long> {
}

