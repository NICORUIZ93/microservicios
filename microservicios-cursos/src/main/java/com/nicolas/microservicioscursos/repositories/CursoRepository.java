package com.nicolas.microservicioscursos.repositories;

import com.nicolas.microservicioscursos.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
