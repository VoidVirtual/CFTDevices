package ru.cft.devicestore.exception;

public class SerialNumberException extends RuntimeException{
    private String number;
    public SerialNumberException(String number){

    }
    @Override
    public String getMessage(){
        return "A device with the serial number" + number + "allready exists";
    }

}
