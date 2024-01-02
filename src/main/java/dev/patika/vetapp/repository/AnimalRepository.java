package dev.patika.vetapp.repository;

import dev.patika.vetapp.base.BaseRepository;
import dev.patika.vetapp.entity.Animal;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends BaseRepository<Animal, String> {
}
