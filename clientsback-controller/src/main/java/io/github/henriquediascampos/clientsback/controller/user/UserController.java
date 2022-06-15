package io.github.henriquediascampos.clientsback.controller.user;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.henriquediascampos.clientsback.controller.abstracts.AbstractController;
import io.github.henriquediascampos.clientsback.entity.user.User;

@RestController
@RequestMapping("user")
public class UserController  extends AbstractController<User, UUID> {

}
