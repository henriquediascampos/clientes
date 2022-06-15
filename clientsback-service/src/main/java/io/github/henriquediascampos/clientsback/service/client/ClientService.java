package io.github.henriquediascampos.clientsback.service.client;

import java.util.UUID;

import org.springframework.stereotype.Service;

import io.github.henriquediascampos.clientsback.entity.client.Client;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService extends AbstractService<Client, UUID>{
    // private ClientDAO dao;
}
