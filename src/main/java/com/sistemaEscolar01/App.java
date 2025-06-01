package com.sistemaEscolar01;

import java.util.ArrayList;
import java.util.List;
import com.sistemaEscolar01.Escuela;
public class App
{
    public static void main( String[] args )
    {
        Escuela esc1 = new Escuela();
        // Ejemplo de uso:
        esc1.agregarPersona(esc1.PersonaList, new Alumno("Maria", "abc123", 20, 90.5, "4A"));
       esc1.agregarPersona(esc1.PersonaList, new Profesor("Juan", "xyz789", 45, 400, "Matemáticas"));

        // Mostrar todos
        System.out.println("\n--- Lista completa ---");
        esc1.mostrarTodos();

        // Mostrar promedios
        System.out.println("\n--- Promedios de alumnos ---");
        esc1.mostrarPromediosAlumnos();

        // Mostrar salarios
        System.out.println("\n--- Salarios de profesores ---");
        esc1.mostrarSalariosProfesores();

        // Buscar personas
        System.out.println("\n--- Buscar por nombre ---");
        esc1.buscarPersona("Maria");

        System.out.println("\n--- Buscar por DNI ---");
        esc1.buscarPersonaPorDni("xyz789");
    }
}
