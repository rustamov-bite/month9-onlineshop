package com.shop.shop.controllers;

import com.shop.shop.dto.UserDto;
import com.shop.shop.exception.UserNotFoundException;
import com.shop.shop.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/getUserById/{userId}")
    public UserDto getUserById(@PathVariable("userId") Long userId){
         var user = userService.getUserById(userId);
         return UserDto.builder()
                 .name(user.getName())
                 .email(user.getEmail())
                 .build();
    }

    @ExceptionHandler(UserNotFoundException.class)
    private String userNotFound(UserNotFoundException uex) {
        return uex.getMessage();
    }
}
