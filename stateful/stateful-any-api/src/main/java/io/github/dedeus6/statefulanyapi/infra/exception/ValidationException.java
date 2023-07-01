package io.github.dedeus6.statefulanyapi.infra.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;


@ResponseStatus(BAD_REQUEST)
public class ValidationException extends RuntimeException{

    public ValidationException(String message) {
        super(message);
    }

}
