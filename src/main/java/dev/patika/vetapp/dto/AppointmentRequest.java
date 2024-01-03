package dev.patika.vetapp.dto;

import dev.patika.vetapp.entity.Animal;
import dev.patika.vetapp.entity.Doctor;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentRequest {
    private LocalDateTime appointmentDate;
    private Animal animal;
    private Doctor doctor;
}
