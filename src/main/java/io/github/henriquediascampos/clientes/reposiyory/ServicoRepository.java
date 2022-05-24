package io.github.henriquediascampos.clientes.reposiyory;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.henriquediascampos.clientes.entity.Servico;

public interface ServicoRepository extends JpaRepository<Servico, UUID> {
    
}
