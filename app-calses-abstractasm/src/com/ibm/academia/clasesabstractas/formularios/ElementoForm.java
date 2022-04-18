package com.ibm.academia.clasesabstractas.formularios;

import com.ibm.academia.clasesabstractas.validador.Validador;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm
{
    protected String valor;
    protected String nombre;
    private List<Validador>validadores;
    private List<String> errores;

    public ElementoForm() {
        this.validadores=new ArrayList<>(); //Inicializando la lista de validador
        this.errores= new ArrayList<>();//Inicializando la lista de errores
    }

    public ElementoForm(String nombre) {
        this(); //Se crea el constructor vacio para crear un elemento a partir de el
        nombre = nombre;
    }

    public List<String> getErrores() {
        return errores;
    }

    //Metodo que va agregando los elementos a la lista de manera mas rapida

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;

    }

    //Generando solo el set de valor porque eso es lo que voy a modificar

    public void setValor(String valor) {
        this.valor = valor;
    }


     abstract public String dibujarHtml();


}

/*Sino se inicaliza la lista no puedo guardar los valores por ello genero el construtor para poder hacer uso de ellas */
