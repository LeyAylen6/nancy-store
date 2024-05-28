package com.nancystore.api.services;

import com.nancystore.api.dtos.LoginRequestDTO;
import com.nancystore.api.dtos.LoginResponseDTO;
import com.nancystore.api.dtos.UserDTO;
import com.nancystore.api.exceptions.UserNotFoundException;
import com.nancystore.api.models.User;
import com.nancystore.api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public LoginResponseDTO login(LoginRequestDTO userData) {
        User user = userRepository.findByEmail(userData.getEmail()).orElseThrow(UserNotFoundException::new);

        return new LoginResponseDTO("gigioiog");
    }

    public User createUser(UserDTO user) {
        User newUser = User.builder()
                .email(user.getEmail())
                .name(user.getName())
                .password(user.getPassword())
                .phone(user.getPhone())
                .build();

        userRepository.save(newUser);

        return newUser;
    }

    public User updateUser(UserDTO user, Long id) {
        User userFound = userRepository.findById(id)
                .orElseThrow(UserNotFoundException::new);

        userFound.merge(user);
        userRepository.save(userFound);

        return userFound;
    }

    public void deleteUser(Long id) {
        userRepository.disableUserById(id);
    }
}
