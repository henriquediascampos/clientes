package io.github.henriquediascampos.clientsback.service.user;

import java.util.UUID;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.github.henriquediascampos.clientsback.entity.user.User;
import io.github.henriquediascampos.clientsback.service.abstracts.AbstractService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService extends AbstractService<User, UUID> implements UserDetailsService {

    private UserDAO userDAO;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDAO.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("Usuário nao encontrado!") );
    }
}
