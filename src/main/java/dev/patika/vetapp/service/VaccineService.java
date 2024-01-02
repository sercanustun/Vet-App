package dev.patika.vetapp.service;

import dev.patika.vetapp.base.BaseService;
import dev.patika.vetapp.dto.VaccineRequest;
import dev.patika.vetapp.dto.VaccineResponse;
import dev.patika.vetapp.entity.Vaccine;
import dev.patika.vetapp.mapper.VaccineMapper;
import dev.patika.vetapp.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VaccineService extends BaseService<Vaccine, VaccineRequest, VaccineResponse> {
    @Autowired
    public VaccineService(VaccineRepository vaccineRepository, VaccineMapper vaccineMapper) {
        super(Vaccine.class, vaccineRepository, vaccineMapper, null);
    }
}
