package com.VBS.Vaccination.Booking.System.dtos.RequestDtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookAppointmentRequestDto {

    int personId;

    int doctorId;
}
