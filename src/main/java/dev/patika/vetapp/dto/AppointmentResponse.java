package dev.patika.vetapp.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentResponse {
    private String id;
    private LocalDateTime appointmentDate;
    private AnimalResponse animal;
    private DoctorResponse doctor;
}
