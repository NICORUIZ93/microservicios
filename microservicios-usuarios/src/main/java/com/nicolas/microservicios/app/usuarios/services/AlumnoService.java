package com.nicolas.microservicios.app.usuarios.services;

import com.nicolas.microservicios.app.usuarios.entities.models.Alumno;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AlumnoService {

    Iterable<Alumno> findAll();

    Optional<Alumno> findById(long id);

    void deleteById(long id);

    Alumno save(Alumno alumno);
}
