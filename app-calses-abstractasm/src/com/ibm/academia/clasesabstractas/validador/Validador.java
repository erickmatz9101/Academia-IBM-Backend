package com.ibm.academia.clasesabstractas.validador;

public abstract class Validador {
    protected String mensaje;

    public abstract void setMensaje(String mensaje);
    public abstract String getMensaje();
    public abstract boolean esValido(String valor);

    }

