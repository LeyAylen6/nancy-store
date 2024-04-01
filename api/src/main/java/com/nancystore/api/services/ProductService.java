package com.nancystore.api.services;

import com.nancystore.api.dtos.ProductDTO;
import com.nancystore.api.models.Product;
import com.nancystore.api.repositories.ProductRepository;
import com.nancystore.api.utils.mappers.ProductDTOMapToProduct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(String id) {
        Optional<Product> productFound = productRepository.findById(id);
        if(productFound.isEmpty()) {
            throw new RuntimeException("Do not exist any product with this id");
        }

        return productFound.get();
    }

    public Product save(ProductDTO product) {
        Product newProduct = ProductDTOMapToProduct.convert(product);
        productRepository.save(newProduct);

        return newProduct;
    }

    public Product updateById(String id, ProductDTO product) {
        Optional<Product> productFound = productRepository.findById(id);
        if(productFound.isEmpty()) {
            throw new RuntimeException("Product id do not exist");
        }

        Product productUpdated = ProductDTOMapToProduct.convert(product);
        productUpdated.setId(id);

        productRepository.save(productUpdated);

        return productUpdated;
    }

    public Product deleteById(String id) {
        Optional<Product> productFound = productRepository.findById(id);
        if(productFound.isEmpty()) {
            throw new RuntimeException("Product id do not exist");
        }

        productRepository.deleteById(id);

        return productFound.get();
    }

}
