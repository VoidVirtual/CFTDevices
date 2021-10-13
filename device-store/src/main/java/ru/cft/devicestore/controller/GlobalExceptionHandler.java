package ru.cft.devicestore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.cft.devicestore.exception.SerialNumberException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({SerialNumberException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    String serialNumberMessage(SerialNumberException ex){
        return ex.getMessage();
    }
}