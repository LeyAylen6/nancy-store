package com.nancystore.api.services;

import com.nancystore.api.models.Product;
import com.nancystore.api.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product save(Product product) {
        Product newProduct = new Product(null, product.getName(), product.getPrice(), product.getDescription());
        productRepository.save(newProduct);

        return newProduct;
    }

}
