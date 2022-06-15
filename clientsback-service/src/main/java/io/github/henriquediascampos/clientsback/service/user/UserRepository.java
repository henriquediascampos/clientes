package io.github.henriquediascampos.clientsback.service.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.henriquediascampos.clientsback.entity.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}
