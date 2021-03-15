package com.shop.shop.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="feedbacks")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Product product;
    @NotBlank(message = "Please write down stars.")
    @NotNull(message = "Please write down stars.")
    @Size(min = 1, max = 5)
    private Integer stars;
    @NotNull(message = "Please write a description.")
    @NotBlank(message = "Please write a right description.")
    private String description;
}
