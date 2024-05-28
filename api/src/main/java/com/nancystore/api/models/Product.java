package com.nancystore.api.models;

import com.nancystore.api.dtos.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.Optional;

@Data
@AllArgsConstructor
public class Product {

    private String id;

    private String name;

    private Double price;

    private String description;

    public void merge(ProductDTO product) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = Optional.ofNullable(product.getDescription()).orElse(this.getDescription());
    }
}
