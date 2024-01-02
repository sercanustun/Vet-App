package dev.patika.vetapp.entity;

import dev.patika.vetapp.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AvailableDate extends BaseEntity {
    @Column(nullable = false)
    private LocalDate date;
}
