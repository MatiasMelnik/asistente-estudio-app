package com.estudioasistente.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "examenes")
public class Examen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    private String tipo; // parcial, final, mesa, etc.

    @ManyToOne
    private Materia materia;

    public Examen() {}

    public Long getId() { return id; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Materia getMateria() { return materia; }
    public void setMateria(Materia materia) { this.materia = materia; }
}
