package dev.patika.vetapp.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentRequest {
    private LocalDateTime appointmentDate;
    private AnimalWithoutRelations animal;
    private DoctorWithoutRelations doctor;
}
