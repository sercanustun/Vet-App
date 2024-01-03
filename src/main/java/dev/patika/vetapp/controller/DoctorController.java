package dev.patika.vetapp.controller;

import dev.patika.vetapp.dto.DoctorRequest;
import dev.patika.vetapp.dto.DoctorResponse;
import dev.patika.vetapp.service.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/doctor")
@RequiredArgsConstructor
public class DoctorController {
    private final DoctorService doctorService;

    @GetMapping
    public Page<DoctorResponse> getAllDoctors(
            @RequestParam(required = false, name = "filter") String rsqlFilter,
            @RequestParam(required = false, name = "range") String rangeStr,
            @RequestParam(required = false, name = "sort") String sortStr) {
        return doctorService.getAll(rsqlFilter, rangeStr, sortStr);
    }

    @GetMapping("/{id}")
    public Optional<DoctorResponse> getDoctorById(@PathVariable("id") String id) {
        return doctorService.get(id);
    }

    @PostMapping
    public DoctorResponse createDoctor(@Valid @RequestBody DoctorRequest request) {
        return doctorService.create(request);
    }

    @PutMapping("/{id}")
    public DoctorResponse updateDoctor(@PathVariable(name = "id") String id, @Valid @RequestBody DoctorRequest request) {
        return doctorService.update(request, id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable("id") String id) {
        doctorService.delete(id);
    }

}
