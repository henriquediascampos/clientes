package io.github.henriquediascampos.clientsback.controller.abstracts;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.github.henriquediascampos.clientsback.entity.abstracts.AbstractEntity;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractService;

public abstract class AbstractController<T extends AbstractEntity, ID> {
    @Autowired(required = false)
    private AbstractService<T, ID> service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<T> list(@RequestParam(required = false) final Map<String, String> parameters) {
        return service.list(parameters);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public T findById(@PathVariable final String id) {
        return service.findById(UUID.fromString(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public T save(@RequestBody @Valid final T entity) {
        return service.save(entity);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public T update(@RequestBody final T entity) {
        return service.update(entity);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public boolean delete(@RequestBody final String id) {
        return service.delete(UUID.fromString(id));
    }
}
