package br.com.clarasantos.receitas.repository;

import br.com.clarasantos.receitas.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}

