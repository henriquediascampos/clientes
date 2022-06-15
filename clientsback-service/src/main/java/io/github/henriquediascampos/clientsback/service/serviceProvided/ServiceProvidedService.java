package io.github.henriquediascampos.clientsback.service.serviceProvided;

import java.util.UUID;

import org.springframework.stereotype.Service;

import io.github.henriquediascampos.clientsback.entity.serviceProvided.ServiceProvided;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServiceProvidedService extends AbstractService<ServiceProvided, UUID>{
}
