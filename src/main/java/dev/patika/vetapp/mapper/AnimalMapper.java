package dev.patika.vetapp.mapper;

import dev.patika.vetapp.base.BaseMapper;
import dev.patika.vetapp.dto.AnimalRequest;
import dev.patika.vetapp.dto.AnimalResponse;
import dev.patika.vetapp.entity.Animal;
import org.mapstruct.Mapper;

@Mapper
public interface AnimalMapper extends BaseMapper<Animal, AnimalRequest, AnimalResponse> {
}
