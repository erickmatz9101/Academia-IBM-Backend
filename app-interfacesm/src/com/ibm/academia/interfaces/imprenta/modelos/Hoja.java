package com.ibm.academia.interfaces.imprenta.modelos;

public abstract class Hoja
{
    protected String contenido;

    public Hoja(String contenido) {
        this.contenido = contenido;
    }

    public abstract String imprimir();
}
