package dev.patika.vetapp.entity;

import dev.patika.vetapp.core.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vaccine extends BaseEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String code;
    @Column(nullable = false)
    private LocalDate protectionStartDate;
    @Column(nullable = false)
    private LocalDate protectionEndDate;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;
}
