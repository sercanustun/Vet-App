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

    private final VaccineRepository vaccineRepository;
    private final AnimalService aimalService;

    @Autowired
    public VaccineService(VaccineRepository vaccineRepository, VaccineMapper vaccineMapper, AnimalService aimalService) {
        super(Vaccine.class, vaccineRepository, vaccineMapper, null);
        this.vaccineRepository = vaccineRepository;
        this.aimalService = aimalService;
    }

    @Override
    public VaccineResponse create(VaccineRequest request) {
        var isSameVaccineExist = vaccineRepository.findAllByAnimalIdAndCodeAndNameAndProtectionEndDateAfter(request.getAnimal().getId(), request.getCode(), request.getName(), request.getProtectionStartDate());

        if (isSameVaccineExist.isPresent()) {
            throw new IllegalArgumentException("This vaccine already exists!");
        }

        return super.create(request);
    }

}
