package dev.patika.vetapp.repository;

import dev.patika.vetapp.core.BaseRepository;
import dev.patika.vetapp.entity.Appointment;
import dev.patika.vetapp.entity.Doctor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends BaseRepository<Appointment, String> {

    List<Appointment> findAllByDoctor(Doctor doctor);

}
