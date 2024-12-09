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
public class Command {
    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User identifiant;

    @ManyToMany
    @JoinTable(
            name = "pizzas_commands",
            joinColumns = {
            @JoinColumn(name = "command_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "pizza_id")
            }
    )
    private List<Pizza> pizzas;
    private Long price;
    private String coupon;

//    un id, un utilisateur, une liste de pizzas, quantité par pizza, prix total et un code promo.
}
