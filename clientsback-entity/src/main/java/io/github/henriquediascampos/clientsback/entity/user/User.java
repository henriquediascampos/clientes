package io.github.henriquediascampos.clientsback.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
@EqualsAndHashCode(callSuper = false)
@Where(clause = "deleted=false")
@Table(name = "user_account")
public class User extends AbstractEntity {

    @Column(name = "name")
    private String username;
    private String password;
}
