package  io.github.henriquediascampos.clientsback.entity.abstracts;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;


@MappedSuperclass
@ComponentScan
@Getter @Setter
public abstract class AbstractAuditor implements Serializable {

    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    // private UUID id;
    // @Column(columnDefinition = "boolean default false")
    // private Boolean deleted;
    // @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    // private ZonedDateTime createdAt;
    // @Column
    // private ZonedDateTime updatedAt;
    // @Column
    // private UUID createdBy;
    // @Column
    // private UUID updatedBy;
}