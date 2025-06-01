package com.sistemaEscolar01;

public abstract class Persona {
    // Atributos
    protected  String nombre;
    protected String dni; //
    protected  int edad;

    public Persona(String _nombre, String _dni, int _edad){
        this.nombre = _nombre;
        this.dni = _dni;
        this.edad = _edad;
    }

    // Métodos
    public void saludar(){
        System.out.println("Hola, buen día: "+nombre);
    }

    public abstract String mostrarInformacion();
}


