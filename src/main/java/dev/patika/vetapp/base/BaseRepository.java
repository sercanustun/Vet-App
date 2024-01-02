package dev.patika.vetapp.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository<E extends BaseEntity, ID> extends JpaRepository<E, ID>, JpaSpecificationExecutor<ID> {
}
