package dev.patika.vetapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String id) {
        super("%s id'li entity bulunamadi!".formatted(id));
    }

    public EntityNotFoundException(String id, Class entityClass) {
        super("%s id'li %s veritabaninda bulunamadi!"
                .formatted(id, entityClass == null ? "entity" : entityClass.getSimpleName()));
    }

    public EntityNotFoundException(String id, Object entity) {
        super("%s id'li %s veritabaninda bulunamadi!"
                .formatted(id, entity == null ? "entity" : entity.getClass().getSimpleName()));
    }
}
