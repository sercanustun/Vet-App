package dev.patika.vetapp.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentResponse {
    private String id;
    private LocalDate appointmentDate;
    private AnimalResponse animal;
    private DoctorResponse doctor;
}
