package dev.patika.vetapp.dto;

import dev.patika.vetapp.base.City;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerWithoutRelations {
    private String id;
    private String name;
    private String phone;
    private String mail;
    private String address;
    private City city;
}
