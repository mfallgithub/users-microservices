package com.nadhem.users.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidTokenException extends RuntimeException {
    private String message;
    public InvalidTokenException(String message) {
        super(message);
    }
}
