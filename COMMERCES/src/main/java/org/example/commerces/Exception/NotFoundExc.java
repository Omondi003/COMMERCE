package org.example.commerces.Exception;

public class NotFoundExc extends RuntimeException{
    public NotFoundExc(String message) {
        super(message);
    }

    public NotFoundExc(String message, Throwable cause) {
        super(message, cause);
    }
}
