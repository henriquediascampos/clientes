package io.github.henriquediascampos.clientsback.service.user;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import io.github.henriquediascampos.clientsback.entity.user.User;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractDAO;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class UserDAO extends AbstractDAO<User, UUID> {
    private UserRepository userRepository;

    public Optional<User> findByUserName(String username) {
        return userRepository.findByUserName(username);
    }

}
