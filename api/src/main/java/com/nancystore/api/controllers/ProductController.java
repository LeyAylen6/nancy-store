package com.nancystore.api.controllers;

import com.nancystore.api.dtos.ProductDTO;
import com.nancystore.api.models.Product;
import com.nancystore.api.services.ProductService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable String id) {
        return productService.findById(id);
    }

    @PostMapping
    public Product save(@RequestBody @Valid ProductDTO product) {
        return productService.save(product);
    }

    @PutMapping("/{id}")
    public Product updateById(@PathVariable String id, @RequestBody @Valid ProductDTO product) {
        return productService.updateById(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        productService.deleteById(id);
    }
}
