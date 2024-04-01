package com.nancystore.api.repositories;

import com.nancystore.api.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductRepository extends MongoRepository<Product, String> {
    @Query("{name:'?0'}")
    Product findProductByName(String name);
}

