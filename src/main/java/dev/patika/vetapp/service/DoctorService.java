package dev.patika.vetapp.service;

import dev.patika.vetapp.core.BaseService;
import dev.patika.vetapp.dto.DoctorRequest;
import dev.patika.vetapp.dto.DoctorResponse;
import dev.patika.vetapp.entity.Doctor;
import dev.patika.vetapp.mapper.DoctorMapper;
import dev.patika.vetapp.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService extends BaseService<Doctor, DoctorRequest, DoctorResponse> {
    @Autowired
    public DoctorService(DoctorRepository doctorRepository, DoctorMapper doctorMapper) {
        super(Doctor.class, doctorRepository, doctorMapper, null);
    }
}
