package com.nicolas.microservicioscursos.controllers;

import com.nicolas.microservicioscursos.entities.Curso;
import com.nicolas.microservicioscursos.services.CursoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("cursos")
public class CursoController {
    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @PutMapping("/{id}")
    public ResponseEntity editar(@RequestBody Curso curso, @PathVariable Long id) {
        Optional<Curso> curso1 = cursoService.findById(id);
        if (!curso1.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Curso dbCurso = curso1.get();
        dbCurso.setNombre(curso.getNombre());
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoService.save(dbCurso));
    }
}
