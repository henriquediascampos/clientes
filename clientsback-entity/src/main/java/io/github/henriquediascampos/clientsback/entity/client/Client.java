package io.github.henriquediascampos.clientsback.entity.client;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.hibernate.annotations.Where;

import io.github.henriquediascampos.clientsback.entity.abstracts.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Where(clause = "deleted=false")
public class Client extends AbstractEntity {

    @Column
    private String name;
    @Column
    private String cpf;
    @Column
    private String cnpj;

}