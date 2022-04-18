package com.ibm.academia.clasesabstractas.validador;

public class NumeroValidador extends Validador
{

    protected String mensaje = "el campo %s debe ser un numero";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;

    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try{
            Integer.parseInt(valor);
            return  true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}

/*Linea 22 el vasteo que se hace es para poder convertir el dato de entrada en un numero ya que la entrar por teclado es de
* tipo String, por ello uso el parse.int para poder hacerlo y si me retorna un entero entonces en true*/
