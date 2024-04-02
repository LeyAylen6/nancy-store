package com.nancystore.api.dtos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ErrorDTO {
    private String code;
    private String message;
    private List<String> details;
}
