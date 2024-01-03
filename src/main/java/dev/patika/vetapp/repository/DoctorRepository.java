package dev.patika.vetapp.repository;

import dev.patika.vetapp.core.BaseRepository;
import dev.patika.vetapp.entity.Doctor;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends BaseRepository<Doctor, String> {
}
