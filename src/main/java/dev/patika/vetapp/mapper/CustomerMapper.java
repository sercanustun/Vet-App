package dev.patika.vetapp.mapper;

import dev.patika.vetapp.base.BaseMapper;
import dev.patika.vetapp.dto.CustomerRequest;
import dev.patika.vetapp.dto.CustomerResponse;
import dev.patika.vetapp.entity.Customer;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper extends BaseMapper<Customer, CustomerRequest, CustomerResponse> {
}
