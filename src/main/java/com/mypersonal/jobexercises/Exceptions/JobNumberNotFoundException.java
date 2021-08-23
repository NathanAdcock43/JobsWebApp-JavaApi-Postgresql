package com.mypersonal.jobexercises.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//this establishes custom responses for specific situations
//in this case a message if a job Id is not found
@ResponseStatus(HttpStatus.NOT_FOUND)
public class JobNumberNotFoundException extends RuntimeException {
    public JobNumberNotFoundException(Long id) {
        super("Couldn't find Job "+id);
    }
}