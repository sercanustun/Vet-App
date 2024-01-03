package dev.patika.vetapp.repository;

import dev.patika.vetapp.core.BaseRepository;
import dev.patika.vetapp.entity.Vaccine;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface VaccineRepository extends BaseRepository<Vaccine, String> {

    Optional<Vaccine> findAllByAnimalIdAndCodeAndNameAndProtectionEndDateAfter(String animalId, String code, String name, LocalDate protectionStartDate);

}
