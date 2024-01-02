package dev.patika.vetapp.repository;

import dev.patika.vetapp.base.BaseRepository;
import dev.patika.vetapp.entity.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends BaseRepository<Customer, String> {
}
