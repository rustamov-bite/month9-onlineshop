package com.shop.shop.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="product")
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private String image;
    private int quantity;
    private int price;
}
