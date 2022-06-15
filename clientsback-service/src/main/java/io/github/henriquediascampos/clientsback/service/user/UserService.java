package io.github.henriquediascampos.clientsback.service.user;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.github.henriquediascampos.clientsback.entity.user.User;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractService;
import lombok.RequiredArgsConstructor;

@Service
public class UserService extends AbstractService<User, UUID> implements UserDetailsService {

    @Autowired private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final var user = userDAO.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Usuário nao encontrado!") );
        return org.springframework.security.core.userdetails.User.builder()
            .username(user.getUsername())
            .password(user.getPassword())
            .roles("USER")
            .build();
    }
}
