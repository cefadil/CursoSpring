package dev.galileu.aulaspring.service.exceptions;

public class DatabaseException extends RuntimeException {
    
    public DatabaseException(String msg) {
        super(msg);
    }

}
