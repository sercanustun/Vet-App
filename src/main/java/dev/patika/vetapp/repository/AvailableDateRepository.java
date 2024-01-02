package dev.patika.vetapp.repository;

import dev.patika.vetapp.base.BaseRepository;
import dev.patika.vetapp.entity.AvailableDate;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailableDateRepository extends BaseRepository<AvailableDate, String> {
}
