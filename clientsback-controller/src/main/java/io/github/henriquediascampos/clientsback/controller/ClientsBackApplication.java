package io.github.henriquediascampos.clientsback.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"io.github.henriquediascampos"})
@EntityScan("io.github.henriquediascampos")
@EnableJpaRepositories("io.github.henriquediascampos")
public class ClientsBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientsBackApplication.class, args);
	}
}
