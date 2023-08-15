package com.VBS.Vaccination.Booking.System.exceptions;

public class DoctorNotFoundException extends RuntimeException{

    public DoctorNotFoundException(String message){
        super(message);
    }
}
