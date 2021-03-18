package com.shop.shop.controllers;

import com.shop.shop.models.Product;
import com.shop.shop.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/name")
    public Page<Product> getAllProductsByName(@RequestParam("name") String name,
                                        @RequestParam("page") Integer page,
                                        @RequestParam("size") Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllProductsByName(name, pageable);
    }

    @GetMapping("/allProductsByDescription")
    public Page<Product> getAllProductsByDescription(@RequestParam("description") String description,
                                        @RequestParam("page") Integer page,
                                        @RequestParam("size") Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllProductsByDescription(description, pageable);
    }

    @GetMapping("/allProductsByQuantity")
    public Page<Product> getAllProductsByQuantity(@RequestParam("quantity") Integer quantity,
                                                     @RequestParam("page") Integer page,
                                                     @RequestParam("size") Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllProductsByQuantity(quantity, pageable);
    }

    @GetMapping("/allProductsByPrice")
    public Page<Product> getAllProductsByPrice(@RequestParam("price") Integer price,
                                                  @RequestParam("page") Integer page,
                                                  @RequestParam("size") Integer size){
        Pageable pageable = PageRequest.of(page, size);
        return productService.getAllProductsByQuantity(price, pageable);
    }
}
