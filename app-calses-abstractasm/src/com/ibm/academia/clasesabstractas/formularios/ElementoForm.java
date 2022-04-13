package com.ibm.academia.clasesabstractas.formularios;

 abstract public class ElementoForm
{
    protected String valor;
    protected String nombre;

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this(); //Se crea el constructor vacio para crear un elemento a partir de el
        nombre = nombre;
    }

    //Generando solo el set de valor porque eso es lo que voy a modificar

    public void setValor(String valor) {
        this.valor = valor;
    }

     abstract public String dibujarHtml();


}
