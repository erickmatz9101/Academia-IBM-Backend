package com.ibm.academia.clasesabstractas.formularios;

public class TextAreaForm extends ElementoForm
{

    private int filas;
    private int columnas;

    public TextAreaForm(String nombre) { //Impplementando el constructor de la clase padre
        super(nombre);
    }

    //Implementado el constructor de la clase padre y los atributos de la clase textarea
    public TextAreaForm(String nombre, int filas, int columnas) {
        super(nombre);
        this.filas = filas;
        this.columnas = columnas;
    }

    /*Generando getters y setters de filas y columnas*/

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" + this.nombre + "' cols='"
                + this.columnas + "' rows='" + this.filas + "'>"
                + this.valor + "</textarea>";
    }
}

/*Me mostrara el espacio que hay entra cada uno de los elementos*/