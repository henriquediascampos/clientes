package io.github.henriquediascampos.clientsback.service.serviceProvided;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.henriquediascampos.clientsback.entity.serviceProvided.ServiceProvided;

@Repository
public interface ServiceProvidedRepository extends JpaRepository<ServiceProvided, UUID> {

}
