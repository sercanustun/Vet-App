package dev.patika.vetapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.vetapp.core.BaseEntity;
import dev.patika.vetapp.core.City;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Customer extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(nullable = false, unique = true)
    private String mail;
    @Column(nullable = false)
    private String address;
    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private City city;
    @OneToMany(mappedBy = "customer", orphanRemoval = true)
    @JsonIgnore
    private List<Animal> animals;
}
