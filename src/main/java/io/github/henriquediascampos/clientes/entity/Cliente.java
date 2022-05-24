package io.github.henriquediascampos.clientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.github.henriquediascampos.clientes.abstracts.AbstractEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
public class Cliente extends AbstractEntity {

    @Column
    private String nome;
    @Column
    private String cpf;


}