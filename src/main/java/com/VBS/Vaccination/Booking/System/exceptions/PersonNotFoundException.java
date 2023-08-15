package com.VBS.Vaccination.Booking.System.exceptions;

public class PersonNotFoundException extends RuntimeException{

    public PersonNotFoundException(String message){
        super(message);
    }
}
