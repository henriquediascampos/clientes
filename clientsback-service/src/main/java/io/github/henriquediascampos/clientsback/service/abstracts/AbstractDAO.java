package io.github.henriquediascampos.clientsback.service.abstracts;

import static java.util.Objects.nonNull;

import java.lang.reflect.ParameterizedType;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import io.github.henriquediascampos.clientsback.common.exceptions.BadRequestException;
import io.github.henriquediascampos.clientsback.entity.abstracts.AbstractEntity;
import lombok.Getter;

@Transactional
public abstract class AbstractDAO<T extends AbstractEntity, ID> {

    @PersistenceContext
    protected EntityManager entityManager;

    private final Class<T> clazz;

    @Getter
    @Autowired(required = false)
    protected JpaRepository<T, ID> repository;


    @SuppressWarnings("unchecked")
    public AbstractDAO() {
        this.clazz = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T savaOrUpdate(final T entity) {
        if (nonNull(entity.getId())) {
            return update(entity);
        } else {
            return save(entity);
        }
    }
    private T save(final T entity) {
        entity.setCreatedAt(ZonedDateTime.now(ZoneId.systemDefault()));
        entity.setDeleted(false);
        saveAndFlush(entity);
        return entity;
    }

    private T update(final T entity) {
        entity.setUpdatedAt(ZonedDateTime.now(ZoneId.systemDefault()));
        return mergeAndFlush(entity);
    }

    private void saveAndFlush(final T entity) {
        entityManager.persist(entity);
        entityManager.flush();
    }
    private T mergeAndFlush(final T entity) {
        final var persisted = entityManager.merge(entity);
        entityManager.flush();
        return  persisted;
    }

    @SuppressWarnings("unchecked")
    public T findById(final UUID uuid) {
        final var optional = getRepository().findById((ID) uuid);
        if (optional.isPresent()) {
            return clazz.cast(optional.get());
        }

        throw new BadRequestException("Patos nao encontrado");
	}

    public List<T> findAll() {
        final CriteriaQuery<T> query = entityManager.getCriteriaBuilder().createQuery(clazz);
        query.from(clazz);
        return entityManager.createQuery(query).getResultList();
    }

    public Query createQuery(final String alias) {
        return entityManager.createQuery(clazz.getSimpleName() + " " + alias);
    }

    public boolean delete(final UUID id) {
        final var entity = findById(id);
        entity.setUpdatedAt(ZonedDateTime.now(ZoneId.systemDefault()));
        entity.setDeleted(true);
        mergeAndFlush(entity);
        return true;
    }
}
