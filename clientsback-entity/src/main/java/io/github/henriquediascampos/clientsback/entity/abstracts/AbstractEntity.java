package  io.github.henriquediascampos.clientsback.entity.abstracts;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.context.annotation.ComponentScan;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@ComponentScan
@Getter @Setter
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(columnDefinition = "boolean default false")
    private Boolean deleted;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private ZonedDateTime createdAt;
    @Column
    private ZonedDateTime updatedAt;
    @Column(length = 255)
    private String createdBy;
    @Column(length = 255)
    private String updatedBy;
}