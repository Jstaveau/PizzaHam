package com.springProjet.pizzaHam.repositories;

import com.springProjet.pizzaHam.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findUserById(Integer id);
}

