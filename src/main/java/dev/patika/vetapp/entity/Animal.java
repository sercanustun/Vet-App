package dev.patika.vetapp.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.patika.vetapp.core.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Animal extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String species;
    @Column(nullable = false)
    private String breed;
    @Column(nullable = false)
    private String gender;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(mappedBy = "animal", orphanRemoval = true)
    @JsonIgnore
    private List<Vaccine> vaccines;

    @OneToMany(mappedBy = "animal", orphanRemoval = true)
    @JsonIgnore
    private List<Appointment> appointments;
}
