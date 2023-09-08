package com.igc.iia.iteminventoryapp.exception;

import com.igc.iia.iteminventoryapp.responses.Responses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<?> ItemNotFoundEX(){
        return new ResponseEntity<>(new Responses("Item With Given ID Not Found In Database",HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

        Map<String,String> errormap = new HashMap<>();
        for(FieldError field : ex.getFieldErrors()){
        errormap.put(field.getField(),field.getDefaultMessage());
        }
        return new ResponseEntity<>(new Responses("Please Check The Input Data",HttpStatus.BAD_REQUEST,errormap),HttpStatus.BAD_REQUEST);
    }
}
