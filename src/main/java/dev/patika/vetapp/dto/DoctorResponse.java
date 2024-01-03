package dev.patika.vetapp.dto;

import dev.patika.vetapp.core.City;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DoctorResponse {
    private String name;
    private String phone;
    private String mail;
    private String address;
    private City city;
}
