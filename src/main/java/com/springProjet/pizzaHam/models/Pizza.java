package com.springProjet.pizzaHam.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Pizza {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(unique = true, nullable = false)
    private String name;
    private String size;
    private double price;
    private int timeToCook;
    private String ingredients;
    @ManyToMany(mappedBy = "pizzas")
    private List<Command> command;
}
