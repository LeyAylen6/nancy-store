package com.nancystore.api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
public class LoginRequestDTO {
    @NotBlank @NotNull @Email @Length(min = 10, max = 50)
    private String email;
    @NotBlank @NotNull @Length(min = 6, max = 50)
    private String password;
}
