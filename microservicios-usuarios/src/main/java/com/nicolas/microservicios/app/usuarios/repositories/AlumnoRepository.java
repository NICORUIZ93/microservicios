package com.nicolas.microservicios.app.usuarios.repositories;

import com.nicolas.microservicios.app.usuarios.entities.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
