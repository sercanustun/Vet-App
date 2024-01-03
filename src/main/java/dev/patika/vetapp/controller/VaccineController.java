package dev.patika.vetapp.controller;

import dev.patika.vetapp.dto.VaccineRequest;
import dev.patika.vetapp.dto.VaccineResponse;
import dev.patika.vetapp.service.VaccineService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/vaccine")
@RequiredArgsConstructor
public class VaccineController {
    private final VaccineService vaccineService;

    @GetMapping
    public Page<VaccineResponse> getAllVaccines(
            @RequestParam(required = false, name = "filter") String rsqlFilter,
            @RequestParam(required = false, name = "range") String rangeStr,
            @RequestParam(required = false, name = "sort") String sortStr) {
        return vaccineService.getAll(rsqlFilter, rangeStr, sortStr);
    }

    @GetMapping("/{id}")
    public Optional<VaccineResponse> getVaccineById(@PathVariable("id") String id) {
        return vaccineService.get(id);
    }

    @PostMapping
    public VaccineResponse createVaccine(@Valid @RequestBody VaccineRequest request) {
        return vaccineService.create(request);
    }

    @PutMapping("/{id}")
    public VaccineResponse updateVaccine(@PathVariable(name = "id") String id, @Valid @RequestBody VaccineRequest request) {
        return vaccineService.update(request, id);
    }

    @DeleteMapping("/{id}")
    public void deleteVaccine(@PathVariable("id") String id) {
        vaccineService.delete(id);
    }

}
