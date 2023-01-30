package com.nicolas.microservicioscursos.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "CURSOS")
public class Curso {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nombre;
    @Column(name = "create_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    public void prePresist() {
        createAt = new Date();
    }

}
