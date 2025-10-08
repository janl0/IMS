package com.janlindauer.inventory_system.repository;

import com.janlindauer.inventory_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Product repository
 */
public interface ProductRepository extends JpaRepository<Product, Long> {}
