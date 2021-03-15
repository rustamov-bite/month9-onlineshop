package com.shop.shop.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import javax.validation.constraints.*;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "Please write your name.")
    @NotBlank(message = "Please write name not only with spaces.")
    private String name;
    @Email(message = "Please write right syntax of your email.")
    private String email;
    @Size(min = 6, max = 6, message = "Please write password between 6 and 8 symbols.")
    private String password;

    @OneToMany(mappedBy = "user")
    private List<@NotNull Product> products;
    @OneToMany(mappedBy = "user")
    private List<@NotNull Order> orders;
    @OneToMany(mappedBy = "user")
    private List<@NotNull Feedback> feedbacks;
}

