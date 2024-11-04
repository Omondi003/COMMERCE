package org.example.commerces.Exception;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CommerceExcHandler {
    @ExceptionHandler(value = {NotFoundExc.class})
    public ResponseEntity<Object> handleNotFoundExc
            ( NotFoundExc notFoundExc)
    {
        CommerceExc commerceExc= new CommerceExc(
                notFoundExc.getMessage(),
                notFoundExc.getCause(),
                HttpStatus.NOT_FOUND

        );
        return new ResponseEntity<>(commerceExc, HttpStatus.NOT_FOUND);
    }
}
