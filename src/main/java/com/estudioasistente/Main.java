package com.estudioasistente;

import com.estudioasistente.dao.*;
import com.estudioasistente.model.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        MateriaDAO materiaDAO = new MateriaDAO();
        TareaDAO tareaDAO = new TareaDAO();
        ExamenDAO examenDAO = new ExamenDAO();

        Materia m = new Materia();
        m.setNombre("Programación");
        materiaDAO.guardar(m);
        Tarea t = new Tarea();
        t.setDescripcion("TP de POO");
        t.setFechaEntrega(LocalDate.of(2025, 12, 5));
        t.setMateria(m);
        tareaDAO.guardar(t);

        Examen e = new Examen();
        e.setTipo("Final");
        e.setFecha(LocalDate.of(2025, 12, 10));
        e.setMateria(m);
        examenDAO.guardar(e);

        System.out.println("Datos guardados correctamente.");
    }
}
