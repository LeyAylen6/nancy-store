package com.nancystore.api.repositories;

import com.nancystore.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
