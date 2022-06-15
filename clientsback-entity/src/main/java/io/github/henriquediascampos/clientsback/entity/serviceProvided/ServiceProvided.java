package io.github.henriquediascampos.clientsback.entity.serviceProvided;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Where;

import io.github.henriquediascampos.clientsback.entity.abstracts.AbstractEntity;
import io.github.henriquediascampos.clientsback.entity.client.Client;
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
@EqualsAndHashCode(callSuper = false)
@Where(clause = "deleted=false")
@Table(name = "user_account")
public class ServiceProvided extends AbstractEntity {

    @Column
    private String description;
    @Column
    private BigDecimal value;

    @ManyToOne
    @JoinColumn( name = "client_id", referencedColumnName = "id")
    private Client cliente;
}