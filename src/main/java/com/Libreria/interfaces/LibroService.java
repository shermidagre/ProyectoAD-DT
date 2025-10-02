// src/main/java/com/tu/proyecto/interfaces/LibroService.java
package com.Libreria.interfaces;

import com.Libreria.entities.Libro;

public interface LibroService {
    Libro guardarLibro(Libro libro);
    Libro eliminarLibro(Long id);
}