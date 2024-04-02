package com.nancystore.api.Exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class NotFoundException extends RuntimeException {
    private final String status;

    public NotFoundException(String message) {
        super(message);
        this.status = HttpStatus.NOT_FOUND.getReasonPhrase();
    }
}


