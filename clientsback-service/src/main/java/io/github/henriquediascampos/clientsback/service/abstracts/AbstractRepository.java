package io.github.henriquediascampos.clientsback.service.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

@NoRepositoryBean
@Transactional
public abstract interface AbstractRepository<T, ID> extends JpaRepository<T, ID> {

}
