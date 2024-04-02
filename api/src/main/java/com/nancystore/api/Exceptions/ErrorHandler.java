package com.nancystore.api.Exceptions;

import com.nancystore.api.dtos.ErrorDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDTO genericException(Exception exception) {
        log.error("Error:", exception);

        return ErrorDTO.builder()
                .status(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                .message(exception.getMessage())
                .build();
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDTO NotFoundException(NotFoundException exception) {
        log.error("Error:", exception);

        return ErrorDTO.builder()
                .status(exception.getStatus())
                .message(exception.getMessage())
                .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO MethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        log.error("Error:", exception);

        return ErrorDTO.builder()
                .status(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .message("Error in request validations")
                .detail(exception.getDetailMessageArguments())
                .build();
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO HttpMessageNotReadableException(HttpMessageNotReadableException exception) {
        log.error("Error:", exception);

        return ErrorDTO.builder()
                .status(HttpStatus.BAD_REQUEST.getReasonPhrase())
                .message(exception.getMessage())
                .build();
    }
}
