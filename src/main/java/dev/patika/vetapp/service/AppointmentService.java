package dev.patika.vetapp.service;

import dev.patika.vetapp.base.BaseService;
import dev.patika.vetapp.dto.AppointmentRequest;
import dev.patika.vetapp.dto.AppointmentResponse;
import dev.patika.vetapp.entity.Appointment;
import dev.patika.vetapp.mapper.AppointmentMapper;
import dev.patika.vetapp.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService extends BaseService<Appointment, AppointmentRequest, AppointmentResponse> {
    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository, AppointmentMapper appointmentMapper) {
        super(Appointment.class, appointmentRepository, appointmentMapper, null);
    }
}
