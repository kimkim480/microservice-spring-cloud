package com.example.springboot.shoppingcart.repository;

import com.example.springboot.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
