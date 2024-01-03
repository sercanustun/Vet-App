package dev.patika.vetapp.dto;

import dev.patika.vetapp.core.City;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String phone;
    @NotBlank
    private String mail;
    @NotBlank
    private String address;
    @NotBlank
    private City city;
}
