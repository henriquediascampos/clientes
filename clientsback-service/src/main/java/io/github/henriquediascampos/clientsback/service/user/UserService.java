package io.github.henriquediascampos.clientsback.service.user;

import java.util.UUID;

import io.github.henriquediascampos.clientsback.entity.user.User;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractService;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class UserService extends AbstractService<User, UUID>{
}
