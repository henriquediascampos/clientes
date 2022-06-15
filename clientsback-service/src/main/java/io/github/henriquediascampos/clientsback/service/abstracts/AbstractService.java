package io.github.henriquediascampos.clientsback.service.abstracts;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.henriquediascampos.clientsback.common.translate.Translate;
import io.github.henriquediascampos.clientsback.entity.abstracts.AbstractEntity;

@Service
public abstract class AbstractService <T extends AbstractEntity, ID> {

    @Autowired(required = false)
    protected AbstractDAO<T, ID> dao;

    @Autowired
    protected Translate translate;
    public T findById(final UUID id) {
        return dao.findById(id);
    }

    public List<T> list(final Map<String, String> parameters) {
        return dao.findAll();
    }

    public T save(final T entity) {
        return dao.savaOrUpdate(entity);
    }

    public T update(final T entity) {
        return dao.savaOrUpdate(entity);
    }

    public boolean delete(final UUID id) {
        return dao.delete(id);
    }

}
