package com.VBS.Vaccination.Booking.System.exceptions;

public class CenterNotFoundException extends RuntimeException{

    public CenterNotFoundException(String message){
        super(message);
    }
}
