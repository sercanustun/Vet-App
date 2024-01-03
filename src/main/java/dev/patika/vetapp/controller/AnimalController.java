package dev.patika.vetapp.controller;

import dev.patika.vetapp.dto.AnimalRequest;
import dev.patika.vetapp.dto.AnimalResponse;
import dev.patika.vetapp.service.AnimalService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/animal")
@RequiredArgsConstructor
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping
    public Page<AnimalResponse> getAllAnimals(
            @RequestParam(required = false, name = "filter") String rsqlFilter,
            @RequestParam(required = false, name = "range") String rangeStr,
            @RequestParam(required = false, name = "sort") String sortStr) {
        return animalService.getAll(rsqlFilter, rangeStr, sortStr);
    }

    @GetMapping("/{id}")
    public Optional<AnimalResponse> getAnimalById(@PathVariable("id") String id) {
        return animalService.get(id);
    }

    @PostMapping
    public AnimalResponse createAnimal(@Valid @RequestBody AnimalRequest request) {
        return animalService.create(request);
    }

    @PutMapping("/{id}")
    public AnimalResponse updateAnimal(@PathVariable(name = "id") String id, @Valid @RequestBody AnimalRequest request) {
        return animalService.update(request, id);
    }

    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable("id") String id) {
        animalService.delete(id);
    }

}
