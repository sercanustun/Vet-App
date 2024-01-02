package dev.patika.vetapp.entity;

import dev.patika.vetapp.base.BaseEntity;
import dev.patika.vetapp.base.City;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

import static jakarta.persistence.EnumType.STRING;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Doctor extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false, unique = true)
    private String phone;
    @Column(nullable = false, unique = true)
    private String mail;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    @Enumerated(value = EnumType.STRING)
    private City city;
    @OneToMany(mappedBy = "doctor",orphanRemoval = true)
    private List<Appointment> appointments;
    @OneToMany(orphanRemoval = true)
    @JoinColumn(name = "doctor_id")
    private List<AvailableDate> availableDates;
}
