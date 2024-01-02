package dev.patika.vetapp.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentRequest {
    private LocalDate appointmentDate;
    private AnimalRequest animal;
    private DoctorRequest doctor;
}
