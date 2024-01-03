package dev.patika.vetapp.dto;

import dev.patika.vetapp.entity.Doctor;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvailableDateRequest {
    @NotBlank
    private LocalDate date;
    @NotBlank
    private Doctor doctor;
}
