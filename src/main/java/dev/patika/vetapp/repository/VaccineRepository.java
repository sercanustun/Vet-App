package dev.patika.vetapp.repository;

import dev.patika.vetapp.base.BaseRepository;
import dev.patika.vetapp.entity.Vaccine;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends BaseRepository<Vaccine, String> {
}
