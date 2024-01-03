package dev.patika.vetapp.controller;

import dev.patika.vetapp.dto.CustomerRequest;
import dev.patika.vetapp.dto.CustomerResponse;
import dev.patika.vetapp.service.CustomerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public Page<CustomerResponse> getAllCustomers(
            @RequestParam(required = false, name = "filter") String rsqlFilter,
            @RequestParam(required = false, name = "range") String rangeStr,
            @RequestParam(required = false, name = "sort") String sortStr) {
        return customerService.getAll(rsqlFilter, rangeStr, sortStr);
    }

    @GetMapping("/{id}")
    public Optional<CustomerResponse> getCustomerById(@PathVariable("id") String id) {
        return customerService.get(id);
    }

    @PostMapping
    public CustomerResponse createCustomer(@Valid @RequestBody CustomerRequest request) {
        return customerService.create(request);
    }

    @PutMapping("/{id}")
    public CustomerResponse updateCustomer(@PathVariable(name = "id") String id, @Valid @RequestBody CustomerRequest request) {
        return customerService.update(request, id);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") String id) {
        customerService.delete(id);
    }

}
