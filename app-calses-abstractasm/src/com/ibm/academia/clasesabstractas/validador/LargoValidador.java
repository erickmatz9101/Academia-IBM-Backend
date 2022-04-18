package com.ibm.academia.clasesabstractas.validador;

public class LargoValidador extends Validador {

    protected String mensaje = "El campo %s debe tener  minimo %d caracteres y maximo %d caracteres";
    private int minimo;
    private int maximo;

    public LargoValidador() {
    }

    public LargoValidador(int minimo, int maximo) {
        this.minimo = minimo;
        this.maximo = maximo;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;

    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {

        if (valor == null) {
            return true;
        }
        int largo = valor.length();
        return (largo >= minimo && largo <= maximo);
    }



}

/*En el caso de los menmsajes se usa %s cuando quiero validar un string y un %d cuando lo que quiero validar es un numero*/
