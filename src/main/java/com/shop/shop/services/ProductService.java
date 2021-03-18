package com.shop.shop.services;

import com.shop.shop.models.Product;
import com.shop.shop.repositories.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    public Page<Product> getAllProductsByName(String name, Pageable pageable) {
        return productRepo.findAllByNameContains(name, pageable);
    }

    public Page<Product> getAllProductsByDescription(String description, Pageable pageable) {
        return productRepo.findAllByDescriptionContains(description, pageable);
    }

    public Page<Product> getAllProductsByQuantity(Integer quantity, Pageable pageable) {
        return productRepo.findAllByQuantityLessThanEqual(quantity, pageable);
    }

    public Page<Product> getAllProductsByPrice(Integer price, Pageable pageable) {
        return productRepo.findAllByPriceLessThanEqual(price, pageable);
    }
}
