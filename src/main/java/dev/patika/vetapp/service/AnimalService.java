package dev.patika.vetapp.service;

import dev.patika.vetapp.base.BaseService;
import dev.patika.vetapp.dto.AnimalRequest;
import dev.patika.vetapp.dto.AnimalResponse;
import dev.patika.vetapp.entity.Animal;
import dev.patika.vetapp.mapper.AnimalMapper;
import dev.patika.vetapp.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService extends BaseService<Animal, AnimalRequest, AnimalResponse> {
    @Autowired
    public AnimalService(AnimalRepository animalRepository, AnimalMapper animalMapper) {
        super(Animal.class, animalRepository, animalMapper, null);
    }
}
