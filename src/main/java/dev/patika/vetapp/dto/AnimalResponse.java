package dev.patika.vetapp.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AnimalResponse {
    private String id;
    private String name;
    private String species;
    private String breed;
    private String gender;
    private String color;
    private LocalDate dateOfBirth;
    private CustomerResponse customer;
    private List<VaccineResponse> vaccines;
    private List<AppointmentResponse> appointments;
}
