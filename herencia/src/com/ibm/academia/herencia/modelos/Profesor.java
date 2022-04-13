package com.ibm.academia.herencia.modelos;

public class Profesor extends Persona
{
    private String asignatura;

    public Profesor() {
        System.out.println("Profesor: Inicializando el constructor....");
    }

    //Generando los constructores por herencia y con el atributo que es solo de la clase Profesor
    public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
