// src/main/java/com/tu/proyecto/controllers/LibroController.java
package com.Libreria.controllers;

import com.Libreria.interfaces.LibroService;
import com.Libreria.entities.Libro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private static final Logger logger = LoggerFactory.getLogger(LibroController.class);

    @Autowired
    private LibroService libroService;

    @PostMapping("/crear")
    public ResponseEntity<Libro> crearLibro(@RequestBody Libro libro) {
            logger.info("-----------------------\nRecibido request para crear libro: {}\n-----------------------", libro);
            Libro libroGuardado = libroService.guardarLibro(libro);
            logger.info("-----------------------\nLibro creado exitosamente: {}\n-----------------------", libroGuardado);
            return ResponseEntity.ok(libroGuardado);
    }
}