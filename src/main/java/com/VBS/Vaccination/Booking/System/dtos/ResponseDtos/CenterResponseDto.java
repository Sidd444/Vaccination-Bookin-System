package com.VBS.Vaccination.Booking.System.dtos.ResponseDtos;

import com.VBS.Vaccination.Booking.System.enums.CenterType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CenterResponseDto {

    String centerName;

    CenterType centerType;

    String address;
}
