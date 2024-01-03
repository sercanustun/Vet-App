package dev.patika.vetapp.mapper;

import dev.patika.vetapp.core.BaseMapper;
import dev.patika.vetapp.dto.AvailableDateRequest;
import dev.patika.vetapp.dto.AvailableDateResponse;
import dev.patika.vetapp.entity.AvailableDate;
import org.mapstruct.Mapper;

@Mapper
public interface AvailableDateMapper extends BaseMapper<AvailableDate, AvailableDateRequest, AvailableDateResponse> {
}
