package com.springProjet.pizzaHam.rest;

import com.springProjet.pizzaHam.models.Pizza;
import com.springProjet.pizzaHam.models.User;
import com.springProjet.pizzaHam.repositories.PizzaRepository;
import com.springProjet.pizzaHam.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/pizza-ham")
public class RestController {
    private PizzaRepository pizzaRepository;
    private UserRepository userRepository;
    public RestController(PizzaRepository pizzaRepository, UserRepository userRepository) {
        this.pizzaRepository = pizzaRepository;
        this.userRepository = userRepository;
    }

    @GetMapping("/pizza/{id}")
    public Pizza getPizzaById(@PathVariable int id) {
        Pizza pizza = pizzaRepository.findPizzaById(id);
        return pizza;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id) {
        User user = userRepository.findUserById(id);
        return user;
    }

    @PostMapping("/add-pizza")
    public Pizza addPizza(@RequestBody Pizza pizza) {
        pizzaRepository.save(pizza);
        return pizza;
    }
    @PostMapping("/add-user")
    public User addUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }
}
