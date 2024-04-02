package com.nancystore.api.models;

import com.mysql.cj.util.StringUtils;
import com.nancystore.api.dtos.ProductDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;
import java.util.Optional;

@Data
@AllArgsConstructor
public class Product {

    String id;

    String name;

    Double price;

    String description;

    public Product merge(ProductDTO product) {
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = Optional.ofNullable(product.getDescription()).orElse(this.getDescription());

        return this;
    }
}
