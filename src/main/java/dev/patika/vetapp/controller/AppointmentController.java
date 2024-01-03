package dev.patika.vetapp.controller;

import dev.patika.vetapp.dto.AppointmentRequest;
import dev.patika.vetapp.dto.AppointmentResponse;
import dev.patika.vetapp.service.AppointmentService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/appointment")
@RequiredArgsConstructor
public class AppointmentController {
    private final AppointmentService appointmentService;

    @GetMapping
    public Page<AppointmentResponse> getAllAppointments(
            @RequestParam(required = false, name = "filter") String rsqlFilter,
            @RequestParam(required = false, name = "range") String rangeStr,
            @RequestParam(required = false, name = "sort") String sortStr) {
        return appointmentService.getAll(rsqlFilter, rangeStr, sortStr);
    }

    @GetMapping("/{id}")
    public Optional<AppointmentResponse> getAppointmentById(@PathVariable("id") String id) {
        return appointmentService.get(id);
    }

    @PostMapping
    public AppointmentResponse createAppointment(@Valid @RequestBody AppointmentRequest request) {
        return appointmentService.create(request);
    }

    @PutMapping("/{id}")
    public AppointmentResponse updateAppointment(@PathVariable(name = "id") String id, @Valid @RequestBody AppointmentRequest request) {
        return appointmentService.update(request, id);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointment(@PathVariable("id") String id) {
        appointmentService.delete(id);
    }

}
