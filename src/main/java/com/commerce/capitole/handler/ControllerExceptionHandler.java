package com.commerce.capitole.handler;

import com.commerce.capitole.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.format.DateTimeParseException;

@ControllerAdvice
public class ControllerExceptionHandler {

    private static final String FIELD_DATE = "date";

    @ExceptionHandler(value = DateTimeParseException.class)
    public ResponseEntity<ErrorMessage> dateTimeParseException(DateTimeParseException ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(
                FIELD_DATE,
                ex.getParsedString(),
                ex.getMessage());

        return new ResponseEntity<ErrorMessage>(message, HttpStatus.BAD_REQUEST);
    }
}
