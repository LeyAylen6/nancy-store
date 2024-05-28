package com.nancystore.api.controllers;

import com.nancystore.api.dtos.LoginRequestDTO;
import com.nancystore.api.dtos.LoginResponseDTO;
import com.nancystore.api.dtos.UserDTO;
import com.nancystore.api.models.User;
import com.nancystore.api.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user/login")
    public LoginResponseDTO login(@RequestBody @Valid LoginRequestDTO userData) {
        return userService.login(userData);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody @Valid UserDTO user) {
        return userService.createUser(user);
    }

    @PutMapping("/user/{id}")
    public User updateUserById(@RequestBody @Valid UserDTO user, @PathVariable("id") Long id) {
        // TODO: Pasar id de param a JWT.
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }


}
