package io.github.henriquediascampos.clientes.reposiyory;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.henriquediascampos.clientes.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, UUID> {
    
}
