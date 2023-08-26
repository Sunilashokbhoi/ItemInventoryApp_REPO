package com.igc.iia.iteminventoryapp.exception;

import com.igc.iia.iteminventoryapp.responses.Responses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<?> ItemNotFoundEX(){
        return new ResponseEntity<>(new Responses("Item With Given ID Not Found In Database",HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }
}
