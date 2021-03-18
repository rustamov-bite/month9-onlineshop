package com.shop.shop.repositories;

import com.shop.shop.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    Page<Product> findAllByNameContains(String name, Pageable pageable);
    Page<Product> findAllByDescriptionContains(String description, Pageable pageable);
    Page<Product> findAllByQuantityLessThanEqual(Integer quantity, Pageable pageable);
    Page<Product> findAllByPriceLessThanEqual(Integer price, Pageable pageable);
}
