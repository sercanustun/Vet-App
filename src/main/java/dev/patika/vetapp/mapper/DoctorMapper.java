package dev.patika.vetapp.mapper;

import dev.patika.vetapp.core.BaseMapper;
import dev.patika.vetapp.dto.DoctorRequest;
import dev.patika.vetapp.dto.DoctorResponse;
import dev.patika.vetapp.entity.Doctor;
import org.mapstruct.Mapper;

@Mapper
public interface DoctorMapper extends BaseMapper<Doctor, DoctorRequest, DoctorResponse> {
}
