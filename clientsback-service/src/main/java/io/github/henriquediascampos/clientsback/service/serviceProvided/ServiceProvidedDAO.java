package io.github.henriquediascampos.clientsback.service.serviceProvided;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import io.github.henriquediascampos.clientsback.entity.serviceProvided.ServiceProvided;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class ServiceProvidedDAO extends AbstractDAO<ServiceProvided, UUID> {


}
