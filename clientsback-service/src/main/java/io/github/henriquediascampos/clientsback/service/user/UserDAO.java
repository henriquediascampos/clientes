package io.github.henriquediascampos.clientsback.service.user;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import io.github.henriquediascampos.clientsback.entity.user.User;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractDAO;

@Repository
public class UserDAO extends AbstractDAO<User, UUID> {
    @Autowired private UserRepository userRepository;

    public Optional<User> findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
