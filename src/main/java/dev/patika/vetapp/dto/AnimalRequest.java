package dev.patika.vetapp.dto;

import dev.patika.vetapp.entity.Customer;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnimalRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String species;
    @NotBlank
    private String breed;
    @NotBlank
    private String gender;
    @NotBlank
    private String color;
    @NotBlank
    private LocalDate dateOfBirth;
    @NotBlank
    private Customer customer;
}
