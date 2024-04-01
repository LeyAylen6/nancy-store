package com.nancystore.api.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    String id;
    String name;
    Double price;
    String description;
}
