package com.ibm.academia.clasesabstractas;

import com.ibm.academia.clasesabstractas.formularios.ElementoForm;
import com.ibm.academia.clasesabstractas.formularios.InputForm;
import com.ibm.academia.clasesabstractas.formularios.SelectForm;
import com.ibm.academia.clasesabstractas.formularios.TextAreaForm;
import com.ibm.academia.clasesabstractas.formularios.seleccion.Opcion;

import java.util.Arrays;
import java.util.List;

public class MainForm {
    public static void main(String[] args) {

        InputForm nombreUsuario = new InputForm("Nombre usuario");
        InputForm contrasena = new InputForm("Contrasena", "password");
        InputForm correoElectronico = new InputForm("Correo Electrónico","email");
        InputForm edad = new InputForm("Edad", "number");

        TextAreaForm experiencia = new TextAreaForm("Experiencia",5,9);

        //Agregando las opciones de lenguaje de programacion
        SelectForm lenguajeProgramacion = new SelectForm("Lenguaje");
        Opcion java= new Opcion("1","Java");
        Opcion kotlin= new Opcion("2","Kotlin");
        Opcion php= new Opcion("3","PHP");

        java.setSeleccionado(true);

        lenguajeProgramacion.setOpciones(Arrays.asList(java,new Opcion("2","Python"),kotlin,php));

        nombreUsuario.setValor("erick.martinez");
        contrasena.setValor("123456");
        correoElectronico.setValor("erick_martinez9101");
        edad.setValor("30");
        experiencia.setValor("3 anios de experiencia");


        List<ElementoForm>elementos= Arrays.asList(nombreUsuario,contrasena,correoElectronico,edad,experiencia,lenguajeProgramacion);

        /*Recorriendo los elementos del array para que los muestre*/

        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
        });






    }
}
