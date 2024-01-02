package dev.patika.vetapp.dto;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnimalRequest {
    private String name;
    private String species;
    private String breed;
    private String gender;
    private String color;
    private LocalDate dateOfBirth;
    private CustomerRequest customer;
}
