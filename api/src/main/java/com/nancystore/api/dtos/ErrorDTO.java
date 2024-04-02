package com.nancystore.api.dtos;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ErrorDTO {
    private String status;
    private String message;
    private Object[] detail;
}
