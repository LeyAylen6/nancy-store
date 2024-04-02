package com.nancystore.api.exceptions;

import lombok.Getter;

@Getter
public abstract class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }
}


