package io.github.henriquediascampos.clientsback.controller.serviceProvided;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.henriquediascampos.clientsback.controller.abstracts.AbstractController;
import io.github.henriquediascampos.clientsback.entity.serviceProvided.ServiceProvided;

@RestController
@RequestMapping("service-provided")
public class ServiceProvidedController  extends AbstractController<ServiceProvided, UUID> {

}
