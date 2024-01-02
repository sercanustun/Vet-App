package dev.patika.vetapp.base;

import dev.patika.vetapp.exception.EntityNotFoundException;
import io.github.perplexhub.rsql.RSQLJPASupport;
import jakarta.persistence.criteria.JoinType;
import lombok.val;
import org.json.JSONArray;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public abstract class BaseService<E extends BaseEntity, REQ, RES> {

    private final Class<E> entityClass;
    private final BaseRepository<E, String> repository;
    private final BaseMapper<E, REQ, RES> mapper;
    private Map<String, JoinType> joinHints = new HashMap<>();

    /**
     * @param joinHints Bazi entity'lerde default cross join yerine left join vb. yapilmak istenebilir
     *                  Bu durumlarda entity bunu joinHints'de belirtebilir
     */
    public BaseService(Class<E> entityClass, BaseRepository<E, String> repository,
                       BaseMapper<E, REQ, RES> mapper,
                       @Nullable Map<String, JoinType> joinHints) {
        this.entityClass = entityClass;
        this.repository = repository;
        this.mapper = mapper;

        if (joinHints != null) {
            this.joinHints = joinHints;
        }
    }


    public RES create(REQ request) throws IllegalArgumentException, OptimisticLockingFailureException {
        var entity = mapper.requestToEntity(request);

        entity = repository.save(entity);
        val response = mapper.entityToResponse(entity);

        return response;
    }

    public RES update(REQ request, String id)
            throws IllegalArgumentException, OptimisticLockingFailureException, EntityNotFoundException {
        val optDbEntity = repository.findById(id);

        if (optDbEntity.isEmpty()) {
            throw new EntityNotFoundException(id, request);
        }

        var entity = optDbEntity.get();
        mapper.update(entity, request);

        entity = repository.save(entity);
        val response = mapper.entityToResponse(entity);

        return response;
    }


    public Optional<RES> get(String id) throws EntityNotFoundException {

        var optEntity = getOptEntity(id);

        Optional<RES> response = Optional.empty();
        if (optEntity.isPresent()) {
            response = Optional.of(mapper.entityToResponse(optEntity.get()));
        }
        return response;
    }

    public Optional<E> getOptEntity(String id) throws EntityNotFoundException {
        if (!StringUtils.hasText(id)) {
            throw new IllegalArgumentException("get operasyonlari icin null olmayan bir id saglanmalidir!");
        }

        return repository.findById(id);
    }


    public Page<RES> getAll(String rsqlFilter, String rangeStr, String sortStr) {

        Specification specification = RSQLJPASupport
                .toSpecification(rsqlFilter, true, null, joinHints)
                .and(RSQLJPASupport.toSort(sortStr));


        Page<E> page = repository.findAll(specification, transformJsonRangeToPageable(rangeStr));
        val response = new PageImpl(mapper.entityToListResponse(page.getContent()), page.getPageable(),
                page.getTotalElements());

        return response;
    }

    public void delete(String id) throws EntityNotFoundException {
        if (!StringUtils.hasText(id)) {
            throw new IllegalArgumentException("delete operasyonlari icin null olmayan bir id saglanmalidir!");
        }

        val optDbEntity = repository.findById(id);

        if (optDbEntity.isEmpty()) {
            throw new EntityNotFoundException(id, entityClass);
        }
        repository.delete(optDbEntity.get());
    }


    private Pageable transformJsonRangeToPageable(@Nullable String rangeStr) {
        if (!StringUtils.hasText(rangeStr)) {
            rangeStr = "[]";
        }
        JSONArray range = new JSONArray(rangeStr);

        int page = 0;
        int size = Integer.MAX_VALUE;
        if (range.length() == 2) {
            page = (Integer) range.get(0);
            size = (Integer) range.get(1);
        }

        return PageRequest.of(page, size);
    }


}
