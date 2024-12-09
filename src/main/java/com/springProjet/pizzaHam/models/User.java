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
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String telephone;
    private String address;
    private String role;

    @OneToMany(mappedBy = "identifiant")
    private List<Command> commands;
}
