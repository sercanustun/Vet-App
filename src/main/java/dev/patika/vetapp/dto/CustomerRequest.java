package dev.patika.vetapp.dto;

import dev.patika.vetapp.base.BaseEntity;
import dev.patika.vetapp.base.City;
import dev.patika.vetapp.entity.Animal;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerRequest {
    private String name;
    private String phone;
    private String mail;
    private String address;
    private City city;
}
