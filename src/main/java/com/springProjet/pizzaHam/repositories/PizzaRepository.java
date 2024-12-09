package com.springProjet.pizzaHam.repositories;

import com.springProjet.pizzaHam.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza,Integer> {
    Pizza findPizzaById(Integer id);
    List<Pizza> findAll();
    List<Pizza> findAllByName(String pizzaName);
    List<Pizza> findAllByNameIgnoreCase(String pizzaName);
    List<Pizza> findAllByNameContainingIgnoreCase(String pizzaName);
    List<Pizza> findAllByNameStartsWithIgnoreCase(String pizzaName);
    List<Pizza> findAllByNameEndsWithIgnoreCase(String pizzaName);
    List<Pizza> findAllByNameInIgnoreCase(List<String> names);
    void deletePizzaById(Integer id);
}
