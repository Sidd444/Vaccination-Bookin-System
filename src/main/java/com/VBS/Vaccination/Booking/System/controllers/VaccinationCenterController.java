package com.VBS.Vaccination.Booking.System.controllers;
import com.VBS.Vaccination.Booking.System.dtos.RequestDtos.CenterRequestDto;
import com.VBS.Vaccination.Booking.System.dtos.ResponseDtos.CenterResponseDto;
import com.VBS.Vaccination.Booking.System.service.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/center")
public class VaccinationCenterController {

    @Autowired
    VaccinationCenterService centerService;

    @PostMapping("/add")
    public CenterResponseDto addCenter(@RequestBody CenterRequestDto centerRequestDto){

        CenterResponseDto centerResponseDto = centerService.addCenter(centerRequestDto);
        return centerResponseDto;
    }

    // get all the doctors at centers of a particular centerType

    // get the center with highest number of doctors

    // get the center with highest number of doctors among a particular centerType

}
