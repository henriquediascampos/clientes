package io.github.henriquediascampos.clientsback.service.client;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import io.github.henriquediascampos.clientsback.entity.client.Client;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class ClientDAO extends AbstractDAO<Client, UUID> {

    // private ClientRepository repository;

}
