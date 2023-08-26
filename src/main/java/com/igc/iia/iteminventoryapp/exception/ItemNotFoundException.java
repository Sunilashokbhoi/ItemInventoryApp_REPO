package com.igc.iia.iteminventoryapp.exception;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(String message){
        super(message);
    }
}
