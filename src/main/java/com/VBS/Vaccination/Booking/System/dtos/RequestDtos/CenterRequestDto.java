package com.VBS.Vaccination.Booking.System.dtos.RequestDtos;

import com.VBS.Vaccination.Booking.System.enums.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CenterRequestDto {

    String centerName;

    CenterType centerType;

    String address;

}
