package com.nancystore.api.models;

import com.nancystore.api.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column()
    private Long phone;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean isEnabled;

    @OneToMany(mappedBy = "user")
    private List<ShoppingCart> orders;

    @PrePersist
    protected void onCreate() {
        if (isEnabled == null) isEnabled = true;
    }

    public void merge(UserDTO user) {
        this.name = user.getName();
        this.phone = user.getPhone();
        this.email = user.getEmail();
        this.password = user.getPassword();
    }
}
