package com.projectmannage.springads.infrastructure.exception;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class RestError {
    private final String errorCode;
    private final String message;
    private final int status;
    private String path;
}
