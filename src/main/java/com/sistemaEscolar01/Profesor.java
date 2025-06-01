package com.sistemaEscolar01;

public  class Profesor extends  Persona{
    //Atributos
    protected double salario;
    protected String especialidad;

    
    public  Profesor(String _nombre, String _dni, int _edad, double _salario, String _especialidad){
        super(_nombre, _dni, _edad);
        this.salario = _salario;
        this.especialidad = _especialidad;

    }
    
    @Override
    public String mostrarInformacion() {
        return "Hola, soy " +nombre+
                "Tengo una edad de: "+edad + "Años" +
                "Mi dni es: "+dni + "" +
                "Tengo una especialidad en: "+especialidad+ " y cuento on un salario de: "+salario;
    }
}
