package com.nancystore.api.dtos;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
@AllArgsConstructor
public class UserDTO {
    @NotBlank @NotNull @Length(min = 3, max = 50)
    private String name;

    @NotNull @Digits(integer=15, fraction=0)
    private Long phone;

    @NotBlank @NotNull @Email @Length(min = 10, max = 50)
    private String email;

    @NotBlank @NotNull @Length(min = 6, max = 50)
    private String password;
}
