package dev.patika.vetapp.service;

import dev.patika.vetapp.base.BaseService;
import dev.patika.vetapp.dto.AvailableDateRequest;
import dev.patika.vetapp.dto.AvailableDateResponse;
import dev.patika.vetapp.entity.AvailableDate;
import dev.patika.vetapp.mapper.AvailableDateMapper;
import dev.patika.vetapp.repository.AvailableDateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AvailableDateService extends BaseService<AvailableDate, AvailableDateRequest, AvailableDateResponse> {
    @Autowired
    public AvailableDateService(AvailableDateRepository availableDateRepository, AvailableDateMapper availableDateMapper) {
        super(AvailableDate.class, availableDateRepository, availableDateMapper, null);
    }
}
