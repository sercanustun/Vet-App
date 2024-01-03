package dev.patika.vetapp.controller;

import dev.patika.vetapp.dto.AvailableDateRequest;
import dev.patika.vetapp.dto.AvailableDateResponse;
import dev.patika.vetapp.service.AvailableDateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/availableDate")
@RequiredArgsConstructor
public class AvailableDateController {
    private final AvailableDateService availableDateService;

    @GetMapping
    public Page<AvailableDateResponse> getAllAvailableDates(
            @RequestParam(required = false, name = "filter") String rsqlFilter,
            @RequestParam(required = false, name = "range") String rangeStr,
            @RequestParam(required = false, name = "sort") String sortStr) {
        return availableDateService.getAll(rsqlFilter, rangeStr, sortStr);
    }

    @GetMapping("/{id}")
    public Optional<AvailableDateResponse> getAvailableDateById(@PathVariable("id") String id) {
        return availableDateService.get(id);
    }

    @PostMapping
    public AvailableDateResponse createAvailableDate(@Valid @RequestBody AvailableDateRequest request) {
        return availableDateService.create(request);
    }

    @PutMapping("/{id}")
    public AvailableDateResponse updateAvailableDate(@PathVariable(name = "id") String id, @Valid @RequestBody AvailableDateRequest request) {
        return availableDateService.update(request, id);
    }

    @DeleteMapping("/{id}")
    public void deleteAvailableDate(@PathVariable("id") String id) {
        availableDateService.delete(id);
    }

}
