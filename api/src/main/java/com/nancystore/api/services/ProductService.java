package com.nancystore.api.services;

import com.nancystore.api.exceptions.ProductNotFoundException;
import com.nancystore.api.dtos.ProductDTO;
import com.nancystore.api.models.Product;
import com.nancystore.api.repositories.ProductRepository;
import com.nancystore.api.utils.Mapper;
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

    public Product findById(String id) {
        return productRepository.findById(id)
                .orElseThrow(ProductNotFoundException::new);
    }

    public Product save(ProductDTO product) {
        Product newProduct = Mapper.ProductDTOToProduct(product);
        productRepository.save(newProduct);

        return newProduct;
    }

    public Product updateById(String id, ProductDTO product) {
        Product productFound = this.findById(id);
        productFound.merge(product);

        productRepository.save(productFound);

        return productFound;
    }

    public void deleteById(String id) {
        this.findById(id);

        productRepository.deleteById(id);
    }

}
