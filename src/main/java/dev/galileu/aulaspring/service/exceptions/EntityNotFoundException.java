package dev.galileu.aulaspring.service.exceptions;

public class EntityNotFoundException extends RuntimeException {
    
    public EntityNotFoundException(String msg) {
        super(msg);
    }

}
