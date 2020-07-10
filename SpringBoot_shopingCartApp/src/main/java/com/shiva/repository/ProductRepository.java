package com.shiva.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
