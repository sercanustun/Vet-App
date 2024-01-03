package dev.patika.vetapp.dto;

import dev.patika.vetapp.entity.Animal;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VaccineRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String code;
    @NotBlank
    private LocalDate protectionStartDate;
    @NotBlank
    private LocalDate protectionEndDate;
    @NotBlank
    private Animal animal;
}
