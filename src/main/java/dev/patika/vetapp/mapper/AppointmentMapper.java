package dev.patika.vetapp.mapper;

import dev.patika.vetapp.base.BaseMapper;
import dev.patika.vetapp.dto.AppointmentRequest;
import dev.patika.vetapp.dto.AppointmentResponse;
import dev.patika.vetapp.entity.Appointment;
import org.mapstruct.Mapper;

@Mapper
public interface AppointmentMapper extends BaseMapper<Appointment, AppointmentRequest, AppointmentResponse> {
}
