package com.shop.shop.services;

import com.shop.shop.exception.UserNotFoundException;
import com.shop.shop.models.User;
import com.shop.shop.repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow(()-> new UserNotFoundException("User not found."));
    }
}
