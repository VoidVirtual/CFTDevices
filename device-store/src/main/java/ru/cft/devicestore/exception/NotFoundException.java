package ru.cft.devicestore.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND,
                reason = "The required device does not exist")
public class NotFoundException extends RuntimeException {

}
