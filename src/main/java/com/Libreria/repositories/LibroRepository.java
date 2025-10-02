package com.Libreria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Libreria.entities.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
