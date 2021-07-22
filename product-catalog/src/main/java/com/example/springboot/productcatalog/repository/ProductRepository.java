package com.example.springboot.productcatalog.repository;

import com.example.springboot.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
