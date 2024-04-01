package com.nancystore.api.services;

import com.nancystore.api.models.User;
import com.nancystore.api.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public void createUser() {
        var user = User.builder()
                .email("email")
                .name("nachin")
                .build();

        userRepository.save(user);
    }
}
