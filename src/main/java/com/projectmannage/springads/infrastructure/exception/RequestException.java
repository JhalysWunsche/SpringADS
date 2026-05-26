package com.projectmannage.springads.infrastructure.exception;

import lombok.Getter;
@Getter

public class RequestException extends RuntimeException {
    private final String errorCode;

    public RequestException(String mensage, String errorcode) {
        super(mensage);
        this.errorCode = errorcode;
    }
}
