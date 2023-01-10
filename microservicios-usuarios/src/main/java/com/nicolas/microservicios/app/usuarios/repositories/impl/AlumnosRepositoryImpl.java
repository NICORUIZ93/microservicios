package com.nicolas.microservicios.app.usuarios.repositories.impl;

import com.nicolas.microservicios.app.usuarios.entities.models.Alumno;
import com.nicolas.microservicios.app.usuarios.repositories.AlumnoRepository;
import com.nicolas.microservicios.app.usuarios.services.AlumnoService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlumnosRepositoryImpl implements AlumnoService {

    private final AlumnoRepository alumnosRepository;

    public AlumnosRepositoryImpl(AlumnoRepository alumnosRepository) {
        this.alumnosRepository = alumnosRepository;
    }

    @Override
    public Iterable<Alumno> findAll() {
        return alumnosRepository.findAll();
    }

    @Override
    public Optional<Alumno> findById(long id) {
        return alumnosRepository.findById(id);
    }

    @Override
    public void deleteById(long id) {
        alumnosRepository.deleteById(id);
    }

    @Override
    public Alumno save(Alumno alumno) {
        return alumnosRepository.save(alumno);
    }
}
