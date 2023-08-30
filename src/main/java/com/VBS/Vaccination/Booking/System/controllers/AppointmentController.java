package com.VBS.Vaccination.Booking.System.controllers;


import com.VBS.Vaccination.Booking.System.dtos.RequestDtos.BookAppointmentRequestDto;
import com.VBS.Vaccination.Booking.System.dtos.ResponseDtos.BookAppointmentResponseDto;
import com.VBS.Vaccination.Booking.System.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/book")
    public ResponseEntity bookAppointment(
            @RequestBody BookAppointmentRequestDto bookAppointmentRequestDto){

        try{
            BookAppointmentResponseDto bookAppointmentResponseDto = appointmentService.bookAppointment(bookAppointmentRequestDto);
            return new ResponseEntity(bookAppointmentResponseDto,HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    // get all the appointments of a particular doctor

    // get all the appointments for a particular person
}
