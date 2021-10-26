package com.target.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.target.api.entities.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{

}
