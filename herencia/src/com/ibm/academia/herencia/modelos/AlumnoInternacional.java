package com.ibm.academia.herencia.modelos;

public class AlumnoInternacional extends Alumno
{
    private String pais;
    private Double notaIdiomas;

    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional: Inicializando el constructor....");
    }

    public AlumnoInternacional(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais) {
        super(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(Double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
}
