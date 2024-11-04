package org.example.commerces.Exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@Setter
@Getter
public class CommerceExc {
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;
}
