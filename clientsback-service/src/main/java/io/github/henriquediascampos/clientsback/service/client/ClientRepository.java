package io.github.henriquediascampos.clientsback.service.client;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.henriquediascampos.clientsback.entity.client.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, UUID> {

}
