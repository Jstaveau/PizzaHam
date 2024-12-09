package com.springProjet.pizzaHam.repositories;

import com.springProjet.pizzaHam.models.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandRepository extends JpaRepository<Command, Integer> {
}
