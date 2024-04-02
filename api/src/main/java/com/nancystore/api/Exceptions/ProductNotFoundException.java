package com.nancystore.api.Exceptions;

public class ProductNotFoundException extends NotFoundException {

    public ProductNotFoundException() {
        super("The product you looking for does not exists");
    }

}
