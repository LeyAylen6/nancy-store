package com.nancystore.api.dtos;

import com.nancystore.api.models.Product;
import jakarta.validation.constraints.*;
import lombok.Getter;

@Getter
public class ProductDTO {
    @NotNull @NotBlank @Size(max = 50)
    String name;

    @NotNull @Min(1) @Digits(integer=12, fraction=2)
    Double price;

    @Size(max = 255)
    String description;
}
