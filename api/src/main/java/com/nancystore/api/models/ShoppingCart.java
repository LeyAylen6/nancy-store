package com.nancystore.api.models;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    private String status;

    private Double depositAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "shoppingCart")
    private ArrayList<ShoppingCartProduct> products;
}
