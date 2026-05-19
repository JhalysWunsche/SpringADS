package com.projectmannage.springads.infrastructure.exception;

import jakarta.servlet.Servlet;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler (value = { Exception.class })
    public ResponseEntity<Object> handlerGenericException(Exception ex, WebRequest request) {
        ServletWebRequest servletWebRequest = (ServletWebRequest) request;
        return handleExceptionInternal(
                ex,
                new RestError(
                        "XYZ",
                        ex.getMessage(),
                        HttpStatus.BAD_REQUEST.value(),
                        servletWebRequest.getRequest().getRequestURI()
                ),
                new HttpHeaders(),
                HttpStatus.BAD_REQUEST,
                request
        );
    }

}
