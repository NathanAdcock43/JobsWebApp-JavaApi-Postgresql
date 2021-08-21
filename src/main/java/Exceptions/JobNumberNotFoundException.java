package Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class JobNumberNotFoundException extends RuntimeException {
    public JobNumberNotFoundException(Long id) {
        super("Couldn't find Job "+id);
    }
}