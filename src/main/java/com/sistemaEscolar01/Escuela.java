package com.sistemaEscolar01;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    List<Persona> PersonaList = new ArrayList<Persona>() {
        {
            // Alumnos
            add(new Alumno("José rmando", "ekj5b4jb64", 22, 86.9, "5A"));
            add(new Alumno("Armado", "vregerge", 25, 79, "3A"));
            add(new Alumno("Prado", "v46y5eh5e", 20, 80.8, "2B"));
            add(new Alumno("Leonardo", "th4h6", 18, 75.6, "1A"));

            // Maestros
            add(new Profesor("Dolores", "efrt5h676", 48, 356, "Fiscia 1"));
            add(new Profesor("Ricardo", "e3u3foir", 55, 434, "Quimica básica"));
            add(new Profesor("Dolores", "rbp2h22", 47, 322, "Idiomas extranjeros"));
        }
    };

    public void agregarPersona(List<Persona> lista, Persona p) {
        lista.add(p);
    }

    public void mostrarTodos() {
        for (Persona persona : PersonaList) {
            if (persona instanceof Profesor) {
                Profesor prof = (Profesor) persona;
                System.out.println(prof.mostrarInformacion());
            }else if(persona instanceof Alumno){
                Alumno alumno = (Alumno) persona;
                System.out.println(alumno.mostrarInformacion());
            }
        }
    }

    public void mostrarPromediosAlumnos() {
        double Promedio = 0;
        int CantidadAlumnos = 0;
        for (Persona persona : PersonaList) {
            if (persona instanceof Alumno) {
                Alumno prom = (Alumno) persona;
                Promedio += prom.promedio;
                CantidadAlumnos++;
            }
        }
        // Verificamos que haya al menos un alumno para evitar división por cero
        if (CantidadAlumnos > 0) {
            Promedio = Promedio / CantidadAlumnos;
            System.out.println("El promedio general es: " + Promedio);
        } else {
            System.out.println("No hay alumnos en la lista");
        }

    }

    public void mostrarSalariosProfesores() {
        System.out.println("Información de salarios de profesores");
        for (Persona persona : PersonaList) {
            if (persona instanceof Profesor) {
                Profesor prof = (Profesor) persona;
                System.out.println("Profesor: " + prof.nombre);
                System.out.println("Salario: " + prof.salario);
            }
        }

    }

    // Buscar por nombre
    public void buscarPersona(String nombre) {
        for (Persona p : PersonaList) {
            if (p.nombre.equalsIgnoreCase(nombre)) {
                System.out.println("Encontrado: " + p.mostrarInformacion());
                return;
            }
        }
        System.out.println("No se encontró a nadie con ese nombre.");
    }

    // Buscar por dni
    public void buscarPersonaPorDni(String dni) {
        for (Persona p : PersonaList) {
            if (p.dni.equalsIgnoreCase(dni)) {
                System.out.println("Encontrado: " + p.mostrarInformacion());
                return;
            }
        }
        System.out.println("No se encontró a nadie con ese DNI.");
    }


}
