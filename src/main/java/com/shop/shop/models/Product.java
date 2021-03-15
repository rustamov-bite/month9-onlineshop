package com.shop.shop.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.util.List;

@Data
@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Please write name of the product.")
    @NotBlank(message = "Please write right name of the product.")
    private String name;
    private String description;
    @NotNull(message = "Please download an image of the product.")
    private String image;
    @PositiveOrZero
    private Integer quantity;
    @Positive
    private Integer price;

    @ManyToOne
    @NotNull
    private Category category;
    @ManyToOne
    @NotNull
    private User user;
    @OneToMany(mappedBy = "product")
    private List<@NotNull Order> orders;
}
