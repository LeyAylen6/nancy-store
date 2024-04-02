package com.nancystore.api.utils;

import com.nancystore.api.dtos.ProductDTO;
import com.nancystore.api.models.Product;

public class Mapper {
    public static Product ProductDTOToProduct(ProductDTO product) {
        return new Product(
                null,
                product.getName(),
                product.getPrice(),
                product.getDescription()
        );
    }
}
