package com.ibm.academia.herencia.modelos;

public class Alumno extends Persona
{
    private String institucion;
    private Double notaMatematicas;
    private Double notaCastellano;
    private Double notaHistoria;

    public Alumno() { //Constructor vacio
        System.out.println("Alumno: Inicializando el constructor....");
    }

    public Alumno(String nombre, String apellido) { //Heredando el constructor de la clase padre
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, Integer edad, String institucion) { //Hereadando el segundo constructor del padre y tomaando 1 atributo de la clase Alumno
        super(nombre, apellido, edad);
        this.institucion = institucion;
    }

    //Heredando el constructor de la clase padre(Persona) y agregando todos los atributos de la clase hijo(Alumno)
    public Alumno(String nombre, String apellido, Integer edad, String institucion, Double notaMatematicas, Double notaCastellano, Double notaHistoria) {
        super(nombre, apellido, edad);
        this.institucion = institucion;
        this.notaMatematicas = notaMatematicas;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public Double getNotaMatematicas() {
        return notaMatematicas;
    }

    public void setNotaMatematicas(Double notaMatematicas) {
        this.notaMatematicas = notaMatematicas;
    }

    public Double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(Double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public Double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(Double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }
}
