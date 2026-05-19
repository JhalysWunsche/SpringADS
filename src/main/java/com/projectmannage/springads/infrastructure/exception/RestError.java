package com.projectmannage.springads.infrastructure.exception;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@Builder
public class RestError {
    private final String message;
    private final String errorMessage;
    private final int status;
    private String path;
}
