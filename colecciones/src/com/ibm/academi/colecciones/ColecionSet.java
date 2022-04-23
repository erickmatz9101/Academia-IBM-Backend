package com.ibm.academi.colecciones;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ColecionSet {
    public static void main(String[] args) {

        Set miSet = new HashSet();

        /*Agregando elementos al Set*/

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");

        /*Recorriendo el Set por medio de una lambda*/

        miSet.forEach(e->{
            System.out.println("Lambda: "+e);
        });


        /*Se puede crear un metodo generico que me permita poder recorrer las colecciones sin volvelo a escribir (Polimorfismo)*/

        /*public static void imprimir(Collection collection){

            collection.foreach(e->{
                System.out.println(e);
            });*/

        }

    }


/*No guardan un orden al momento de mandarlas a llamar */
