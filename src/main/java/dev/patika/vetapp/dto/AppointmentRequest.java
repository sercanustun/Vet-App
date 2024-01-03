package dev.patika.vetapp.dto;

import dev.patika.vetapp.entity.Animal;
import dev.patika.vetapp.entity.Doctor;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentRequest {
    @NotBlank
    private LocalDateTime appointmentDate;
    @NotBlank
    private Animal animal;
    @NotBlank
    private Doctor doctor;
}
