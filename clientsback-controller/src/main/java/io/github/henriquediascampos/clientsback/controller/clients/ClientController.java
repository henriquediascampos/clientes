package io.github.henriquediascampos.clientsback.controller.clients;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.henriquediascampos.clientsback.controller.abstracts.AbstractController;
import io.github.henriquediascampos.clientsback.entity.client.Client;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("client")
@AllArgsConstructor
public class ClientController extends AbstractController<Client, UUID> {

    // private ClientService clientService;

    // @PostMapping
    // public Client save(@RequestBody Client client) {
    //     return clientService.save(client);
    // }

}
