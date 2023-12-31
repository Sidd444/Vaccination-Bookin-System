package com.VBS.Vaccination.Booking.System.dtos.RequestDtos;

import com.VBS.Vaccination.Booking.System.enums.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorRequestDto {

    Integer centerId;

    String name;

    int age;

    String emailId;

    Gender gender;
}
