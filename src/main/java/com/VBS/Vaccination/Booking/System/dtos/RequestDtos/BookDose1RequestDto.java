package com.VBS.Vaccination.Booking.System.dtos.RequestDtos;

import com.VBS.Vaccination.Booking.System.enums.DoseType;
import lombok.*;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDose1RequestDto {

    int personId;

    DoseType doseType;
}
