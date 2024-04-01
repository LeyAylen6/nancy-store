package com.nancystore.api.utils.mappers;

import com.nancystore.api.dtos.ProductDTO;
import com.nancystore.api.models.Product;

public class ProductDTOMapToProduct {
    public static Product convert(ProductDTO product) {
        return new Product(
                null,
                product.getName(),
                product.getPrice(),
                product.getDescription()
        );
    }
}
