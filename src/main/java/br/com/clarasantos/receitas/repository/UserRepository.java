package br.com.clarasantos.receitas.repository;

import br.com.clarasantos.receitas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}

