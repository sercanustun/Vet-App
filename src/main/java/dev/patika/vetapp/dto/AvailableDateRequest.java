package dev.patika.vetapp.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvailableDateRequest {
    private LocalDate date;
    private DoctorRequest doctor;
}
