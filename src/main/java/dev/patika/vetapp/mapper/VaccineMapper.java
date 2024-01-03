package dev.patika.vetapp.mapper;

import dev.patika.vetapp.core.BaseMapper;
import dev.patika.vetapp.dto.VaccineRequest;
import dev.patika.vetapp.dto.VaccineResponse;
import dev.patika.vetapp.entity.Vaccine;
import org.mapstruct.Mapper;

@Mapper
public interface VaccineMapper extends BaseMapper<Vaccine, VaccineRequest, VaccineResponse> {
}
