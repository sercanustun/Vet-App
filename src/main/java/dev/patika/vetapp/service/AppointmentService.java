package dev.patika.vetapp.service;

import dev.patika.vetapp.base.BaseService;
import dev.patika.vetapp.dto.AppointmentRequest;
import dev.patika.vetapp.dto.AppointmentResponse;
import dev.patika.vetapp.entity.Appointment;
import dev.patika.vetapp.entity.AvailableDate;
import dev.patika.vetapp.mapper.AppointmentMapper;
import dev.patika.vetapp.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AppointmentService extends BaseService<Appointment, AppointmentRequest, AppointmentResponse> {

    private final DoctorService doctorService;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository, AppointmentMapper appointmentMapper, DoctorService doctorService) {
        super(Appointment.class, appointmentRepository, appointmentMapper, null);
        this.doctorService = doctorService;
    }

    @Override
    public AppointmentResponse create(AppointmentRequest request) {

        var doctor = doctorService.getOptEntity(request.getDoctor().getId());

        if (doctor.isEmpty()) {
            throw new IllegalArgumentException("Doctor not found!");
        }

        List<LocalDate> doctorsAvailableDates = doctor.get().getAvailableDates().stream().map(AvailableDate::getDate).toList();

        if (!doctorsAvailableDates.contains(request.getAppointmentDate().toLocalDate())) {
            throw new IllegalArgumentException("Doctor is not available on this date!");
        }

        List<LocalDateTime> doctorsAppointmentDates = doctor.get().getAppointments().stream().map(Appointment::getAppointmentDate).toList();

        if (doctorsAppointmentDates.contains(request.getAppointmentDate())) {
            throw new IllegalArgumentException("Doctor is not available on this date!");
        }

        return super.create(request);
    }
}
