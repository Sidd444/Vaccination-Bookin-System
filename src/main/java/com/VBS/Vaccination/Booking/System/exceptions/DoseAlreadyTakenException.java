package com.VBS.Vaccination.Booking.System.exceptions;

public class DoseAlreadyTakenException extends RuntimeException{

    public DoseAlreadyTakenException(String message){
        super(message);
    }
}
