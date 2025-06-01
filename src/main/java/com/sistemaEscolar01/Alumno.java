package com.sistemaEscolar01;

public class Alumno extends Persona{
    protected double promedio;
    protected String grado;
    
    public Alumno(String _nombre, String _dni, int _edad, double _promedio, String _grado){
        super(_nombre, _dni,_edad);
        this.promedio = _promedio;
        this.grado = _grado;
    }
    
    @Override
    public String mostrarInformacion() {
        return "Hola, soy " +nombre+
                "Tengo una edad de: "+edad + "Años" +
                "Mi dni es: "+dni + "" +
                "Me localizo en "+grado+ ", con un promedio de: "+promedio;
    }
}
