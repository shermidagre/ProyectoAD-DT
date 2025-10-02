// src/main/java/com/tu/proyecto/impl/LibroServiceImpl.java
package com.Libreria.services;

import com.Libreria.interfaces.LibroService;
import com.Libreria.entities.Libro;
import com.Libreria.repositories.LibroRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl implements LibroService {

    private static final Logger logger = LoggerFactory.getLogger(LibroServiceImpl.class);

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro guardarLibro(Libro libro) {
        logger.info("-----------------------\nIniciando guardado del libro: {}\n-----------------------", libro);
        Libro libroGuardado = libroRepository.save(libro);
        logger.info("-----------------------\nLibro guardado exitosamente: {}\n-----------------------", libroGuardado);
        return libroGuardado;
    }
    public Libro eliminarLibro(Long id) {
        logger.info("-----------------------\nIniciando eliminación del libro con ID: {}\n-----------------------", id);
        Libro libroAEliminar = libroRepository.findById(id).orElse(null);
        if (libroAEliminar != null) {
            libroRepository.delete(libroAEliminar);
            logger.info("-----------------------\nLibro eliminado exitosamente: {}\n-----------------------", libroAEliminar);
        } else {
            logger.warn("-----------------------\nNo se encontró el libro con ID: {}\n-----------------------", id);
        }
        return libroAEliminar;
    }
}