package com.nicolas.microservicios.app.usuarios.controllers;

import com.nicolas.microservicios.app.usuarios.entities.models.Alumno;
import com.nicolas.microservicios.app.usuarios.services.AlumnoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("ALUMNOS")
public class AlumnoController {

    private final AlumnoService alumnoService;

    public AlumnoController(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping()
    private ResponseEntity<?> listar() {
        return ResponseEntity.ok().body(alumnoService.findAll());
    }

    @GetMapping("/{id}")
    private ResponseEntity<?> verAlumno(@PathVariable Long id) throws Exception {
        Optional<Alumno> alumno = Optional.ofNullable(alumnoService.findById(id).orElseThrow(() -> new Exception("No se encuentra el alumno")));
        return ResponseEntity.ok().body(alumno.get());
    }

    @PostMapping()
    private ResponseEntity<?> saveAlumno(@RequestBody Alumno alumno) {
        return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumno));
    }

    @DeleteMapping("/{id}")
    private void saveAlumno(@PathVariable Long id) {
        alumnoService.deleteById(id);
    }
}
