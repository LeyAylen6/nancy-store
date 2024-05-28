package com.nancystore.api.exceptions;
public class UserNotFoundException extends NotFoundException {

    public UserNotFoundException() {
        super("The user you looking for does not exists");
    }

}