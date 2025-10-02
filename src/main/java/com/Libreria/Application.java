package com.Libreria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.Libreria.repositories")
@EntityScan(basePackages = "com.Libreria.entities")

public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}