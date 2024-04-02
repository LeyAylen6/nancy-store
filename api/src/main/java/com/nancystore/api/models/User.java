package com.nancystore.api.models;

import jakarta.persistence.*;
import lombok.Builder;
import java.util.ArrayList;

@Entity
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer phone;

    private String email;

    private String password;

    @OneToMany(mappedBy = "user")
    private ArrayList<ShoppingCart> orders;
}
