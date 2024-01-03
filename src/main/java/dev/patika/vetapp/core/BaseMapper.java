package dev.patika.vetapp.core;

import org.mapstruct.IterableMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.Named;

import java.util.Collection;
import java.util.List;

public interface BaseMapper<E extends BaseEntity, REQ, RES> {

    @Named("requestToEntity")
    E requestToEntity(REQ request);

    @Named("responseToEntity")
    E responseToEntity(RES response);

    @Named("entityToRequest")
    REQ entityToRequest(E entity);

    @Named("entityToResponse")
    RES entityToResponse(E entity);

    @Named("entityToListResponse")
    RES entityToListResponse(E entity);

    void update(@MappingTarget E targetEntity, REQ updatingRequest);

    @IterableMapping(qualifiedByName = "requestToEntity")
    List<E> requestsToEntities(Collection<REQ> requests);

    @IterableMapping(qualifiedByName = "responseToEntity")
    List<E> responsesToEntities(Collection<RES> responses);

    @IterableMapping(qualifiedByName = "entityToRequest")
    List<REQ> entitiesToRequests(Collection<E> entities);

    @IterableMapping(qualifiedByName = "entityToListResponse")
    List<RES> entityToListResponse(Collection<E> entities);
}