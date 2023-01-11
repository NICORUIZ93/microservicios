package com.nicolas.microservicios.app.usuarios.repositories;

import com.nicolas.microservicios.app.usuarios.entities.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
