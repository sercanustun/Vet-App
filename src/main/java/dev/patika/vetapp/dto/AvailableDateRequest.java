package dev.patika.vetapp.dto;

import dev.patika.vetapp.entity.Doctor;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvailableDateRequest {
    private LocalDate date;
    private Doctor doctor;
}
