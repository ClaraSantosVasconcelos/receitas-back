package br.com.clarasantos.receitas.repository;

import br.com.clarasantos.receitas.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
